package com.collection;

public class Tsk3 {

    private Tsk3(){
        System.out.println("1");
    }
    Tsk3(String name){
        System.out.println("1");
    }
    protected Tsk3(int age){
        System.out.println("1");
    }
    public Tsk3(double weight){
        System.out.println("1");
    }
    public static void main(String[]args){
        new Tsk3();
        new Tsk3("name");
        new Tsk3(10);
        new Tsk3(45.2);
    }

}
