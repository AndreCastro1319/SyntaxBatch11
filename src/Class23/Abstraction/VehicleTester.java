package Class23.Abstraction;

public class VehicleTester {
    public static void main(String[] args) {
BMW bmw = new BMW("13654","Sedan","BMW","X5");
      //  BMW bmw2 = new BMW("13654","Sedan","BMW","X5");

   bmw.printVehicleCount();
   bmw.speed();
   bmw.start();
   bmw.drive();
   bmw.stop();

   Vehicle toyota=new Toyota("a12ff3","Sedan","Toyota","Yaris");
    }
}
