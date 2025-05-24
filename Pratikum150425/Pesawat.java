/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum150425;

/**
 *
 * @author FA506NF
 */
public class Pesawat extends Udara{
    private int muatan;
    
    public Pesawat(){
        
    }
    public Pesawat(String nama, int tahunProduksi, boolean mesin, int muatan){
        super(nama, tahunProduksi, mesin);
        this.muatan = muatan;
    }
    
    public int getMuatan(){
        return muatan;
    }
    
    public void setMuatan(int muatan){
        this.muatan = muatan;
    }
    
    public void reset(String nama, int tahunProduksi, boolean mesin, int muatan){
        setNama(nama);
        setTahunProduksi(tahunProduksi);
        setMesin(mesin);
        setMuatan(muatan);
    }
    
    public String Kategori(int muatan){
        if(muatan<=50)
            return"Muatan Kecil";
        else if(muatan <=150)
            return"Muatan sedang";
        else
            return"Muatan besar";
    }
    
    @Override
    public void cetak(){
        super.cetak();
        System.out.println("Muatan "+muatan+" penumpang");
        System.out.println("Kategori pesawat "+Kategori(muatan));
    }

    
}
