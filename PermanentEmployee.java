package Keerthi;

public class PermanentEmployee extends Employee{
	
	int salary;
	int bonous;
	
	@Override
	 public void Totalsalary() {
		
		System.out.println("Permanent Employee Details:"+"\nbonous:"+bonous+"\nsalary:"+salary);
		
	}

	public static void main(String[] args) {
		
		PermanentEmployee emp = new PermanentEmployee();
		 emp.bonous = 2000;
		 emp.salary = 50000;
		
		
			
		emp.Totalsalary();
		
	}

}