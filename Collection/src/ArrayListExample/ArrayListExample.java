package ArrayListExample;
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>();
		a1.add("vijay");
		a1.add("Ravi");
		ArrayList<String> a2=new ArrayList<>();
		a2.add("ram");
		a2.add("test");
		ArrayList<String> a3=new ArrayList<>();
		a3.add("ram");
		a3.add("test");
//		a1.set(0, "test3");
		System.out.println(a2.equals(a3));
		a2.add(2,"test1");
//		
		a1.addAll(a2);
//		a1.removeAll(a1);

		
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
		System.out.println(a1.retainAll(a2));
		System.out.println(a1.get(1));
		System.out.println(a1.size());
		System.out.println(a1);
		System.out.println(a2.contains("ram"));
		System.out.println(a2.containsAll(a1));
//		System.out.println(a1.toArray());
//		System.out.println(a1.removeAll(a2));
		System.out.println(a1);
		System.out.println(a3);
		a2.clear();
		System.out.print(a2.isEmpty());
	}

}