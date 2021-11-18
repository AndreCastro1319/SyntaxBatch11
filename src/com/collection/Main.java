package com.collection;

public class Main {
    public static void main(String[]args){
        car Car=new car();
        Car.go();
        System.out.println(Car.wheels);
        System.out.println(Car.doors);
        bicycle Bicycle=new bicycle();

        Bicycle.stop();

        System.out.println(Car.speed);
        System.out.println(Bicycle.speed);


    }
}
