package classesAndObjects;

class MyMath {
	public static int square(int num) {
		return num * num;
	}

	public static double square(double num) {
		return num * num;
	}
}

public class MethodOverloadingEx{
	public static void main(String[] args) {
		System.out.println(MyMath.square(5));
		System.out.println(MyMath.square(5.0));
	}
}