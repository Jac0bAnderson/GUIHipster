package gui.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.*;

import gui.controller.controller;
import gui.model.Book;
import gui.model.Hipster;

public class hipPanel extends JPanel
{
private controller baseController;
private SpringLayout baseLayout;
private JComboBox <String> phraseComboBox;
private JLabel bookPageCountLabel;
private JLabel bookAuthorLabel;
private JLabel bookSubjectLabel;
private JLabel bookTitleLabel;
private JLabel bookPriceLabel;
private JButton changeBookButton;
private int maxClicks;
private int startClick;

public hipPanel(controller baseController)
{
	this.baseController = baseController;
	baseLayout = new SpringLayout();
	bookPageCountLabel = new JLabel("The page count");
	bookAuthorLabel = new JLabel("The Author");
	
	bookSubjectLabel = new JLabel("The subject");
	
	bookTitleLabel = new JLabel("The title");
	
	bookPriceLabel = new JLabel("The price");
	
	changeBookButton = new JButton("Change books");
	
	phraseComboBox = new JComboBox<String>();
	maxClicks = baseController.getFirstHipster().getHipsterBooks().length;
	setupComboBox();
	setupPanel();
	setupLayout();
	setupListeners();
	Color();
}



private void setupComboBox()
{
	String [] phrases = baseController.getFirstHipster().getHipsterPhrases();
	DefaultComboBoxModel phraseModel = new DefaultComboBoxModel(phrases);
	phraseComboBox.setModel(phraseModel);
}

private void setupPanel()
{
this.setLayout(baseLayout);
this.setBackground(Color.ORANGE);
this.add(phraseComboBox);
this.add(bookPageCountLabel);
this.add(bookAuthorLabel);
this.add(bookSubjectLabel);
this.add(bookTitleLabel);
this.add(bookPriceLabel);
this.add(changeBookButton);
}
private void setupLayout()
{
	baseLayout.putConstraint(SpringLayout.NORTH, phraseComboBox, 31, SpringLayout.NORTH, this);
	baseLayout.putConstraint(SpringLayout.WEST, phraseComboBox, 23, SpringLayout.WEST, this);
	baseLayout.putConstraint(SpringLayout.WEST, changeBookButton, 10, SpringLayout.WEST, this);
	baseLayout.putConstraint(SpringLayout.NORTH, bookAuthorLabel, 147, SpringLayout.NORTH, this);
	baseLayout.putConstraint(SpringLayout.WEST, bookAuthorLabel, 0, SpringLayout.WEST, bookPageCountLabel);
	baseLayout.putConstraint(SpringLayout.EAST, bookSubjectLabel, -166, SpringLayout.EAST, this);
	baseLayout.putConstraint(SpringLayout.NORTH, bookPageCountLabel, 6, SpringLayout.SOUTH, bookSubjectLabel);
	baseLayout.putConstraint(SpringLayout.SOUTH, bookSubjectLabel, -112, SpringLayout.SOUTH, this);
	baseLayout.putConstraint(SpringLayout.WEST, bookTitleLabel, 0, SpringLayout.WEST, bookPageCountLabel);
	baseLayout.putConstraint(SpringLayout.SOUTH, bookTitleLabel, -6, SpringLayout.NORTH, bookAuthorLabel);
	baseLayout.putConstraint(SpringLayout.NORTH, bookPriceLabel, 5, SpringLayout.SOUTH, bookPageCountLabel);
	baseLayout.putConstraint(SpringLayout.WEST, bookPriceLabel, 0, SpringLayout.WEST, bookPageCountLabel);
	baseLayout.putConstraint(SpringLayout.WEST, bookPageCountLabel, 67, SpringLayout.EAST, changeBookButton);
	baseLayout.putConstraint(SpringLayout.SOUTH, changeBookButton, -81, SpringLayout.SOUTH, this);
}

private void setupListeners()
{
	//changes colors when a selection is made
	phraseComboBox.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent selection)
	{
		Color();
		String updatedTitle = phraseComboBox.getSelectedItem().toString();
		baseController.getBaseFrame().setTitle(updatedTitle);
	}
		
	});
	
	changeBookButton.addActionListener(new ActionListener()
	{
		public void actionPerformed(ActionEvent click)
		{
			Color();
			Book [] tempBooks = baseController.getFirstHipster().getHipsterBooks();
			if(startClick < maxClicks)
			{
				bookSubjectLabel.setText("Book subject: " + tempBooks[startClick].getSubject());
				bookAuthorLabel.setText("Book author:" + tempBooks[startClick].getAuthor());
				bookTitleLabel.setText("Book title: " + tempBooks[startClick].getTitle());
				bookPageCountLabel.setText("Book pages: "+ tempBooks[startClick].getPageCount());
				bookPriceLabel.setText("Book price: " + tempBooks[startClick].getPrice());
				startClick++;
			}
			else
			{
				startClick = 0;
				bookSubjectLabel.setText("Book subject: ");
				bookAuthorLabel.setText("Book author: ");
				bookTitleLabel.setText("Book title: ");
				bookPageCountLabel.setText("Book pages: ");
				bookPriceLabel.setText("Book price: ");
				
	
			}
		}
	});
}
private void Color()
{
	int red=(int) (Math.random()*256);
	int green= (int) (Math.random()*256);
	int blue=(int) (Math.random()*256);
	setBackground(new Color(red, green, blue));
	

}



}
