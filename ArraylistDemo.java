package Keerthi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArraylistDemo {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add('a');
		list.add(3.14);
		list.add("java");
		
		System.out.println(list);
		
		list.add(1,2);
		
		System.out.println(list);
		list.set(2,4);
		System.out.println(list);
		
	List arrlist = new ArrayList();
	arrlist.addAll(list);
	
	System.out.println(arrlist);
	
	arrlist.add('c');
	System.out.println(list.indexOf(20));
	System.out.println(list.contains(1));
	System.out.println(list.get(0));
	System.out.println(list.lastIndexOf(20));	
	System.out.println(list.size());
	System.out.println(list);
	
	Iterator<Double> itr = list.iterator();
	
	 while(itr.hasNext()) {
		
		 System.out.println(itr.next());
		 
	 }
	 
	}

}
