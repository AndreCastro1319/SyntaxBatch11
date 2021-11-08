package Class13Hw;

public class Homework2 {

	
	String name="Sunday";
	
	
	
	
	public static void main(String[] args) {
		// Create a String and if the String is not empty perform the following: 
		//if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
		
		String name="David";
		if (!name.isEmpty()) {
			if(name.length() % 2 != 0 && name.length() >= 3) {
				int middle = name.length() / 2;
				System.out.println(name.charAt(middle));
			}else {
				System.out.println("string does not have an odd number of chars or 3 or more chars");
			}
		}else {
			System.out.println("string is empty");
		}	
		
		//String [] arr=name.split(" ");
		
		
		
	}

}
