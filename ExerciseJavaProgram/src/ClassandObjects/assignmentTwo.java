package ClassandObjects;
/*Define a class named Book with the following attributes:
 * String title
 * String author
 * int pageCount
 * int totalBooks(to keep track of the total number of books)
 * 
 * In the main method:
 * Create three Book objects and initialize their properties with different values.
 * Print the details of each book and the total number of books.
 * Modify the pageCount attribute of one book and print the updated details.
 * Create another Book object and update the total number of books.
 * Print the details of the new book and the updated total number of books.
 * */
public class assignmentTwo {
	
	String title;
	String author;
	int pageCount;
	int totalBooks; // ( to keep track of the total number of books)

	public static void main(String[] args) {
	int bookCount=0;
		
		
	System.out.println("******BookOne*********");
	assignmentTwo bookOne=new assignmentTwo();
	bookOne.title = "Maths";
	bookOne.author = "cvram";	
	bookOne.pageCount=100;
	bookOne.totalBooks=99;
	System.out.println(bookOne.title + " " + bookOne.author + " " + bookOne.pageCount + " "+ bookOne.totalBooks);
	bookCount++;
	
	
	System.out.println("******BookTwo*********");
	assignmentTwo bookTwo=new assignmentTwo();
	bookTwo.title = "Chemistry";
	bookTwo.author = "sriram";	
	bookTwo.pageCount=90;
	bookTwo.totalBooks=89;
	System.out.println(bookTwo.title + " " + bookTwo.author + " " + bookTwo.pageCount + " "+ bookTwo.totalBooks);
	bookCount++;
	
	System.out.println("******BookThree*********");
	assignmentTwo BookThree=new assignmentTwo();
	BookThree.title = "English";
	BookThree.author = "john";	
	BookThree.pageCount=79;
	BookThree.totalBooks=69;
	System.out.println(BookThree.title + " " + BookThree.author + " " + BookThree.pageCount + " "+ BookThree.totalBooks);	
	bookCount++;
	
	System.out.println("******BookOne PageCountUpdate*********");
	bookOne.pageCount=101;
	System.out.println(bookOne.title + " " + bookOne.author + " " + bookOne.pageCount + " "+ bookOne.totalBooks);
	System.out.println(bookCount++);
	
	System.out.println("******BookFour*********");
	assignmentTwo BookFour=new assignmentTwo();
	BookFour.title = "Social";
	BookFour.author = "alex";	
	BookFour.pageCount=200;
	BookFour.totalBooks=6920;
	System.out.println(BookFour.title + " " + BookFour.author + " " + BookFour.pageCount + " "+ BookFour.totalBooks);
	bookCount++;
	
	}
}