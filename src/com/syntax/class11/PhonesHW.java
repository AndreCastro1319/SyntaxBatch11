package com.syntax.class11;

public class PhonesHW {

	public static void main(String[] args) {
		
		Phone phone=new Phone();
		phone.brand="Iphone";
		phone.model="Iphone 12";
		phone.color="Red";
		phone.size="Large";
		phone.memory=160;
		phone.year=2020;
		
		System.out.println("phone brand is "+phone.brand);
		System.out.println("phone model is "+phone.model);
		System.out.println("phone color is "+phone.color);
		System.out.println("phone size is "+phone.size);
		System.out.println("phone memory is "+phone.memory+" gb ");
		System.out.println("phone year is "+phone.year);
		phone.siri();
		
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");
	
		Phone nok=new Phone();
	
		nok.brand="Nokia";
		nok.model="800TT";
		nok.color="Blue";
		nok.size="Small";
		nok.memory=1;
		nok.year=1880;
	
		System.out.println("nok brand is "+nok.brand);
		System.out.println("nok model is "+nok.model);
		System.out.println("nok color is "+nok.color);
		System.out.println("nok size is "+nok.size);
		System.out.println("nok memory is "+nok.memory+" mb ");
		System.out.println("nok year is "+nok.year);
		nok.snake();
		
		System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - ");
	
		
		Phone and=new Phone();
		
		and.brand="Android";
		and.model="Samsung S10";
		and.color="White";
		and.size="Medium";
		and.memory=100;
		and.year=2021;
		
		System.out.println("and brand is "+and.brand);
		System.out.println("and model is "+and.model);
		System.out.println("and color is "+and.color);
		System.out.println("and size is "+and.size);
		System.out.println("and memory is "+and.memory+" mb ");
		System.out.println("and year is "+and.year);
		and.alexa();
		
	}

}
