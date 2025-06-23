/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum080425;

/**
 *
 * @author FA506NF
 */
/** NAMA : SANIYATIL WADA'I BR SARAGIH
    NIM  : 2401083012
    KELAS : 1B TEKNIK KOMPUTER
*/
import java.util.Scanner;
public class TestBankNasabahInput {
    public static void main(String[] args) {
        Bank b = new Bank();
        Scanner in = new Scanner(System.in);
        
        //Menambah nasabah tanpa tabungan
        b.tambahNasabah("Erwin", "Smith");
        b.tambahNasabah("Levi", "Akcerman");
        b.tambahNasabah("Armin", "Arlert");
        
        //Menambah nasabah dengan tabungan
        Tabungan tabungan1 = new Tabungan(100000);
        b.tambahNasabah("Mikasa", "Akcerman", tabungan1);
        
        Tabungan tabungan2 = new Tabungan(50000);
        b.tambahNasabah("Hanji", "Zoe", tabungan2);
        
        Tabungan tabungan3 = new Tabungan(80000);
        b.tambahNasabah("Annie", "Leonhart", tabungan3);
        
        //Menampilkan semua nasabah
        System.out.println("---Daftar Nasabah---");
        for(int i=0; i<b.getjumNasabah(); i++){
            System.out.println("Nasabah ke-" +(i+1)+" : "+b.getNasabah(i));
        }
        
        //mencari nasabah berdasarkan nama awal dan nama akhir
        System.out.println("\n--Pencarian berdasarkan nama awal dan nama akhir--");
        System.out.print("Masukkan nama awal nasabah yang dicari : ");
        String namaAwal1 = in.nextLine();
        System.out.print("Masukkan nama akhir nasabah yang dicari : ");
        String namaAkhir1 = in.nextLine();
        
        int hasilcari1 = b.searchNasabah(namaAwal1, namaAkhir1);
        if(hasilcari1 != -1){
            Nasabah nasabah = b.getNasabah(hasilcari1);
            System.out.print("Hasil cari untuk nama \""+namaAwal1+" "+namaAkhir1+"\": ");
            System.out.println("\nNasabah ditemukan di indeks "+hasilcari1+" : "+nasabah);
        } else {
            System.out.println("Nasabah dengan nama \""+namaAwal1+ " "+namaAkhir1+"\" tidak terdaftar.");
        }
        
        //Mencari nasabah berdasarkan nama awal saja
        System.out.println("\n--Pencarian berdasarkan nama awal--");
        System.out.print("Masukkan nama awal nasabah : ");
        String namaAwal2 = in.nextLine();
        
        int[] hasilcari = b.searchNasabah(namaAwal2);
        if(hasilcari.length > 0){
            System.out.println("\nHasil pencarian untuk nama \""+namaAwal2+"\" : ");
            for(int i=0; i<hasilcari.length; i++){
                Nasabah nasabah = b.getNasabah(hasilcari[i]);
                System.out.println("Nasabah ditemukan di indeks "+hasilcari[i]+ " : "+nasabah);
            }
        }
        else {
            System.out.println("Nasabah dengan nama \""+namaAwal2+"\" tidak ditemukan.");
        }
        in.close();
        
    }
    
}
