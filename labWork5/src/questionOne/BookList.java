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

	 
	public double calculateYearlyBookPayment() {
		double totalPaid = 0;
		for (Object o : this.oList) {
			Book b = (Book) o;
			totalPaid = totalPaid + b.getPrice();
		}
		return totalPaid;
	}

}
