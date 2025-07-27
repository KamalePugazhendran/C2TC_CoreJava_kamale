package Assignment.Entity1Assignment1;

public class MainProgram {
	
	    public static void main(String[] args) {
	        Student s1 = new Student(101, "kamale", "Computer Science");
	        Student s2 = new Student(102, "Arjun", "Mechanical");
	        Student s3 = new Student(103, "Aravindh", "Electrical");

	        System.out.println("Student Details:");
	        s1.displayDetails();
	        s2.displayDetails();
	        s3.displayDetails();
	    }
	}


