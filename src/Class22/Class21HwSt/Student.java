package Class22.Class21HwSt;

public class Student {
    void study (){
        System.out.println("Students must study");
    }
    void DoHomework(){
        System.out.println("Students must do homework");
    }
    void practice(){
        System.out.println("Students must practice");
    }
}
    class SyntaxStudent extends Student{
    @Override
    void study(){
        System.out.println("Students must study 25 hrs a week");
    }
    @Override
    void DoHomework() {
            System.out.println("Students must solve repls");
        }
        void doResearch() {
            System.out.println("Syntax student do additional research");
        }
    }
    class CollegeStudents extends Student{
    @Override
    void DoHomework() {
            System.out.println(" College student must do homework");

    }
    }
    class SchoolStudents extends Student{
        @Override
        void DoHomework() {
            System.out.println("");
        }
    }