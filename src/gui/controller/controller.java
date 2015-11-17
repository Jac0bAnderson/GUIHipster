package gui.controller;

import gui.model.Hipster;
import gui.view.hipFrame;
import gui.view.hipPanel;

public class controller 
{

private hipFrame baseFrame;	
private Hipster firstHipster;
	
	public controller()
	{
		firstHipster = new Hipster();
		baseFrame = new hipFrame(this);
	}
	
	
	public void start()
{
String myName = baseFrame.getResponse("What your name?");
firstHipster.setName(myName);
baseFrame.setTitle(myName + "'s Hipster Project");


}
public Hipster getFirstHipster()
{
	return firstHipster;
}
public hipFrame getBaseFrame()
{
	return baseFrame;
}

}
