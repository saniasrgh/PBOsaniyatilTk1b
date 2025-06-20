/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes.tugas2;

/**
 *
 * @author FA506NF
 */
public class Rectangle extends Shape{
    protected double width = 1.0;
    protected double length = 1.0;
    
    public Rectangle(){
        
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    @Override
    public double getArea(){
        return width * length;
    }
    @Override
    public double getPerimeter(){
        return 2 * (width + length);
    }
    @Override
    public String toString(){
        return "Rectangle[" + super.toString() + ", width=" + width + ", length=" + length + "]";
    }
}
