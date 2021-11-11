package Class15HW;

public class Students {
//Create three  variables  studentName , studentID  and  numberOfStudents
//	Create three objects of the Students Class 
//	Set the value for  studentName , studentID and increment  the numberOfStudents for each object
//	Print out  total number of students
	
	String studentName;
	int studentID;
	 static int numberOfStudents=100;
	
	public static void main(String[]args) {
		
	
	
		Students Jimmy=new Students();
		Jimmy.studentName="Jimmy";
		Jimmy.studentID=04201;
		System.out.println(Students.numberOfStudents);
			
			
		Students Mateo=new Students();
		Mateo.studentName="Mateo";
		Mateo.studentID=91906;
		System.out.println(Students.numberOfStudents+Students.numberOfStudents);
			
		Students Sebastian=new Students();
		Mateo.studentName="Sebastian";
		Mateo.studentID=31306;
		System.out.println(Students.numberOfStudents+Students.numberOfStudents+Students.numberOfStudents);
			
	}
	
}
