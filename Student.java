import java.util.*;


public class Student 
{
	String firstName,studentName;
    String lastName;
    int registration;
    int grade;
    int year;
    
    public Student(String firstName,String lastName,int registration,int grade,int year)
    {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	studentName = firstName+" "+lastName;			//Here we shouldn't initiate the student name again, if we do so it overalps the availability of student name over the class so we can't access the student name anywhere;
    	this.registration = registration;
    	this.grade = grade;
    	this.year= year;
    	//System.out.println(studentName);
    	
    	
    }
    
    public Student()
    {
    	
    }
    
    public Student()
    {
    	
    }
    
    public void printFullName()
    {
    	System.out.println("The Student name is: "+ studentName);       
    }

    public boolean isApproved()
    {
    	//this.grade = grade;
    	if(this.grade>60)					//the this keyword is used to represent any instance with the object
    			return true;
    	return false;
    	
    }

    public void changeYearIfApproved()
    {
    	if(isApproved())
    	{
    		this.year+=1;
    		System.out.println("Congratulations You're Welcome to the "+this.year+" Year!");
    	}
    	
    	else
    		System.out.println("You are not promoting to the next year!.It's okay, You've done your best. Try harder next time:)");
         
    }
    
	public static void main(String[] args) 
	{
		Student akil = new Student("Akil","Ramkumar",000,80,3);
		Student sonu = new Student("Sonu","Kinna",001,70,3);
		Student monu = new Student("monu","Ramji",002,69,3);
		Student chaman = new Student("Chaman","Raja",003,55,3);
		Student rekha = new Student("Rekha","Balu",004,78,3);
		Student smitha = new Student("Smitha","Vallavan",005,99,3);
		
		Student[] stud= {akil,sonu,monu,chaman,rekha,smitha};				// creating a new class for all the objects of this class
		for(Student check: stud)											// For  loop to travers the objects of this class.
		{
			check.printFullName();
	
			check.changeYearIfApproved();
		}
		
		Courses java = new Courses("Java","Annamalai",2023);			// calling another class from this class main method for this we don't need to inherit one class to another
		
		java.enroll(stud);													//while passing the class we should not refer the class type
		java.unEnroll(stud);
		java.countStudents();
		java.enrollerDetails();
		//java.bestGrade(stud);
		System.out.println("Best grade of the course is "+java.bestGrade(stud));
		
		
		
		
		
		
		
		
	}

}
