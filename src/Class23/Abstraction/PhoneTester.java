package Class23.Abstraction;

import Class22HW.*;

public class PhoneTester {
    public static void main(String[] args) {

    Iphone iphone = new Iphone();
    iphone.displayPictures();
    iphone.unlockPhone();
    iphone.makePhoneCalls();
    iphone.sendText();

    Samsung samsung = new Samsung();
    samsung.displayPictures();
    samsung.unlockPhone();
    samsung.makePhoneCalls();

        Phone[] phoness={new Samsung(),new Iphone()};
        for(Phone phone:phoness){

            if (phone instanceof Iphone){
                ((Iphone)phone).displayPictures();
            }

        }
    }
}