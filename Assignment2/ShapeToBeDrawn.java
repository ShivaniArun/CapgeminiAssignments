package Assignment2;
public class ShapeToBeDrawn {
    public static void main(String[] args) {
        Shape s1 = new Line();
        s1.draw();
        Shape s2 = new Rectangle();
        s2.draw();
        Shape s3 = new Cube();
        s3.draw();
    }
}
abstract class Shape {
    abstract void draw();
}
class Line extends Shape {
    @Override
    void draw() {
        System.out.println("This is a line");
    }
}
class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("This is a rectangle");
    }
}
class Cube extends Shape {
    @Override
    void draw() {
        System.out.println("This is a cube");
    }
}