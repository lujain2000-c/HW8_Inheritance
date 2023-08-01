public class Square extends Rectangle {

    public Square() {
    }

    public Square(double width, double length) {
        super(width, length);
    }

    public Square(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }

    public double getSide() {
        return super.getWidth()  ;
    }

    public void setSide(double width) {// oooooooo
        super.setWidth(width);

    }
    public double getArea(){
        return super.getWidth() * 2;
    }
    public double getPerimeter(){
        return super.getWidth() * 4;
    }

    public String toString(){
        return "Square Area: "+super.getWidth() * 2+" Square Perimeter: "+ super.getWidth() * 4;

    }
}
