package ProjectTasks.Task1;

import ProjectTasks.Task1.Circle;
import ProjectTasks.Task1.Shape;
import ProjectTasks.Task1.Square;

public class ShapeTester {
    public static void main(String[] args) {
        Shape[] shapes={new Circle(5,3.14),new Square(8,6)};
        for(Shape shape:shapes){
            shape.calculateArea();
            shape.calculatePerimeter();
        }
    }
}
