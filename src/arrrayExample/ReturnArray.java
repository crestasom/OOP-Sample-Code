package arrrayExample;

public class ReturnArray {
	public static void main(String[] args) {
		double []arr=getArray();	
		for(double d:arr)
			System.out.println(d);
	}

	public static double[] getArray()
	{
		double[] array = { 1.2, 2.3, 4.5, 6.7, 8.9 };
		return array;
	}

}
