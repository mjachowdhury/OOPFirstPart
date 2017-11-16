package questionTwo.model;

public class LecturerList extends ObjectList {

	private Lecturer lecturer;

	public LecturerList() {
		// super(total);

	}

	/*
	 * this method will add lecturer
	 */
	public void addLecturer(Lecturer l) {
		this.obList.add(l);
	}

	/*
	 * this method will add book inside the lectureList
	 */

	public void addBookToLecturerList(Book b) {
		//this.lecturer.add(b);
		this.obList.add(b);
	}

	/*
	 * this method will find lecturer by his/her id
	 */
	public Lecturer getLecturerByID(int id) {
		for (Object o : this.obList) {
			Lecturer l = (Lecturer) o;
			if (l.getID() == id) {
				return l;
			}
		}
		return null;
	}

	/*
	 * This method will remove book from the lecturer list
	 */
	public void removeBookFromLecturerList(Book b) {
		this.lecturer.obList.remove(b);
	}
	

}
