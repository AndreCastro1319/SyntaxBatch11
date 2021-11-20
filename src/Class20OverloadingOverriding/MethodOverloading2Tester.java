package Class20OverloadingOverriding;

public class MethodOverloading2Tester {
    public static void main(String[] args) {
        MethodOverloading2.add(10,10);
        MethodOverloading2.add(10.55f,10.55f);
        MethodOverloading2.add(10,10.5);
        MethodOverloading2.add(10,10,10);
        MethodOverloading2.add(10.5,10.5);
        int[] arr={10,20,30};
        MethodOverloading2.add(arr);
        MethodOverloading2.add(20,40,60,80,100);

    }
}
