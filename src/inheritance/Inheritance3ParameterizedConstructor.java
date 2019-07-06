package inheritance;

public class Inheritance3ParameterizedConstructor {

}

class Person{
	int age;
	String name;
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	
}

class Student extends Person{

	public Student(int age, String name) {
		super(age, name);// commenting this line will produce error
		System.out.println("Inside Student");
	}
	
}