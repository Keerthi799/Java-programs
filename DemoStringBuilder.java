package Keerthi;

//class-declaration
public class DemoStringBuilder {
  //main-function
	public static void main(String[] args) {
		//String Builder-object
		StringBuilder strblr=new StringBuilder("Hello Programer");
      System.out.println(strblr);
      //String-Builder methods
      System.out.println(strblr.length());
      System.out.println(strblr.indexOf("P"));
      String s=strblr.toString();
      System.out.println(s);
      System.out.println(strblr.charAt(2));
      System.out.println(strblr.capacity());
		System.out.println(strblr.deleteCharAt(2));
		System.out.println(strblr.codePointAt(0));
		
	}
}
