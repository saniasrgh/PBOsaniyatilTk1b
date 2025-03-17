/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum110325;

/**
 *
 * @author FA506NF
 */
import java.util.Scanner;
public class KendaraanMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String jenis;
        String merk;
        String warna;
        int thn;
        int harga;
        int v;
     
        System.out.print("Masukkan jenis kendaraan : ");
        jenis=in.nextLine();
        System.out.print("Masukkan merk kendaraan : ");
        merk=in.nextLine();
        //in.nextLine(); //pembersih line untuk string berikutnya
        System.out.print("Warna kendaraan : ");
        warna=in.nextLine();
        System.out.print("Tahun keluaran :  ");
        thn=in.nextInt();
        System.out.print("Harga sewa kendaraan Rp ");
        harga=in.nextInt();
        System.out.print("Kecepatan kendaraan / jam : ");
        v=in.nextInt();
        
        //objek baru class kendaraan
        Kendaraan kend = new Kendaraan(jenis, merk, warna, thn);
        kend.InfoKendaraan();
        kend.CekHarga(harga);
        kend.Kecepatan(v);
    }
    
}
