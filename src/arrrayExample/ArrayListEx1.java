package arrrayExample;
import java.util.ArrayList;



public class ArrayListEx1 {
	public static void main(String[] args) {

		ArrayList<String> name=new ArrayList<>();
		name.add("Ram");
		name.add("hari");
		name.add("sita");
		System.out.println(name.size());
		System.out.println(name.get(1));
		//System.out.println(name);
		
		name.remove(1);
		System.out.println(name.get(1));
		
	}
}
