package Class12Hw;

public class HwTask5 {
//Write a method to return whether given number is prime or not?
	
	void primeNumber ( int a) {
		
		if (a>1) {
			for(int i = 2; i<a;){
				if(a % i==0) {
					System.out.println(a+" is not a prime number");
					break;
				}else {
					System.out.println(a+" is a prime number");
					break;
				}
			}
			
		}
	}
	
	   public static void main(String[]args) {
		   
		   HwTask5 num = new HwTask5();
		   
		   num.primeNumber(4);
	   
	
	}
	
	
	
	
}
