package classesAndObjects;

public class EqualsOperatorExample {
	public static void main(String[] args) {
		Student s1 = new Student(1, "Ram");
		Student s2 = s1;

		/*
		 * prints true both s1 and s2 contains reference of same object
		 */
		System.out.println(s1 == s2);

		s2 = new Student(1, "Ram");
		/*
		 * Prints false although content is same but s1 and s2 contains reference
		 * variable of different object
		 */
		System.out.println(s1 == s2);

		/*
		 * Prints false works similar as == operator until we define our own version of
		 * equals method
		 */
		System.out.println(s1.equals(s2));

	}

}

class Student {
	int id;
	String name;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public boolean equals(Student stud) {
		boolean status = false;
		if (id == stud.id && name.equals(stud.name)) {
			status = true;
		}
		return status;

	}

	/*
	 * @Override public boolean equals(Object obj) { boolean status = false; if (obj
	 * instanceof Student) { Student stud = (Student) obj; if (id == stud.id &&
	 * name.equals(stud.name)) { status = true; } } return status; }
	 */

}