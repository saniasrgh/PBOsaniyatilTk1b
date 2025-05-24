/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum220425;

/**
 *
 * @author FA506NF
 */
public class Silinder extends Lingkaran{
    private double tinggi;
    
    public Silinder(){
        super();
    }
    public Silinder(double r, double t){
        super(r);
        this.tinggi=t;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public double getTinggi(){
        return tinggi;
    }
    public double getVolume(){
        return Math.PI * getR() * getR() * tinggi;
    }
    @Override
    public double getLuas(){
        double r = getR();
        return 2 * Math.PI * r * r + 2 * Math.PI * r * tinggi;
    }
    @Override
    public String toString(){
        return "Silinder dengan jari - jari : "+getR()+ " dan tinggi : "+tinggi;
        
    }
}
