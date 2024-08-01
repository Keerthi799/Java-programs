package Keerthi;

class Student {
	
String name;
int age;
String course;

public Student(String name, int age, String course) {
   this.name = name;
    this.age = age;
    this.course = course;
}

public void object() {
   System.out.println("Name: " + name);
    System.out.println("Age: " + age);
   System.out.println("Course: " + course);

}
}

public class object {
public static void main(String[] args) {
	
  Student student1 = new Student("keerthi", 20, "Computer Science");
  Student student2 = new Student("sowmya", 22, "Engineering");
    
    System.out.println("Student 1:");
    student1.object();
    
    
    System.out.println("Student 2:");
    student2.object();
   
}

}


