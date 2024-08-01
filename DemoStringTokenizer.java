package Keerthi;

import java.util.StringTokenizer;

public class DemoStringTokenizer {

	
	public static void main(String[] args) {
		
		StringTokenizer strt = new StringTokenizer("Hello Java World"," ",false);
		System.out.println(strt.countTokens());
		
		while(strt.hasMoreTokens())
			
			System.out.println(strt.nextToken());
		
		
		String str = strt.toString();
		System.out.println(str);
			

	}

}
