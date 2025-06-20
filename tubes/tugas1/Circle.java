/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes.tugas1;

/**
 *
 * @author FA506NF
 */
public class Circle extends Shape{
    private double radius = 1.0;
    
    public Circle(){
        
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    @Override
    public String toString(){
    return "Type : Circle "+
           "\nRadius : " + radius +
           "\nArea : " + getArea() +
           "\nPerimeter : " + getPerimeter() +
           "\nColor : " + getColor() +
           "\nFilled : " + isFilled();
    }
}
