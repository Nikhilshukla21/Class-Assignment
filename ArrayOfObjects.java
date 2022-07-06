package arrayexamples;

import java.util.Scanner;

class Book {
	// instance variable
	private int bookId;
	private String bookName;
	private String authorName;

	public Book(int bookId, String bookName, String authorName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
	}

	public void display() {
		System.out.println("Id: " + this.bookId + " BookName: " + this.bookName + " AuthorName: " + this.bookName);
	}
}

public class ArrayOfObjects {

	public static void main(String[] args) {
		// create array of book object
		Book book[] = new Book[1];
		int id;
		String bookName, authorName;
		Scanner sc = new Scanner(System.in);
		/*
		 * book[0] = new Book(101, "Let us C", "Kanthir"); book[1] = new Book(101,
		 * "Let us C", "Kanthir");
		 * 
		 * System.out.println("Book 1"); book[0].display();
		 * System.out.println("Book 2"); book[1].display();
		 */

		// taking input from user
		for (int i = 0; i < book.length; i++) {
			System.out.println("Enter id name and author name");
			id = sc.nextInt();
			sc.nextLine();
			bookName = sc.nextLine();
			authorName = sc.nextLine();
			book[i] = new Book(id, bookName, authorName);
		}
		// display values
		System.out.println("-----------------Book details----------------- ");
		for (int i = 0; i < book.length; i++) {
			book[i].display();
		}

	}

}
