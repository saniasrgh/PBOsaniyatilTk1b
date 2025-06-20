/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubes.tugas2;

/**
 *
 * @author FA506NF
 */
public class Square extends Rectangle{
    public Square(){
        
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }
    
    @Override
    public double getArea() {
    return super.getArea(); // optional override
    }

    @Override
    public double getPerimeter() {
    return super.getPerimeter(); // optional override
    }

    @Override
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setLength(double side){
        super.setLength(side);
        super.setWidth(side);
    }
    @Override
    public String toString(){
        return "Square[" + super.toString() + "]";
    }
}
