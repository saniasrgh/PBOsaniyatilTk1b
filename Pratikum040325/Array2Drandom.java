/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum040325;

/**
 *
 * @author FA506NF
 */
import java.util.Scanner;
import java.util.Random;
public class Array2Drandom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int M[][];
       int i,j,baris, kolom,bb,kk;
       Scanner in = new Scanner(System.in);
       Random random = new Random();
       System.out.print("Masukkan Jumlah Baris M1 = ");
       baris=in.nextInt();
       System.out.print("Masukkan Jumlah Kolom M1 = ");
       kolom=in.nextInt();
       System.out.print("Masukkan Jumlah Baris M2 = ");
       bb=in.nextInt();
       System.out.print("Masukkan Jumlah Kolom M2 = ");
       kk=in.nextInt();
       
       M=new int[baris][kolom];
       //Mengisi array 2D secara random
       System.out.println("==Isi Matriks==");
       for(i=0;i<baris;i++)
       {
           for(j=0;j<kolom;j++)
           {
               M[i][j]=random.nextInt(100)+1;
               System.out.print(M[i][j]+"\t");
           }
           System.out.println();
       }
       int N[][];
       N=new int[baris][kolom];
       System.out.println("==Matriks ke dua ==");
       for(i=0;i<bb;i++)
       {
           for(j=0;j<kk;j++)
           {
               N[i][j]=random.nextInt(100)+1;
               System.out.print(N[i][j]+"\t");
           }
           System.out.println();
       }
       if(baris==bb && kolom==kk){
       
       int O[][];
       O=new int[baris][kolom];
       System.out.println("Penjumlahan Matriks = ");
       for(i=0;i<baris;i++)
       {
           for(j=0;j<kolom;j++)
           {
               O[i][j]=M[i][j] + N[i][j];
               System.out.print(O[i][j]+"\t");
           }
           System.out.println();
       }
       } else {
           System.out.println("Ukuran Matriks beda, tidak bisa dijumlahkan");
       }
    }
    
}