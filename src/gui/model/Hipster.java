package gui.model;

public class Hipster 
{
private String name;
private String [] hipsterPhrases;

public Hipster()
{
	this.name = "Kay L. El";
	this.hipsterPhrases = new String[4];
	setupArray();
	
}

private void setupArray()
{
	hipsterPhrases[0] ="i only eat Kale";
	hipsterPhrases[1]="organic";
	hipsterPhrases[2]="I only work at standing offices";
	hipsterPhrases[3]="I only program using a typewriter then giving the paper  to someone with a computer";
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String[] getHipsterPhrases() {
	return hipsterPhrases;
}

public void setHipsterPhrases(String[] hipsterPhrases) {
	this.hipsterPhrases = hipsterPhrases;
}
}
