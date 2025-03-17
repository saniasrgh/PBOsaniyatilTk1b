/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas1;

/**
 *
 * @author FA506NF
 */
import java.util.Scanner;
public class ProgramSwalayan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pil,jum;
        
        System.out.println(" ---Program Swalayan--- ");
        System.out.println("|______________________|");
        System.out.println("|     Jenis barang     |");
        System.out.println("|  1. X - Rp 40.000    |");
        System.out.println("|  2. Y - Rp 50.000    |");
        System.out.println("|  3. Z - Rp 60.000    |");
        System.out.println("|______________________|");
        System.out.print("Pilih jenis barang yang akan dibeli : ");
        pil=in.nextInt();
        System.out.print("Jumlah barang yang dibeli : ");
        jum=in.nextInt();
        
        int hargaperktk = 0;
        double totalharga = 0, diskon = 0,totalbayar = 0;
        
        switch(pil){
            case 1:
                hargaperktk = 40000;
                totalharga = hargaperktk * jum;
                if (jum >=3){
                    diskon = totalharga * 0.10;
                }
                break;
            case 2:
                hargaperktk = 50000;
                totalharga = hargaperktk * jum ;
                if (jum >3){
                    diskon = totalharga * 0.12;
                }
                break;
            case 3:
                hargaperktk = 60000;
                totalharga = hargaperktk * jum;
                if (jum >1){
                    totalharga = hargaperktk + (jum -1) * hargaperktk * 0.85;
                    diskon = (jum -1) * hargaperktk * 0.15;
                }
                else{
                    totalharga = hargaperktk;
                }
                break;
            default:
                System.out.println("Pilihan kamu tidak sesuai!");
                in.close();
                return;
        }
        totalbayar = totalharga - diskon;
        System.out.println("Total Harga = Rp "+totalharga);
        System.out.println("Diskon      = Rp "+diskon);
        System.out.println("Total Bayar = Rp "+totalbayar);
        
        in.close();
    }
}