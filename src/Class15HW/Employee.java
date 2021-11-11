package Class15HW;

public class Employee {
//Create a Class called Employee:
//	Create three  variables  empID , salary and set the CEO to “Sumair” 
//	Create two objects of the class Employee 
//	Set the value of eID, salary for each of the objects
//	Print out the eID , salary and  CEO for each of the objects
	
	int empID;
	static String salary="$1700";
	static String CEO="Sumair";
	
	public static void main(String[]args) {
		
		Employee Jimmy=new Employee();
		Jimmy.empID=04201;
		
		System.out.println("Jimmys empID is : "+Jimmy.empID);
		System.out.println("His salary is "+Employee.salary);
		System.out.println("His CEO is "+Employee.CEO);
		
		Employee Mateo=new Employee();
		Mateo.empID=54862;
		
		System.out.println("Jimmys empID is : "+Mateo.empID);
		System.out.println("His salary is "+Employee.salary);
		System.out.println("His CEO is "+Employee.CEO);
		
	}
	
	
}
