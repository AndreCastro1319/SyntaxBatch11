package Class22.example1;

import Class22.example1.Father;

public class Son extends Father {
    Son(String name) {
        super(name);
    }

    void sleep() {
        System.out.println(name + "like to sleep 10 hours");
    }

    void eat() {
        System.out.println(name + "i like to eat kabab");
    }
    void playVideoGames(){
        System.out.println("I can play video games");
    }
}