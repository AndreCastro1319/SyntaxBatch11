package Class13Hw;



public class HomeworkPart2 {
	public static String reverseString(String name) {
		 String reversedString = "";
		    
		    for(int i = name.length()-1; i>=0; i--){
		      reversedString = reversedString + name.charAt(i);
		    }
		    			return reversedString;
	}
	
	
	
	
	public static void main(String[]args) {
	String reversedString=reverseString("Sunday");
    System.out.println(reversedString);
    
}
	
	
	}
	
	