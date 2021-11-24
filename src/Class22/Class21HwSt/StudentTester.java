package Class22.Class21HwSt;


public class StudentTester {
    public static void main(String[] args) {

        Student[] students = {new SyntaxStudent(), new CollegeStudents(), new SchoolStudents()};
        for (Student student : students) {
            student.study();
            student.DoHomework();
            student.practice();

            if (student instanceof SyntaxStudent) {
                ((SyntaxStudent) student).doResearch();
            }
        }
    }
}