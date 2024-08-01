
//to replace number with character'x'."1234567890"  the return value should be"xxxxxx7890"
package Keerthi;

import java.util.Scanner;


public class Replacestr {
	//method to replace with character'x'except last 4 

			String replaceStr(String s)
			{
				char arr[]=new char[s.length()];
				arr=s.toCharArray();
				for(int i=0;i<arr.length-4;i++)
				{
					arr[i]='x';
					
				}
				String str1=new String(arr);
				return str1;
				
			}
			public static void main(String[]args)
			{
				System.out.println("enter mobile number");
				Scanner sc=new Scanner(System.in);
				String str=sc.next();
				Replacestr rp=new Replacestr();
				System.out.println(rp.replaceStr(str));
			}		

	}