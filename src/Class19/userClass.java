package Class19;

public class userClass {
    //Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
    // Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
    // Print users name, mobile number and address in userDetails method. Test your code.

    String name;
    long mobileNumber;
        userClass() {
        }
        userClass(String name, int mobileNumber){
            this.name=name;
            this.mobileNumber=mobileNumber;
        }
}
       class userInfo extends userClass {
           String userAddress;

           public userInfo(String name, int mobileNumber, String userAddress) {
               super(name, mobileNumber);
               this.userAddress = userAddress;
           }

           void userDetails() {
               System.out.println("Name = " + name + " Mobile number = " + mobileNumber + " Address = " + userAddress);
           }
       }
           class Tester{
               public static void main(String[]args){
                userInfo details=new userInfo("Jimmy",571332284,"14602 Robin Glen Way");
                details.userDetails();

               }
           }

