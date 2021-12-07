package ProjectTaskReview.Task4;

public class VehicleTester {
    public static void main(String[] args) {

        Vehicle [] vehicles={new Sedan(5000,60),new Truck(5000,66)};
        for(Vehicle vehicle:vehicles){
            System.out.println(vehicle.calculateSalePrice());
        }
    }
}
