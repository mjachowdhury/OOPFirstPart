package question1;

/**
 * Write a description of class TestObjectList here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class TestObjectList {
	

	public static void main(String[] args) {
		ObjectList ol = new ObjectList(3);

		String s = "Im Happy";
		Dog d = new Dog();
		DVD v = new DVD();
		Integer i = 1234;

		System.out.println(ol.add(s));
		System.out.println(ol.add(d));
		System.out.println(ol.add(v));
		System.out.println(ol.add(i));

		ol.remove(0);
		//System.out.println(ol.add(i));

		 System.out.println("Is the list full? "+ol.isFull());
		 System.out.println("Is the list empty? "+ ol.isEmpty());

		 System.out.println("Total number of objects in the list: " +
		 ol.getTotal());

		 Dog g = (Dog) ol.getObject(1);
		 g.bark();

	}
}
