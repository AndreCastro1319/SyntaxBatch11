package JavaUtili.Matchutili;

public class decimalChangeMethod {
    static double change(double value, int decimalpoint) {
        value = value * Math.pow(10, decimalpoint);
        value = Math.floor(value);
        value = value / Math.pow(10, decimalpoint);
        System.out.println(value);
        return value;
    }
}
