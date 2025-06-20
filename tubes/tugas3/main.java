/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tubes.tugas3;

/**
 *
 * @author FA506NF
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        GeometricObject c = new Circle(5.0);
        System.out.println(c);
        System.out.println("Area: " + c.getArea());
        System.out.println("Perimeter: " + c.getPerimeter());

        System.out.println("------");

        GeometricObject r = new Rectangle(4.0, 6.0);
        System.out.println(r);
        System.out.println("Area: " + r.getArea());
        System.out.println("Perimeter: " + r.getPerimeter());
    }
}
