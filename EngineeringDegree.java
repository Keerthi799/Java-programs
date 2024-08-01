package Keerthi;

public class EngineeringDegree extends Graduation{
	
	String BranchName;
	int no_ofSubjects;
	
	public EngineeringDegree(String BranchName, int no_ofSubjects , String courseName, int no_ofYears) {
		super(courseName, no_ofYears);
		this.BranchName = BranchName;
		this.no_ofSubjects =no_ofSubjects;	
		
	}
	
	void courseDetails() {
		
		System.out.println("EngineeringDetails:"+"\nBranchName : "+BranchName+"\nno_ofSubjects : "+no_ofSubjects+"\nCourseName : "+courseName+"\nno_ofYears :"+no_ofYears);
		
	}

	public static void main(String[] args) {
	
		EngineeringDegree btech = new EngineeringDegree("Btech",6,"CSE",4);
		
		btech.courseDetails();
		btech.GraduationDetails();
		
	}


}
