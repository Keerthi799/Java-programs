package Keerthi;

public class ContractEmployee extends Employee {
	
	String ContractPeriod ;
	int salary;
	
	
	 @Override
	
	void Totalsalary() {
		System.out.println("ContractEmployee Details:"+"\nContractPeriod : "+ContractPeriod+"\nSalary :"+salary);
	}
	

	public static void main(String[] args) {
		ContractEmployee emp = new ContractEmployee();
		
		 emp.ContractPeriod = "1 year";
		 emp.salary = 25000;
		 
		 
		emp.Totalsalary();
		
	}

	
}
