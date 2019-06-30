package arrrayExample;

public class PassArray {
	public static void main(String[] args) {
		int []a= {2,3,5,2,1};
		passElem(a[4]);
		System.out.println(a[4]);
		passArr(a);
		System.out.println(a[4]);
	}

	private static void passArr(int[] a) {
		a[4]=10;
		
	}

	private static void passElem(int i) {
		i=50;
		
	}
	
	

}
