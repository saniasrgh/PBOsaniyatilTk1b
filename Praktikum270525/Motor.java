/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum270525;

/**
 *
 * @author akels
 */
public class Motor extends Kendaraan {
    private String jenisHelm;
    private int cc;
    
    public Motor(String merk, int tahun, String jenisHelm, int cc){
        super(merk, tahun);
        this.jenisHelm=jenisHelm;
        this.cc=cc;
    }
    
    public String getJenisHelm(){
        return jenisHelm;
    }
    
    public void setJenisHelm(String jenisHelm){
        this.jenisHelm=jenisHelm;
    }
    
    public int getCc(){
        return cc;
    }
    
    public void setCc(int cc){
        this.cc=cc;
    }
    
    @Override
    public void nyalakan(){
        System.out.println("Motor "+merk+" dinyalakan.");
    }
    
    @Override
    public void matikan(){
        System.out.println("Motor "+merk+" dimatikan.");
    }
    
    @Override
    public void info(){
        System.out.println("Motor "+merk+", Tahun "+tahun+", Helm "+jenisHelm+", "+cc+" CC.");
    }
    
    @Override
    public void periksaKondisi(){
        System.out.println("Periksa oli, rem, dan tekanan ban motor "+merk+".");
    }
    
    @Override
    public void servis(){
        System.out.println("Motor "+merk+" dijadwalkan servis setiap +3.000 km.");
    }
}
