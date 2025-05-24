/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum200525;

/**
 *
 * @author FA506NF
 */
public class Smartphone extends Elektronik{
    private int KapasitasBaterai;
    private int JumlahKamera;
    
    public Smartphone(){
        
    }
    public int getKapasitasBaterai(){
        return KapasitasBaterai;
    }
    public void setKapasitasBaterai(int KapasitasBaterai){
        this.KapasitasBaterai = KapasitasBaterai;
    }
    public int getJumlahKamera(){
        return JumlahKamera;
    }
    public void setJumlahKamera(int JumlahKamera){
        this.JumlahKamera = JumlahKamera;
    }
    @Override
    public void Display(){
        System.out.println("Kelas Smartphone");
        System.out.println("Merek : "+super.getMerek());
        System.out.println("Tahun Produksi : "+super.getTahunProduksi());
        System.out.println("Garansi : "+super.getGaransi()+" tahun");
        System.out.println("Kapasitas Baterai : "+this.KapasitasBaterai+" mAh");
        System.out.println("Jumlah Kamera : "+this.JumlahKamera);
        
    }
}
