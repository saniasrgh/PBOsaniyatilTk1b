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
public class Mobil extends Kendaraan {
    private int jumlahPintu;
    private String mesin;
    
    public Mobil(String merk, int tahun, int jumlahPintu, String mesin){
        super(merk, tahun);
        this.jumlahPintu=jumlahPintu;
        this.mesin=mesin;
    }
    
    public int getJumlahPintu(){
        return jumlahPintu;
    }
    
    public void setJumlahPintu(int jumlahPintu){
        this.jumlahPintu=jumlahPintu;
    }
    
    public String getTransmisi(){
        return mesin;
    }
    
    public void setTransmisi(String mesin){
        this.mesin=mesin;
    }
    
    @Override
    public void nyalakan(){
        System.out.println("Mobil "+ merk + " dinyalakan");
    }
    
    @Override
    public void matikan(){
        System.out.println("Mobil "+ merk + " dimatikan");
    }
    
    @Override
    public void info(){
        System.out.println("Mobil "+merk+", Tahun "+tahun+", dengan "+jumlahPintu+" pintu, Mesin : " +mesin);
    }
    
    @Override
    public void periksaKondisi(){
        System.out.println("Periksa oli, rem, dan tekanan ban mobil "+merk+".");
    }
    
    @Override
    public void servis(){
        System.out.println("Mobil "+merk+" dijadwalkan servis setiap +10.000 km.");
    }
    
}
