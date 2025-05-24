/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum200525;

/**
 *
 * @author FA506NF
 */
public class Laptop extends Elektronik{
    private int UkuranLayar;
    private int KapasitasRAM;
    
    public Laptop(){
        
    }
    public int getUkuranLayar(){
        return UkuranLayar;
    }
    public void setUkuranLayar(int UkuranLayar){
        this.UkuranLayar = UkuranLayar;
    }
    public int getKapasitasRAM(){
        return KapasitasRAM;
    }
    public void setKapasitasRAM(int KapasitasRAM){
        this.KapasitasRAM = KapasitasRAM;
    }
    @Override
    public void Display(){
        System.out.println("Kelas Laptop");
        System.out.println("Merek : "+super.getMerek());
        System.out.println("Tahun Produksi : "+super.getTahunProduksi());
        System.out.println("Garansi : "+super.getGaransi());
        System.out.println("Kapasitas RAM : "+this.KapasitasRAM+" gb");
        System.out.println("Ukuran Layar : "+this.UkuranLayar+" inchi");
    }
}
