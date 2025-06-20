/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts2401083012;

/**
 *
 * @author FA506NF
 */
public class truk extends mobil{
    protected int muatanMaks;
    
    public truk(){
        
    }
    public truk(int muatanMaks){
        this.muatanMaks = muatanMaks;
    }
    public int getMuatanMaks(){
        return muatanMaks;
    }
    public void setMuatanMaks(int muatanMaks){
        this.muatanMaks = muatanMaks;
    }
    @Override
    public void Display(){
        System.out.println("Kendaraan Truk");
        System.out.println("Jumlah Roda : "+this.jmlRoda);
        System.out.println("Warna : "+this.warna);
        System.out.println("Bahan Bakar : "+this.bahanBakar);
        System.out.println("Kapasitas Mesin : "+this.kapasitasMesin+" cc");
        System.out.println("Maksimal Muatan : "+this.muatanMaks);
    }
}
