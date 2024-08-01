package Keerthi;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {

	public static void main(String[] args) {
		List<Double> llist=new LinkedList<Double>();
		llist.add(2000.03);
		llist.add(3005.35);
		llist.add(3200.03);
		llist.add(3205.35);
		
		System.out.println(llist);
		System.out.println(llist.size());
		
		llist.remove(0);
		System.out.println(llist);
		
		
		Iterator<Double> itr = llist.iterator();
		
		 while(itr.hasNext()) {
			
			 System.out.println(itr.next());
			 
			 System.out.println("Max = "+Collections.max(llist));
			 System.out.println("Min ="+Collections.min(llist));
			 
			 Collections.sort(llist);
			 System.out.println(llist);
			 
			 System.out.println(Collections.reverseOrder());
			 Collections.reverse(llist);
			 System.out.println(llist);
			 
			 
		 }
		
		
		}

	}