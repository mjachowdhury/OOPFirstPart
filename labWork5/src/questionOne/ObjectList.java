package questionOne;

import java.util.ArrayList;

public class ObjectList {

	public ArrayList<Object> obList;
	private int total;

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

	public boolean add(Object obj) {
		if (!isFull()) {
			obList.add(obj);
			return true;
		}
		return false;

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

	public Object getObject(int i) {
		return obList.get(i);
	}

	public int getTotal() {
		return this.total;
	}

}
