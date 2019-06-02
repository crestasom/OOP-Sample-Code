package classesAndObjects;

public class EnumExample {
	
	public static void main(String[] args) {
		Days d=Days.SUNDAY;
		System.out.println(d.toString());
		System.out.println(d.ordinal());
	}
	
}

enum Days{
	SUNDAY,MONDAY,TUESDAY
}

