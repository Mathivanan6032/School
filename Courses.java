import java.util.ArrayList;

public class Courses
{
	String courseName,professorName;
	int year,studentCount;
	ArrayList<String> enrollers = new ArrayList<String>();						// this arraylist can be created with anyother data type and also the another class name to acces the class objects her it goes like: ArrayList<Student> 
	
		public Courses(String courseName,String professorName,int year)
		{
			this.courseName = courseName;
			this.professorName = professorName;
			this.year = year;
			//this.studentCount = studentCount;
			//this.stud = stud;
			
			System.out.println("Course Description: "+courseName+" is taken by "+professorName+"in the year "+year);
		}
	
	   public void enroll(Student[] stud)							// Accessing the stud class to access all its objects along with its class type.
	   {
		   System.out.println("Students enrolling to the Java Developer Course:");
		   
		   for(int i=0;i<stud.length;i++)
		   {
			  enrollers.add(stud[i].firstName);					//we can directly access methods from other classes only with its classname, nothing complex is required.
			   
		   }
		      //TODO add the student to the collection
		   
	   }

	   public void unEnroll(Student[] stud)
	   {
		       //TODO remove this student from the colletion
		       // Hint: check if that really is this student
		   for(int i=0;i<stud.length;i++)
		   {
			   if(!stud[i].isApproved())
				   enrollers.remove(i);
		   }
	   }

	   public int countStudents()
	   {
		       //TODO implement
		   for(String ed : enrollers)							// be careful whether it is array or arraylist or string while accessing for the for each loop
			   studentCount++;
		       return studentCount;
	   }
	   
	   public void enrollerDetails()
	   {
		   for(String ed : enrollers)
			   System.out.println(ed);
		   System.out.println("Total no. of students enrolled in the Java course:"+studentCount);
	   }
		   
	   public int bestGrade(Student[] stud)
	   {
		   
		       //TODO implement
		   int mg = 0;
		   for(Student st : stud)
		   {
			   mg = Math.max(mg, st.grade);
		   }
		   
		  // System.out.println(mg);
		   
		       return mg;
	   }
	   
	   

}
