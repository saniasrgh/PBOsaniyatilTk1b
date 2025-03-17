/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum110325;

/**
 *
 * @author FA506NF
 */
public class AksiMobil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // buat object baru
        Mobil mobilku = new Mobil();
        mobilku.merk="Rubicon";
        mobilku.plat="BA 1607 S";
        mobilku.tahun=2024;
        mobilku.warna="Abu - Abu";
        
        
        System.out.println("---Data Mobil---");
        System.out.println("Merk mobil :  "+mobilku.merk);
        System.out.println("Plat mobil : "+mobilku.plat);
        System.out.println("Tahun keluaran :  "+mobilku.tahun);
        System.out.println("Warna mobil : "+mobilku.warna);
        
        Mobil mobilx = new Mobil();
        mobilx.merk="Mitsubishi Pajero";
        mobilx.plat="BA 0611 R";
        mobilx.tahun=2024;
        mobilx.warna="Hitam";
        
        System.out.println("---------------");
        System.out.println("---Data Mobil---");
        System.out.println("Merk mobil :  "+mobilx.merk);
        System.out.println("Plat mobil : "+mobilx.plat);
        System.out.println("Tahun keluaran :  "+mobilx.tahun);
        System.out.println("Warna mobil : "+mobilx.warna);
        
        System.out.println("---------------");
        mobilku.MobilAktif(); //pemanggilan method tanpa return
        System.out.println(mobilku.SuaraMobil()); //pemanggilan method
    }
    
}
