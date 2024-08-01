package Keerthi;

public class StudentMarks {

	public static void main(String[] args) {
		int [] marks={45,65,58,68,48,36};
		boolean b=true;
		int i=0,sum=0;
		double percentage;
		
		
		for(;i<marks.length;) {
			if(marks[i]<=35)
				b=false;
			i++;
		}
		
		if(b) {
			for(i=0;i<marks.length;i++) {
				sum+=marks[i];
			}
			percentage=sum/6;
			System.out.println("Student Result:Passed"+"\nTotal = "+sum+"\npercentage = "+percentage);
		}
		else
			System.out.println("Student got Failed");
		
			
				
			}
}