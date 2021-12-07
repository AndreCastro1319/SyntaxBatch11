package classReview2;

public abstract class  Teacher extends Human{

    protected double salary;
    public Teacher(String name, String lastName,double salary) {
        super(name, lastName);
        this.salary=salary;
    }
   protected void teach(){
        System.out.println("Every teacher teaches");
    }
    public void getPaid() {
        System.out.println("Teacher gets paid "+salary);
    }
        public void hasVacation(){
            System.out.println("All teachers should have vacation");
        }

public abstract void takeExam();
}
class MathTeacher extends Teacher{
    String subject;
    public MathTeacher(String name,String lastName,double salary,String subject){
        super(name, lastName, salary);
        this.subject=subject;
    }
   public void speak(){
        System.out.println(name+" "+lastName+" speaks math language");
    }
    public void speak(String language){
        System.out.println(name+" "+ lastName+"speaks math and " +language+" language");
    }
   public void takeExam(){
        System.out.println(name+" "+lastName+" takes exam on "+subject);
    }
    public void hasVacation(){
       System.out.println(name+" "+lastName+" have 30 days vacation");
   }
   protected void teach(){
       System.out.println(name+" teaches "+subject);
   }
}