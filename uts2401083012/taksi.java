/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uts2401083012;

/**
 *
 * @author FA506NF
 */
public class taksi extends mobil{
    protected int tarifAwal;
    protected int tarifPerKm;
    
    public taksi(){
        
    }
    public taksi(int tarifAwal, int tarifPerKm){
        this.tarifAwal = tarifAwal;
        this.tarifPerKm = tarifPerKm; 
    }
    
    public int gettarifAwal(){
        return this.tarifAwal;
    }
    public int gettarifPerKm(){
        return this.tarifPerKm;
    }
    public void settarifAwal(int tarifAwal){
        this.tarifAwal = tarifAwal;
    }
    public void settarifPerKm(int tarifPerKm){
        this.tarifPerKm = tarifPerKm;
    }
    @Override
    public void Display(){
        System.out.println("Kendaraan Taksi");
        System.out.println("Jumlah Roda : "+this.jmlRoda);
        System.out.println("Warna : "+this.warna);
        System.out.println("Bahan Bakar : "+this.bahanBakar);
        System.out.println("Kapasitas Mesin : "+this.kapasitasMesin+" cc");
        System.out.println("Tarif Awal : Rp. "+this.tarifAwal);
        System.out.println("Tarif per - Km : Rp. "+this.tarifPerKm);
    }
}
