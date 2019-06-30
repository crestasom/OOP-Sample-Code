package arrrayExample;

import java.util.Scanner;

public class ObjectArray {

	public static void main(String[] args) {
		Person []p=new Person[3];
		int age;
		String name;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Person Detail");
		for(int i=0;i<3;i++) {
			age=sc.nextInt();
			sc.nextLine();
			name=sc.nextLine();
			
			p[i]=new Person(age, name);
		}
		sc.close();
		for(Person ps:p) {
			System.out.println(ps);
		}
	}
}

class Person{
	private int age;
	private String name;
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
	
}