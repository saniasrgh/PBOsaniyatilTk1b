/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum150425;

import java.util.Scanner;

/**
 *
 * @author FA506NF
 */

public class PesawatDemoDinamis {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, jumlah, tahunProduksi, muatan;
        int besar; //
        boolean mesin;
        String nama;
        String namaMax; //pesawat dengan muatan terbesar
        
        System.out.print("Masukkan banyak Pesawat = ");
        jumlah = input.nextInt();
        input.nextLine();
        
        //deklarasi array
        Pesawat[] daftarPesawat = new Pesawat[jumlah];
        
        //isi array
        
        for(i=0; i<jumlah;i++){
            System.out.println("Input pesawat ke "+(i+1));
            System.out.print("Nama Pesawat : ");
            nama = input.nextLine();
            System.out.print("Tahun Produksi : ");
            tahunProduksi = input.nextInt();
            System.out.print("Menggunakan Mesin ? (true/false) = "  );
            mesin = input.nextBoolean();
            System.out.print("Kapasistas muatan penumpang maksimal : ");
            muatan = input.nextInt();
            
        }
        System.out.println("\n\n DATA PESAWAT \n\n");
        System.out.println("Data Pesawat ke 1 adalah");
        daftarPesawat[0].cetak();
        System.out.println();
        besar = daftarPesawat[0].getMuatan();
        namaMax = daftarPesawat[0].getNama();
        
        for(i=0; i<jumlah; i++){
            System.out.println("Data Pesawat ke "+(i=1)+" adalah ");
            daftarPesawat[i].cetak();
            if(daftarPesawat[i].getMuatan()>besar){
                besar = daftarPesawat[i].getMuatan();
                namaMax = daftarPesawat[i].getNama();
            }
            System.out.println();
        }
        System.out.println("Pesawat dengan muatan terbanyak adalah "+namaMax);
        System.out.println("dengan kapasitas maksimum "+besar+" orang");
    }
    
}
