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
	hipsterPhrases[0] ="i only eat food bough from whole foods";
	hipsterPhrases[1]="organic";
	hipsterPhrases[2]="I only work at standing offices";
	hipsterPhrases[3]="01101011 01100001 01101100 01100101";
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
