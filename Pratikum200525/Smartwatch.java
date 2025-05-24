/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum200525;

/**
 *
 * @author FA506NF
 */
public class Smartwatch extends Smartphone{
    private int ukuranlayar;
    private boolean tahanair;
    
    public Smartwatch(){
        
    }
    public int getUkuranLayar(){
        return ukuranlayar;
    }
    public void setUkuranLayar(int ukuranlayar){
        this.ukuranlayar = ukuranlayar;
    }
    public boolean getTahanAir(){
        return tahanair;
    }
    public void setTahanAir(boolean tahanair){
        this.tahanair = tahanair;
    }
    @Override
    public void Display(){
        System.out.println("Kelas Smartwatch");
        System.out.println("Merek : "+super.getMerek());
        System.out.println("Tahun Produksi : "+super.getTahunProduksi());
        System.out.println("Garansi : "+super.getGaransi()+" tahun");
        System.out.println("Kapasitas Baterai : "+super.getKapasitasBaterai()+" mAh");
        System.out.println("Jumlah Kamera : "+super.getJumlahKamera());
        System.out.println("Ukuran Layar : "+this.ukuranlayar);
        System.out.println("Tahan Air : "+this.tahanair);
    
    }
}
