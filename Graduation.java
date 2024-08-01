package Keerthi;

public class Graduation {
	
	String courseName;
	int no_ofYears;
	
	public Graduation(String courseName , int no_ofYears) {
		
		super();
		this.courseName = courseName;
		this.no_ofYears = no_ofYears;
		
	}
	
	
	void GraduationDetails() {
		
		System.out.println("course details:"+"\nCourseName : "+courseName+"\nno_ofYears :"+no_ofYears);
		
	}

	public static void main(String[] args) {
		
		Graduation Degree = new Graduation("CSE", 4);
	
		Degree.GraduationDetails();
		
     

	}

}
