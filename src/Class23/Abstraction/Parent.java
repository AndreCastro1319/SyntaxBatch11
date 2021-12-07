package Class23.Abstraction;

public abstract class Parent {
    abstract void method1();
    abstract void method2();
}
abstract class Child extends Parent{
    @Override
    void method1() {
        System.out.println("method1");
    }
}
class GrandChild extends Child{
    @Override
    void method2() {
        System.out.println("Method two from Grandchild");
    }
}
class Tester{
    public static void main(String[] args) {
        GrandChild child= new GrandChild();
        child.method1();
        child.method2();
    }
}