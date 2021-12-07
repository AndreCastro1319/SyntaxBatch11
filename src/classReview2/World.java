package classReview2;

public class World {
    public static void main(String[] args) {
        MathTeacher mathTeacher = new MathTeacher("John", "Smith", 4000, "Math");
       //human
        mathTeacher.printInfo();
        Human.eat();
        Human.sleep();

        //teacher
        mathTeacher.getPaid();
        mathTeacher.takeExam();

       //math teacher
        mathTeacher.teach();
        mathTeacher.speak("Spanish");

        Teacher teacher=new MathTeacher("Jane","Doe",4500,"math");
        teacher.getPaid();
        teacher.teach();
        teacher.takeExam();
        teacher.printInfo();
        teacher.speak();
        Teacher[] teachers = {new MathTeacher("John", "Smith", 4000, "Math")};
       for (Teacher teacher1 : teachers) {
            if (teacher1 instanceof MathTeacher) {
               ((MathTeacher)teacher1).speak("Spanish");

            }
        }
    }
}