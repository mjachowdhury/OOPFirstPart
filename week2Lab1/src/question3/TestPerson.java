package question3;

public class TestPerson {

	public static void main(String[] args) {
		 Person person = new Person(5, "123456", "Mohammed");
		 
		//String result = person.jump();
		System.out.println(person.jump());
		System.out.println(" I jumped " + person.getStars()+ " times.");
		
		System.out.println();
		person.print();

	}

}
