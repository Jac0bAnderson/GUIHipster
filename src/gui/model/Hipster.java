package gui.model;

public class Hipster 
{
private String name;
private String [] hipsterPhrases;
private Book [] hipsterBooks;

public Book[] getHipsterBooks() {
	return hipsterBooks;
}

public void setHipsterBooks(Book[] hipsterBooks) {
	this.hipsterBooks = hipsterBooks;
}

public Hipster()
{
	this.name = "Kay L. El";
	this.hipsterPhrases = new String[4];
	this.hipsterBooks = new Book[3];
	setupArray();
	setupBooks();
}

private void setupArray()
{
	hipsterPhrases[0] ="i only eat food bough from whole foods";
	hipsterPhrases[1]="organic";
	hipsterPhrases[2]="I only work at standing offices";
	hipsterPhrases[3]="01101011 01100001 01101100 01100101";
}

private void setupBooks()
{
	Book firstBook, secondBook, thirdBook;
	firstBook = new Book();
	firstBook.setAuthor("Harlan Ellison");
	firstBook.setTitle("I Have No Mouth, and I Must Scream");
	firstBook.setSubject("Science Fiction");
	firstBook.setPageCount(13);
	firstBook.setPrice(6.12);
	
	secondBook = new Book();
	secondBook.setAuthor("Rick Riordan");
	secondBook.setTitle("The Titan's Curse");
	secondBook.setSubject("Fantasy literature");
	secondBook.setPageCount(280);
	secondBook.setPrice(15.50);
	
	thirdBook = new Book(1, "Hp lovecraft", "Horror","Nyarlathotep", 1 );
	
	
	
	hipsterBooks[0]= firstBook;
	hipsterBooks[1]= secondBook;
	hipsterBooks[2]=thirdBook;
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
