package questionTwo.model;

public class BookList extends ObjectList {

	//private Book myBook;

	/*public BookList() { 
	}*/
	
	public BookList(int sizeIn) {
		super(sizeIn);
	}

	public void addBook(Book b) {
		this.add(b);
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

	// need to do
	public double calculateYearlyBookPayment() {
		double totalPaid = 0;
		for (int i = 1; i <= getTotal(); i++) {
			// totalPaid += getTotal()myBook.getPrice();
		}
		return totalPaid;
	}

	/*
	 * public double calculateTotalPaid() { double totalPaid = 0; for (int i =
	 * 1; i <= getTotal(); i++) { totalPaid += getPayment(i).getAmount(); }
	 * return totalPaid; }
	 */
}