package Class24.Interface;


public class PersonTester {
    public static void main(String[] args) {
        Person person=new SDETInstructor();
        person.eat();
        person.sleep();
        //person.teach();
        //person.work();

        Employee employee=new SDETInstructor();
        employee.work();
        //employee.eat;
        SyntaxEmployees syntaxEmployees=new SDETInstructor();
        syntaxEmployees.teach();
        syntaxEmployees.eat();
        syntaxEmployees.work();
        syntaxEmployees.sleep();


        SDETInstructor sdetInstructor=new SDETInstructor();
        sdetInstructor.eat();
        sdetInstructor.sleep();
        sdetInstructor.teach();
        sdetInstructor.work();
    }
}
