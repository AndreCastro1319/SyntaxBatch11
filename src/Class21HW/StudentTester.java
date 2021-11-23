package Class21HW;

public class StudentTester {
    public static void main(String[] args) {

        Student [] students ={new SyntaxStudent(),new CollegeStudent(),new SchoolStudent()};
        for (Student student:students){
            student.Study();
            student.Review();

            Student student1=new SyntaxStudent();
            SyntaxStudent syntaxStudent = (SyntaxStudent) student1;
            syntaxStudent.Break();

            Student student2=new CollegeStudent();
            CollegeStudent collegeStudent = (CollegeStudent) student2;
            collegeStudent.Party();

            Student student3=new SchoolStudent();
            SchoolStudent schoolStudent=(SchoolStudent) student3;
            schoolStudent.Sports();
        }



    }
}
