package Class22.example2;

public class Person {
    String name;
    Person(String name){
        this.name=name;

    }
    void eat(){
        System.out.println( name+ " eating ");
    }
    void performDailyTasks(){
        System.out.println("Eat sleep repeat");
    }
}
    class Employee extends Person{
        Employee(String name) {
            super(name);
        }
        void performDailyTasks(){
            System.out.println(name+" Working all the day in office and reading emails at night");
        }
    }
    class Student extends Person{
    Student (String name) {
        super(name);
        }
        void performDailyTasks(){
            System.out.println(name+" Attending the classes at day reading at night");
        }
    }

    class Teacher extends Person{
     Teacher (String name){
         super(name);
     }
        void performDailyTasks(){
            System.out.println(name+" Giving homeworks a day party at night");
        }
        void designClass(){
            System.out.println( name+"Create repls and design new classes");
        }
    }