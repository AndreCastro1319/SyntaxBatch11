package Class19.Test;

public class Task3 {
//Create 1 class with a private method that has 3 overloaded forms.
// Then call each overloaded method with specific arguments and observe result.

    private void method(){
        System.out.println("void method");
    }
    private int method(int num){
        System.out.println("int method");
        return num;
    }
    private int method(String str){
        System.out.println("str method");
        return 5;
    }

    public static void main(String[] args) {
        Task3 obj=new Task3();
        obj.method();
        obj.method(5);
        obj.method("Jimmy");
    }
}
