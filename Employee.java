package Keerthi;

//Superclass Employee
public class Employee {
	  
 int Id;
 String Name;
 int Salary;
 
  void Totalsalary()
  {
  	System.out.println("EmployeeDetails :"+"\nId :"+Id+"\nName :"+Name+"\nSalary :"+Salary);
  	
  }
 
 public static void main(String[]args) {
	   
	   Employee emp = new Employee();
	   emp.Id = 123;
	   emp.Name =  "Keerthi";
	   emp.Salary = 30000;
	     
	   emp.Totalsalary();
	   
 }
 
 
}


