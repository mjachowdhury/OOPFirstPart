package questionTwo.model;

import java.util.ArrayList;

public class ObjectList {

	public ArrayList<Object> obList;
	private int total;

	public ObjectList(){}
	
	public ObjectList(int total) {
		this.total = total;
		obList = new ArrayList<Object>();
	}

	public boolean isFull() {
		if (obList.size() == total) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (obList.size() == 0)
			return true;
		return false;
	}

	/*public boolean add(Object obj) {
		if (!isFull()) {
			obList.add(obj);
			return true;
		}
		return false;

	}*/
	
	public String add(Object object) {
		if (!this.isFull()) {
			this.obList.add(object);
			return object.toString() + " added to list:\n" + this + "\n";
		}
		return "List is full, item was not added.";
	}

	public boolean remove(int i) {
		if (!isEmpty()) {
			if (getObject(i) == null)
				return false;
			obList.remove(i);
			return true;
		}
		return false;
	}
	
	/*public void remove(int i) {
		if (!this.isEmpty()) {
			this.list.remove(i);
		}
	}*/

	public Object getObject(int i) {
		return obList.get(i);
	}

	public int getTotal() {
		return this.total;
	}

}

/*public class ObjectList {

	private int size;
	private ArrayList<Object> list = new ArrayList<Object>();
	

	public ObjectList(int size) {
		this.size = size;
	}

	public String add(Object object) {
		if (!this.isFull()) {
			this.list.add(object);
			return object.toString() + " added to list:\n" + this + "\n";
		}
		return "List is full, item was not added.";
	}

	public Boolean isFull() {
		return this.list.size() == this.size;
	}

	public Boolean isEmpty() {
		return this.list.size() == 0;
	}

	public int getTotal() {
		return this.list.size();
	}

	public Object getObject(int i) {
		return this.list.get(i);
	}

	public void remove(int i) {
		if (!this.isEmpty()) {
			this.list.remove(i);
		}
	}
	
	public String toString() {
		return this.list.toString();
	}
	
	public void print() {
		System.out.println(this);
	}

}
*/
