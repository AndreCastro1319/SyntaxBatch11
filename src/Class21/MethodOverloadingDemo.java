package Class21;

public class MethodOverloadingDemo {


    //public void method(int num){
        // System.out.println(num);
        //System.out.println("Hello");
        //System.out.println("Java");
  //  } Cannot overload by just changing the access modifier

    //static public void method(int num){
    // System.out.println(num);
    //System.out.println("Hello");
    //System.out.println("Java");
    //  } Cannot overload by just changing the non access modifier
    void method (int number){
        System.out.println(number);
    }
    void method(String name) {
        System.out.println(name);
        System.out.println("hello");
        System.out.println("java");
    }

    void method(String name, int num) {
        System.out.println(name);
        System.out.println("hello");
        System.out.println("java");
    }
    void method( int num, String name) {
        System.out.println(name);
        System.out.println("hello");
        System.out.println("java");
    }
    public static void main(String[] args) {
        MethodOverloadingDemo md=new MethodOverloadingDemo();
        md.method(10);
    }
}
