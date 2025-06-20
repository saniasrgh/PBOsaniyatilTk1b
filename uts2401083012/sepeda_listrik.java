/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts2401083012;

/**
 *
 * @author FA506NF
 */
public class sepeda_listrik extends sepeda{
    protected int kecepatanMaks;
    protected int jarakTempuh;
    
    public sepeda_listrik(){
        
    }
    public sepeda_listrik(int kecepatanMaks, int jarakTempuh){
        this.kecepatanMaks = kecepatanMaks;
        this.jarakTempuh = jarakTempuh; 
    }
    
    public int getKecepatanMaks(){
        return this.kecepatanMaks;
    }
    public int getJarakTempuh(){
        return this.jarakTempuh;
    }
    public void setKecepatanMaks(int kecepatanMaks){
        this.kecepatanMaks = kecepatanMaks;
    }
    public void setJarakTempuh(int jarakTempuh){
        this.jarakTempuh = jarakTempuh;
    }
    @Override
    public void Display(){
        System.out.println("Kendaraan Sepeda Listrik");
        System.out.println("Warna : "+this.warna);
        System.out.println("Jumlah Roda : "+this.jmlRoda);       
        System.out.println("Jumlah Sadel : "+this.jmlSadel);
        System.out.println("Jumlah Gir : "+this.jmlGir);
        System.out.println("Kecepatan Maksimal : "+this.kecepatanMaks+" /km");
        System.out.println("Jarak Tempuh : "+this.jarakTempuh+" km");
    }
}
