/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum110325;

/**
 *
 * @author FA506NF
 */
public class Kendaraan {
    String jenis;
    String merk;
    String warna;
    int tahun;
    int harga;
    int v;
    
    //constructor
    public Kendaraan(String j, String m, String w, int t){
        this.jenis=j;
        this.merk=m;
        this.warna=w;
        this.tahun=t;
    }
    
    // method tanpa parametr
    public void InfoKendaraan(){
        System.out.println("------------------------");
        System.out.println("Data Kendaraan");
        System.out.println("------------------------");
        System.out.println("Jenis kendaraan : "+jenis);
        System.out.println("Merk kendaraan : "+merk);
        System.out.println("Warna kendaraan : "+warna);
        System.out.println("Tahun keluaran : "+tahun);
    }
    
    //method dengan parameter
    public void CekHarga(int harga){
        System.out.println("Harga sewa kedaraan : Rp "+harga);
    }
    
    public void Kecepatan(int v){
        if (v<20){
            System.out.println("Mending jalan kawan ");
        }
        else if (v>20 && v<=40){
            System.out.println("Santai kawan ");
        }
        else if(v>40 && v <=85){
            System.out.println("Ngebut dikit kawan");
        }
        else if(v>85){
            System.out.println("P balap kawan  ");
        }
    }
    
}
