package arrrayExample;

import java.util.ArrayList;

public class ArrayListEx2 {
	
	public static void main(String[] args) {
		ArrayList<Integer> iList=new ArrayList<>();
		//int x=Integer.parseInt("12");
		iList.add(3);
		iList.add(5);
		iList.add(2);
		System.out.println(iList);
		iList.add(1,7);
		System.out.println(iList);
		iList.set(1, 22);
		System.out.println(iList);
		
	}

}
