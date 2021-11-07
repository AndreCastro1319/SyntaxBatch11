package Class12Hw;

public class HwTask4 {
//Create a method createEmail(). Based on values of users name, lastName and email type, your method should 
//return complete email Address. Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com 	
	
	String email (String userName, String lastName, String emailType ) {
	String	fullEmail= userName+lastName+"@"+emailType+".com";
	 		return fullEmail;
		
	}
	
	public static void main(String[]args) {
	
		HwTask4 name=new HwTask4();
		System.out.println(name.email("ndre", "castro", "gmail"));
	}
}
