package Keerthi;

//different methods in string
public class StringDemo {

	public static void main(String[] args) {
		//string  creation using literal
		String name="Anudip";
		System.out.println(name);
		//string creation using string constructor
		String course=new String("APJFSA Course");
		System.out.println(course);
		//string creation using character array
		char[] courseType= {'a','w','s'};
		String course1=new String(courseType);
		System.out.println(course1);
		System.out.println(name.concat("Foundation"));
		name="Anudip Foundation";
		System.out.println(name);
		System.out.println(name.charAt(15));
		System.out.println(name.indexOf('n'));
		System.out.println(name.lastIndexOf('n'));
		System.out.println(name.indexOf('n',2));
		System.out.println(name.length());
		System.out.println(name.contains(course));
		System.out.println(name.indexOf('n'));
		System.out.println(name.equals(course1));
		
		
		String name1="anudip foundation";
		System.out.println(name.compareTo(course1));
		System.out.println(name.compareTo(name1));
		System.out.println(name.compareToIgnoreCase(name1));
		System.out.println(name.equalsIgnoreCase(name1));


}
}