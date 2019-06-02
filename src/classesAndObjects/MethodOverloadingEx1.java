package classesAndObjects;

public class MethodOverloadingEx1 {

	public static void main(String[] args) {
		Area a1=new Area();
		System.out.println(a1.calcArea(5));
		Area a2=new Area();
		System.out.println(a2.calcArea(3.5,4.5));
		
	}
}



class Area{
	public double calcArea(double length,double width)
	{
		return length*width;
	}
	
	public double calcArea(double side) {
		return side*side;
	}
	
	/*public double calcArea(double side) {
		return side+side;
	} uncommenting this will generate error as its signature is same as previous one*/
	
}