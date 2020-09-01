package inheritance;

public class InteritanceEqualsExample {

	public static void main(String[] args) {
		NewPerson p1 = new NewPerson("Ram", 23);
		NewPerson p2 = new NewPerson("Ram", 23);
		System.out.println(p1.equals(new String("")));
	}
}

class NewPerson { // super class, parent class
	protected String name;
	protected int age;

	public NewPerson(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public boolean equals(Object p1) {

		if (p1.getClass() == getClass()) {
			NewPerson np = (NewPerson) p1;
			if (name.equals(np.name) && age == np.age) {
				return true;
			}
		}
		return false;
	}
}

//Write an equals method for a class named Triangle which has three attributes as a,b,c.
