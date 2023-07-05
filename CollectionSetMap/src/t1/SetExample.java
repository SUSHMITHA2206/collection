package t1;

import java.util.*;
public class SetExample {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add( "Yellow");
		set.add("Red");
		set.add( "Green");
		set.add( "Pink");
		set.add( "Orange");
		Iterator<String> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("LinkedHashSet");
		LinkedHashSet <String> lset=new LinkedHashSet<String>();
		lset.add("Yellow");
		lset.add("Red");
		lset.add( "Green");
		lset.add( "Pink");
		lset.add( "Orange");
		Iterator <String> itr1=lset.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Tree Set");
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Yellow");
		ts.add("Red");
		ts.add("Green");
		ts.add("Pink");
		ts.add("Orange");
		Iterator<String> itr2=ts.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		
	}

}
