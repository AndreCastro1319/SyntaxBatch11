package Class24.Interface;

public interface  Person {
    //private void eat(); not allowed
    //protected void eat(); not allowed
        void eat();
        void sleep();

}
interface Employee {
    void work();
}
interface SyntaxEmployees extends Employee,Person {
    void teach();

}
class SDETInstructor implements SyntaxEmployees{
   @Override
    public void sleep(){
        System.out.println("Employee sleeping");
    }

    public void eat(){
        System.out.println("Employee eating");
    }

    @Override
    public void teach() {
        System.out.println("Employee teaching");
    }
    public void work(){
        System.out.println("Creating more Replits");
    }
}