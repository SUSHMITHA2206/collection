package t1;
import java.util.*;
public class SetMapExample {
	public static void main(String[] args) {
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(6,"Yellow");
		map.put(4,"Red");
		map.put(1,"Green");
		map.put(5,"Pink");
		map.put(3,"Orange");
		System.out.println("Iterating Hashmap");
		for(Map.Entry m:map.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
			}
		
		LinkedHashMap<Integer,String> lmap=new LinkedHashMap<Integer,String>();
		lmap.put(6, "Yellow");
		lmap.put(4,"Red");
		lmap.put(1, "Green");
		lmap.put(5, "Pink");
		lmap.put(3, "Orange");
		System.out.println("Iterating Hashmap");
		for(Map.Entry m:lmap.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
			}
		TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();
		tmap.put(6, "Yellow");
		tmap.put(4,"Red");
		tmap.put(1, "Green");
		tmap.put(5, "Pink");
		tmap.put(3, "Orange");
		System.out.println("Iterating Hashmap");
		for(Map.Entry m:tmap.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
			}
		HashMap<Integer,String> hm =new HashMap<Integer,String>();
		hm.putAll(map);
		System.out.println(hm);
		System.out.println(hm.keySet());	
		System.out.println(hm.containsKey(3));	
		System.out.println(hm.containsKey(10));	
		System.out.println(hm.replace(4,"purple"));
		System.out.println(hm);	
		System.out.println(hm.containsValue("purple"));	
		System.out.println(hm.containsValue("red"));	
		System.out.println(hm.get(5));
		System.out.println(hm.entrySet());
		System.out.println(hm.size());
		System.out.println(hm.toString());
		System.out.println(hm.values());
		System.out.println(lmap.equals(tmap));	
		System.out.println(hm.isEmpty());
		hm.replace(3, "Orange", "Black");
		System.out.println(hm.remove(1));
		System.out.print(hm);
		
		
		
}
}
