/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum200525;

/**
 *
 * @author FA506NF
 */
public class Gaming extends Laptop{
    private String KartuGrafis;
    private int RefreshRate;
    
    public Gaming(){
        
    }
    public String getKartuGrafis(){
        return KartuGrafis;
    }
    public void setKartuGrafis(String KartuGrafis){
        this.KartuGrafis = KartuGrafis;
    }
    public int getRefreshRate(){
        return RefreshRate;
    }
    public void setRefreshRate(int RefreshRate){
        this.RefreshRate = RefreshRate;
    }
    @Override
    public void Display(){
        System.out.println("Kelas Laptop");
        System.out.println("Merek : "+super.getMerek());
        System.out.println("Tahun Produksi : "+super.getTahunProduksi());
        System.out.println("Garansi : "+super.getGaransi());
        System.out.println("KapasitasRAM : "+super.getKapasitasRAM()+" gb");
        System.out.println("Ukuran Layar : "+super.getUkuranLayar()+" inchi");
        System.out.println("Kartu Grafis : "+this.KartuGrafis);
        System.out.println("Refresh Rate : "+this.RefreshRate+" Hz");
        
    }
}
