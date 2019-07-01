package classesAndObjects;

public class StaticEx1 {

	public static void main(String[] args) {
		Person12 p1=new Person12();
		Person12 p2=new Person12();
	}
}


class Person12{
	int age;
	String name;
	int count;
	public Person12() {
		count++;
	}
}