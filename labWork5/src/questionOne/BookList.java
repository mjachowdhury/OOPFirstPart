package questionOne;

 

public class BookList extends ObjectList {

	private Book myBook;
	public BookList(int sizeIn) {
		super(sizeIn);

	}

	public Book getBook(int positionIn) {
		if (positionIn < 1 || positionIn > getTotal()) {
			return null;
		} else {
			return (Book) getObject(positionIn);
		}
	}

	public Book search(int ISBN) {
		for (int i = 1; i <= getTotal(); i++) {
			if (getBook(i).getISBN() == ISBN) {
				return getBook(i);
			}
		}
		return null;
	}

	public boolean removeBook(int ISBN) {
		for (int i = 1; i <= getTotal(); i++) {
			if (getBook(i).getISBN() == ISBN) {
				remove(i);
			}
		}
		return false;
	}
	
	//need to do
	public double calculateYearlyBookPayment(){
		double totalPaid = 0;
		for(int i =1; i<= getTotal(); i++){
			//totalPaid += getTotal()myBook.getPrice();				
		}
		return totalPaid;
	}
	
	/*public double calculateTotalPaid() {
		double totalPaid = 0;
		for (int i = 1; i <= getTotal(); i++) {
			totalPaid += getPayment(i).getAmount();
		}
		return totalPaid;
	}*/
}	
	

	

	 


/*private HashMap bookTable;
private String listName;

public BookList(String listName) {
    this.bookTable = new HashMap();
    this.listName = listName;
}

public void addBook(Book book) {
    bookTable.put(book.getISBN(), book);
}

public Book getBook(String isbn) {
    return (Book) bookTable.get(isbn.trim());
}

public void removeBook(Book book) {
    bookTable.remove(book.getISBN());
}

public void removeBook(String isbn) {
    bookTable.remove(isbn);
}

public HashMap getBookTable() {
    return bookTable;
}

public void setBookTable(HashMap bookTable) {
    this.bookTable = bookTable;
}

public String getListName() {
    return listName;
}

public void setListName(String listName) {
    this.listName = listName;
}

 public OMElement serialize(OMFactory fac) {
    return null;
}

public Book[] getBookList() {
    Book [] books = new Book[bookTable.size()];
    Iterator books_itr = bookTable.values().iterator();
    int count = 0;
    while (books_itr.hasNext()) {
        books[count] = (Book) books_itr.next();
        count ++;
    }
    return books;
}

public BookList copy() {
    BookList books = new BookList(getListName());
    Book [] allBooks = getBookList();
    for (int i = 0; i < allBooks.length; i++) {
        Book allBook = allBooks[i];
        Book book = new Book();
        book.setAuthor(allBook.getAuthor());
        book.setISBN(allBook.getISBN());
        book.setTitle(allBook.getTitle());
        books.addBook(book);
    }
    return books;
}*/