package inheritance;

public class Inheritance4MethodOverriding2 {

	public static void main(String args[]) {
		Nabil s = new Nabil();
		Sunrise i = new Sunrise();
		Prabhu  a = new Prabhu();
		System.out.println("Nabil Rate of Interest: " + s.getRateOfInterest());
		System.out.println("Sunrise Rate of Interest: " + i.getRateOfInterest());
		System.out.println("Prabhu Rate of Interest: " + a.getRateOfInterest());
	}
	
}

//Java Program to demonstrate the real scenario of Java Method Overriding  
//where three classes are overriding the method of a parent class.  
//Creating a parent class.  
class Bank {
	int getRateOfInterest() {
		return 0;
	}
}

//Creating child classes.  
class Nabil extends Bank {
	int getRateOfInterest() {
		return 8;
	}
}

class Sunrise extends Bank {
	int getRateOfInterest() {
		return 7;
	}
}

class Prabhu extends Bank {
	int getRateOfInterest() {
		return 9;
	}
}
