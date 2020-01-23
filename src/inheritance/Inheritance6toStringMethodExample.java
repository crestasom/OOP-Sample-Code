package inheritance;

public class Inheritance6toStringMethodExample {
	public static void main(String[] args) {
		Person123 p1 = new Person123(24, "Ram", "ram@mail.com");
		Person123 p2 = new Person123(24, "Ram", "ram@mail.com");
		// Person123 p2 = p1;
		String s1 = "Ram";
		p1.equals(s1);
		Object o = new Person123(24, "Ram", "ram@mail.com");
		System.out.println(p1.equals(p2));

		// System.out.println(p);
		// System.out.println(p.toString());
	}
}

class Person123 {
	private int age;
	private String name;
	private String email;

	public Person123(int age, String name, String email) {

		this.age = age;
		this.name = name;
		this.email = email;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public boolean equals(Object p2) {

		if (p2 instanceof Person123) {
			Person123 p = (Person123) p2;
			if (p.getName().equals(this.name)) {
				return true;
			}

		}
		return false;

	}

	/*
	 * public String toString() { return "Name=" + name + "\nAge=" + age +
	 * "\nEmail=" + email; }
	 */

}