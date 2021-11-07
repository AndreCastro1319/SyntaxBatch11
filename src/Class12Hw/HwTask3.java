package Class12Hw;

public class HwTask3 {
//Create a method that will say Hello in different language based on the country that will passed when method is executed.
	
	void countries( String country) {
		String hello;
		switch(country) {
		
		case "Ecuador":
			hello="hola";
			break;
		case"USA":
			hello="hello";
			break;
		case "Germany":
			hello="grüezi";
			break;
		case"France":
			hello="BonJour";
			break;
			default:
				hello="Jiverish";
				
		}
		 System.out.println(hello);
	
	
	}
	}


