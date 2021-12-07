package Class24.Interface;

public interface I1 {
    void method();
    int age=10;
    static void method2(){
        System.out.println("I am method2 from interface 1");
    }
}
interface I2 {
    void method();
    int age=20;
    static void method2() {
        System.out.println("I am method2 from interface 2");
    }

    class Test implements I1, I2 {
        @Override
        public void method() {
            System.out.println(I1.age);
            System.out.println("I will be called for both methods from both Interfaces");
        }
    }

    class Main {
        public static void main(String[] args) {
            I1 i1 = new Test();
            i1.method();
            I2 i2 = new Test();
            i2.method();
            I1.method2();
            I2.method2();
        }
    }
}