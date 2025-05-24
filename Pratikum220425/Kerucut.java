/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum220425;

/**
 *
 * @author FA506NF
 */
public class Kerucut extends Lingkaran {
    private double tinggi;
    
    public Kerucut(){
        super();
    }
    public Kerucut(double r, double tinggi){
        super(r);
        this.tinggi = tinggi;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public double getTinggi(){
        return this.tinggi;
    }
    public double getVolume(){
        double r = getR();
        return (1.0/ 3) * Math.PI * r * r * tinggi ;
    }
    @Override
    public double getLuas(){
        double r = getR();
        double s = Math.sqrt( r * r + tinggi * tinggi);
        return Math.PI * r * (r + s) ;
    }
    @Override
    public String toString(){
        return "Kerucut dengan jari-jari : "+getR()+ "dan tinggi : "+tinggi;
    }
}

