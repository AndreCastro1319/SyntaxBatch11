package ProjectTasks.Task2;

public abstract class Marks {
    //We have to calculate the average of marks obtained in three subjects by student A and by student B.
    // Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average percentage of marks.
    // Provide implementation of abstract method in classes 'A' and 'B'.
    // The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B.
    // Test your code


    abstract void getPercentage();

}
    class StudentA extends Marks {
        double subject1;
        double subject2;
        double subject3;

        StudentA(double subject1, double subject2, double subject3) {
            this.subject1 = subject1;
            this.subject2 = subject2;
            this.subject3 = subject3;
        }

        public void getPercentage() {
            System.out.println("The average percentage of student A is " + (subject1 + subject2 + subject3 / 3));
        }
    }

    class StudentB extends StudentA {
        double subject4;

        StudentB(double subject1, double subject2, double subject3, double subject4) {
            super(subject1, subject2, subject3);
            this.subject4 = subject4;
        }

        @Override
        public void getPercentage() {
            System.out.println("The average percentage of student B is " + (subject1 + subject2 + subject3 + subject4 / 4));
        }
    }
