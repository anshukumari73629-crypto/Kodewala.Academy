package Com.Library.Book;

class Book {

	String bookname;
	int price;
	String author;
	int pages;

	Book() {
		System.out.println("Inside 0 args Constructor");
	}

	Book(String _bookname, String _author, int pages){
		this.bookname = _bookname;
		this.author= _author;
		
	}
	

	Book(String _bookname, int _price, String _author, int _pages) {
		this.bookname = _bookname;
		this.price = price;
		this.author = _author;
		this.pages = _pages;

	}

}
