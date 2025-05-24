/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum250325;

/**
 *
 * @author FA506NF
 */
public class PersegiPanjangEnkapsulasi {
    int pjg;
    int lbr;
    private static int jumObjek = 0;
    
    //Konstruktor Default
    public PersegiPanjangEnkapsulasi(){
        this.pjg = 0;
        this.lbr = 0;
        jumObjek++;
    }
    //Konstruktor dengan parameter
    public PersegiPanjangEnkapsulasi(int pjgbaru, int lbrbaru){
        this.pjg = pjgbaru;
        this.lbr = lbrbaru;
        jumObjek++;
    }
    //setter dan getter untuk panjang
    public void setPanjang(int pjgbaru){
        this.pjg = pjgbaru;
    }
    //setter dan getter untuk lebar 
    public void setLebar(int lbrbaru){
        this.lbr = lbrbaru;
    }
    public int getLebar(){
        return lbr;
    }
    //Getter untuk jumlah objek
    public static int getjumObjek(){
        return jumObjek;
    }
    //Method untuk menghitung luas
    public int getLuas(){
       return pjg * lbr; 
    }
    //Method untuk menghitung keliling
    public int getKeliling(){
        return 2*(pjg + lbr);
    }
            
}
