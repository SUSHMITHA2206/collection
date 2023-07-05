package ArrayListExample;
import java.util.*;
public class ArrayListExample1 {

	public static void main(String[] args) {

		ArrayList<String> a1=new ArrayList<>();
		ArrayList<String> a2=new ArrayList<>();
	
		a1.add("rama");
		a1.add("vijay");
		a1.add("ABC");
		a1.set(0, "Ravi");
		System.out.println("a1="+a1);
		a2.addAll(a1);
		System.out.println(a2.equals(a1));
		
		a1.add("XYZ");
		a2.remove("ABC");
		System.out.println("a1="+a1);
		System.out.println("a2="+a2);
//		a2.removeAll(a1);
//		System.out.println(a2);
//		System.out.println(a2.size());
//		System.out.println(a1.size());
//		System.out.println(a1.retainAll(a2));
//		System.out.println(a1.contains("ABC"));
//		System.out.println(a2.containsAll(a1));
		a2.clear();
		System.out.println("a2="+a2);
		System.out.println(a2.isEmpty());
		System.out.println(a1.isEmpty());
		System.out.println(a1.get(0));
		System.out.println(a1.indexOf("XYZ"));
		System.out.println(a1.lastIndexOf("XYZ"));
		System.out.println(a1.subList(1, 3));
				
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
		
		

	}

}
