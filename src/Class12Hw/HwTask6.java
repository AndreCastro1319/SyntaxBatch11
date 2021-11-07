package Class12Hw;

public class HwTask6 {
//Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
//	score > 90 - A
//	score >80 - B
//	score >70 - C
//	score > 50 - D
//	anything else - F
	
	
	char classGrades (int score) {
		char grade;
		if(score>=90) {
			grade='A';
		}else if(score <= 90 && score >= 80) {
			grade='B';
		}else if(score <= 80 && score >= 70) {
			grade='C';
		}else if (score <= 70 && score >= 60) {
			grade='D';
		}else if (score <=60) {
			grade='F';
		}else {
			grade='E';
		}
		return grade;
	
		}
	
		public static void main(String[]args) {
			
			HwTask6 grades = new HwTask6();
			
			System.out.println(grades.classGrades(80));
		}
	
	
	}
	
