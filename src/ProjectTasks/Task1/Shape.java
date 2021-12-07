package ProjectTasks.Task1;

public interface Shape {
//Create an Interface 'Shape' with undefined methods as calculateArea and calculatePerimeter.
// Create 2 classes Circle & Square that implements functionality defined in the Shape Interface.
// Test your code.



    void calculateArea();
    void calculatePerimeter();
}
class Circle implements Shape{


    double radius;
    double pie;
    Circle(double radius, double pie){
    this.radius=radius;
    this.pie=pie;
    }

    @Override
    public void calculateArea() {
        System.out.println("The  area of a circle is "+pie*radius*radius);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("The perimeter of a circle is "+2*pie*radius);
    }
}
class Square implements Shape {

    double length;
    double width;
Square(double length,double width){
this.length=length;
this.width=width;
}

    public void calculateArea() {
        System.out.println("the  area of a square is " + length * width);
    }


    public void calculatePerimeter() {
        System.out.println("the perimeter of a square is " + 2 * width + length);
    }
}



