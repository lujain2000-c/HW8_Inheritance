public class Circle extends Shape{

    private double radius = 1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return radius * radius * 3.14;
    }
    public double getPerimeter(){
        return 2 * 3.14 * radius;
    }

    public String toString(){
        return "Circle Area: "+ radius * radius * 3.14+" Circle Perimeter: "+ 2 * 3.14 * radius ;

    }
}
