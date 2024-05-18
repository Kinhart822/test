package tut01;

public class Program {
	public static void main(String[] args) {
		Person john = new Person(1, "John");
		Person cook = new Person(2, "Cooker"); 
		
		System.out.println(john.get_Name());
		
		System.out.println(john);
	}
}
