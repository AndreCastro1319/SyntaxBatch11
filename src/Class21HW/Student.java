package Class21HW;

public class Student {
    //Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
    //Define common behavior within parent class and override some of the methods in child classes
    //Define some methods specific to child classes
    //Write example of achieving run time polymorphism

    void Study() {
        System.out.println("Studies 24/7");
    }

    void Review() {
        System.out.println("Reviews 24/7");
    }
}
    class SyntaxStudent extends Student {
        void Study() {
            System.out.println("Study Syntax courses 5 times a week");
        }

        void Review() {
            System.out.println("Reviews Syntax courses 5 times a week");
        }

        void Break() {
            System.out.println("Have break twice a week");
        }
    }
        class CollegeStudent extends Student {
            void Study() {
                System.out.println("Studies 3 times a week");
            }

            void Review() {
                System.out.println("Reviews 3 times a week");
            }

            void Party() {
                System.out.println("Parties 4 times a week");
            }
        }
            class SchoolStudent extends Student{
                void Study(){
                    System.out.println("Studies 8 hours a day 5 times a week");
                }
                void Review(){
                    System.out.println("Reviews 8 hours a day 5 times a week");
                }
                void Sports(){
                    System.out.println("Focus on sports a lot");
                }
            }



