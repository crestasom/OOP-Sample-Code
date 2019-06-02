package classesAndObjects;

public class StaticFieldEx {

	public static void main(String[] args) {
	Person p1=new Person();
	Person p2=new Person();
	Person p3=new Person();
	System.out.println(Person.getPersonCount());
	}
}

class Person{
	int age;
	String name;
	static int personCount;
	public Person() {
		personCount++;
	}
	
	public static int getPersonCount() {
		return personCount;
	}
	
}
