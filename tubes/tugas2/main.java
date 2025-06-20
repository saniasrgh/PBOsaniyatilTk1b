/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tubes.tugas2;

/**
 *
 * @author FA506NF
 */
public class main {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        // Upcast Circle to Shape
        Shape s1 = new Circle(5.5, "Red", false);
        System.out.println(s1);                    // Circle's toString()
        System.out.println(s1.getArea());          // Circle's getArea()
        System.out.println(s1.getPerimeter());     // Circle's getPerimeter()
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(((Circle)s1).getRadius()); // Downcast to getRadius()

        System.out.println("---");

        Circle c1 = (Circle)s1; // Downcast to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        // Dihapus: Shape s2 = new Shape(); // ERROR karena Shape abstract

        // s3 diganti menjadi s2
        Shape s2 = new Rectangle(1.0, 2.0, "RED", false); // Upcast Rectangle
        System.out.println("---");
        System.out.println(s2);
        System.out.println(s2.getArea());
        System.out.println(s2.getPerimeter());
        System.out.println(s2.getColor());
        System.out.println(((Rectangle)s2).getLength()); // Downcast to getLength()

        Rectangle r1 = (Rectangle)s2; // Downcast to Rectangle
        System.out.println("---");
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        // s4 diganti menjadi s3
        Shape s3 = new Square(6.6); // Upcast Square to Shape
        System.out.println("---");
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getColor());
        System.out.println(((Square)s3).getSide()); // Downcast to getSide()

        Rectangle r2 = (Rectangle)s3; // Upcast Square to Rectangle
        System.out.println("---");
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        System.out.println(((Square)r2).getSide()); // Cast to Square to getSide()
        System.out.println(r2.getLength());

        Square sq1 = (Square)r2; // Downcast Rectangle to Square
        System.out.println("---");
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
    
    

