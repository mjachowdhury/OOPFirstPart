package question1;

import java.util.ArrayList;

public class ObjectList {

	private ArrayList<Object> ol;
	private int n;
	private int total;

	private Dog d;
	private DVD v;

	public ObjectList(int n) {
		ol = new ArrayList<Object>();
		this.n = n;
		this.total = n;

		this.d = new Dog();
		this.v = new DVD();
	}

	@Override
	public String toString() {
		return "Object [total=" + total + ", d=" + d + ", v=" + v + "]";
	}

	/**
	 * @return the total
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * @param total
	 *            the total to set
	 */
	public void setTotal(int total) {
		this.total = total;
	}

	public boolean isEmpty() {
		if (ol.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isFull() {
		if (ol.size() > 0) {
			System.out.println("Object list is greater then zero " + ol.size());
			return true;
		} else {
			System.out.println("Object list is empty." + ol.size());
			return false;
		}
	}

	public void remove(int i) {
		ArrayList<ObjectList> ol = new ArrayList<>();

		for (ObjectList list : ol) {
			list.remove(i);
		}

	}

	/**
	 * @return the ol
	 */
	public ArrayList<Object> getOl() {
		return ol;
	}

	/**
	 * @param ol
	 *            the ol to set
	 */
	public void setOl(ArrayList<Object> ol) {
		this.ol = ol;
	}

	public String add(Object o) {

		ol.add(o);
		return " added " + o.toString();//
	}

	public Object getObject(int i) {
		return ol.get(i);

	}

}
