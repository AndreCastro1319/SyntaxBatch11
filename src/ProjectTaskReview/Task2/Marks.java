package ProjectTaskReview.Task2;

public abstract class Marks {
    double course1Marks;
    double course2Marks;
    double course3Marks;

    public Marks(double course1Marks, double course2Marks, double course3Marks) {
    }

    abstract double getPercentage();

}
class A extends Marks{
    public A(double course1Marks, double course2Marks, double course3Marks){
        super(course1Marks,course2Marks,course3Marks);
    }
    double getPercentage() {
        return (course1Marks + course2Marks + course3Marks);
    }
}
class B extends Marks{
    double course4Marks;
    public B(double course1Marks, double course2Marks, double course3Marks, double course4Marks){
        super(course1Marks,course2Marks,course3Marks);
        this.course4Marks=course4Marks;
    }

    @Override
    double getPercentage() {
         return (course1Marks+course2Marks+course3Marks+course4Marks/4);
    }
}
