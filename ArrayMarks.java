package Keerthi;

//calculate total, percentage, result, of student marks using arrays

public class ArrayMarks {

	public static void main(String[] args)
	{
		
		int i;
		//array
		int marks[]=new int[6];
		marks[0]=89;
		marks[1]=90;
		marks[2]=34;
		marks[3]=86;
		marks[4]=68;
		marks[5]=74;
		
		for(i=0;i<6;i++)
		
			System.out.println(marks[i]);
			
		System.out.println("Marks length = "+marks.length);
	
		//attributes
		
		int sum;
		double avg;
		
		sum=marks[0]+marks[1]+marks[2]+marks[3]+marks[4]+marks[5];//sum of marks
		
		System.out.println("Sum of Total Marks is : "+sum);
		
		avg=sum/6;//average of marks
		
		System.out.println("Average of Total Marks is : "+avg);

		
		if(avg<35)
			System.out.println("Sorry!The student got Fail");
		
		else {
			System.out.println("Congratulations! The student got Passed");
		}

	}
}