package Class22HW;

public class ComputerTester {
    public static void main(String[] args) {
        Computer[] computers={new Apple("Apple"),new Lenovo("Lenovo"),new HP("HP"),new DELL("Dell")};
         for(Computer computer:computers){
             computer.turnOn();
             computer.turnOff();

             if (computer instanceof Apple){
                 ((Apple)computer).graphics();
             }
             if (computer instanceof Lenovo){
                 ((Lenovo)computer).display();
             }
             if (computer instanceof HP){
                 ((HP)computer).connectivity();
             }
             if (computer instanceof DELL){
                 ((DELL)computer).storage();
             }

         }
    }
}
