package ProjectTasks.Task2;

public class MarksTester {
    public static void main(String[] args) {
        Marks[] marks={new StudentA(10,50,60),new StudentB(10,50,60,80)};
        for(Marks marks1:marks){
            marks1.getPercentage();
        }
    }

}
