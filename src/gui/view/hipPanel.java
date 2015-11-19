package gui.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;

import gui.controller.controller;

public class hipPanel extends JPanel
{
private controller baseController;
private SpringLayout baseLayout;
private JComboBox <String> phraseComboBox;

public hipPanel(controller baseController)
{
	this.baseController = baseController;
	baseLayout = new SpringLayout();
	phraseComboBox = new JComboBox<String>();
	
	
	setupComboBox();
	setupPanel();
	setupLayout();
	setupListeners();
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
}
private void setupLayout()
{
	baseLayout.putConstraint(SpringLayout.NORTH, phraseComboBox, 31, SpringLayout.NORTH, this);
	baseLayout.putConstraint(SpringLayout.WEST, phraseComboBox, 23, SpringLayout.WEST, this);
}

private void setupListeners()
{
	//changes colors when a selection is made
	phraseComboBox.addActionListener(new ActionListener()
	{
	public void actionPerformed(ActionEvent selection)
	{
		int red=(int) (Math.random()*256);
		int green= (int) (Math.random()*256);
		int blue=(int) (Math.random()*256);
		setBackground(new Color(red, green, blue));
		String updatedTitle = phraseComboBox.getSelectedItem().toString();
		baseController.getBaseFrame().setTitle(updatedTitle);
	}
		
	});
}




}
