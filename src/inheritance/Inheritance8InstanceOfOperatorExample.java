package inheritance;

public class Inheritance8InstanceOfOperatorExample {

	public static void main(String[] args) {
		Sub2 s2=new Sub2();
		System.out.println(s2 instanceof Sub2);
		System.out.println(s2 instanceof Super2);
		System.out.println(s2 instanceof Object);
	}
}

class Super2{
	
}

class Sub2 extends Super2{
	
}