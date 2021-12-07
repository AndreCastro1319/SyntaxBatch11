package ProjectTaskReview;

public interface Shape {

    void calculateArea(double a);
    void calculatePerimeter(double a);
}

class Circle implements Shape{

    @Override
    public void calculateArea(double radius) {
        System.out.println("Area of a Circle "+(Math.round(Math.PI*Math.pow(radius,2))));
    }

    @Override
    public void calculatePerimeter(double radius) {
        System.out.println("Perimeter of circle "+(2*Math.PI*radius));

    }
}
class Square implements Shape{

    @Override
    public void calculateArea(double length) {
        System.out.println("Area of square "+(length*length));
    }

    @Override
    public void calculatePerimeter(double length) {
        System.out.println("Perimeter of circle "+(4*length));
    }

    static double change(double value, int decimalpoint){
        value=value*Math.pow(10,decimalpoint);
        value=Math.floor(value);
        value=value/Math.pow(10,decimalpoint);
        System.out.println(value);
        return value;
    }
}