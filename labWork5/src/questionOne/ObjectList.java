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
	
	public boolean isEmpty(){
		if(obList.size()==0)
			return true;
		return false;
	}
	
	public boolean add(Object obj){
		if(!isFull()){
			obList.add(obj);
			return true;
		}
		return false;
		
	}
	
	public boolean remove(int i){
		if(!isEmpty()){
			if(getObject(i)==null)
				return false;
			obList.remove(i);
			return true;
		}
		return false;
	}
	
	public Object getObject(int i){
		return obList.get(i);
	}
	
	public int getTotal(){
		return this.total;
	}
	

	/*// Attributes
	public Object[] list;
	private int total;

	// Constructor
	public ObjectList(int sizeIn) {
		list = new Object[sizeIn];

		total = 0;
	}

	public boolean add(Object objectIn) {
		if (!isFull()) {
			list[total] = objectIn;
			total++;
			return true;
		} else {
			return false;
		}
	}

	public boolean isEmpty() {
		if (total == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isFull() {
		if (total == list.length) {
			return true;
		} else {
			return false;
		}
	}

	public Object getObject(int indexIn) {
		if (indexIn < 1 || indexIn > total) {
			return null;
		} else {
			return list[indexIn - 1];
		}
	}

	public int getTotal() {
		return total;
	}

	public boolean remove(int indexIn) {
		if (indexIn >= 1 && indexIn <= total) {
			for (int i = indexIn - 1; i <= total - 2; i++) {
				list[i] = list[i + 1];
			}
			total--;
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		String object = "";
		for (int i = 0; i < total; i++) {
			object = object + list[i].toString() + " ";
		}
		return "[ " + object + "]";
	}
*/
}
