package Com.Library.Book;

public class BookDetail {
	public static void main(String[] args) {
		Book book = new Book ();
		System.out.println("book.bookName"+ "book.price");
		

		Book book1 = new Book ("python",500, "Guido",450);
		System.out.println(book1.bookname+ "book.price"+ "book2.author"+"book2.pages");
	}

}