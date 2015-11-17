package gui.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import gui.controller.controller;

public class hipFrame extends JFrame
{

	private hipPanel basePanel;
	private controller baseController;
	
	public hipFrame(controller baseController)
	{
		this.baseController = baseController;
		basePanel = new hipPanel(baseController);
		setupFrame();
	}
	
	public String getResponse(String prompt)
	{
		String response = JOptionPane.showInputDialog(this, prompt);
		return response;
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(500,500);
		this.setVisible(true);
		this.setTitle("I only eat kale");
	}
	
	public controller getBasecontroller()
	{
		return baseController;
	}
	public void setBaseController(controller baseController)
	{
		this.baseController = baseController;
	}
	
}

