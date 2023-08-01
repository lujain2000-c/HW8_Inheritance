// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Circle c = new Circle("Red", true, 7.0);
        System.out.println(c.toString());
        System.out.println(c.getRadius());
        System.out.println(c.getColor());
        System.out.println(c.isFilled());

        Rectangle r = new Rectangle("Blue", true, 7.0,10.0);
        System.out.println(r.toString());
        System.out.println(r.getWidth());
        System.out.println(r.getLength());
        System.out.println(r.getColor());
        System.out.println(r.isFilled());

        Square s = new Square("red", true, 7.0,7.0);
        System.out.println(s.toString());
        System.out.println(s.getWidth());
        System.out.println(s.getLength());
        System.out.println(s.getColor());
        System.out.println(r.isFilled());


    }
}