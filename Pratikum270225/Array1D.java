/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum270225;

import java.util.Scanner;

/**
 *
 * @author FA506NF
 */
public class Array1D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int A[],n,i;
        Scanner in=new Scanner (System.in);
        System.out.print("Masukkan banyak data : ");
        n = in.nextInt();
        A= new int[n];  //buat array ukuran n
        //mengisi array
        for(i=0;i<n;i++)
        {
            System.out.print("A["+i+"] = ");
            A[i]= in.nextInt();
        }
        int jumlah=0;
        //hitung jumlah dan rata-rata
        for(i=0;i<n;i++)
            jumlah=jumlah+A[i];
        //endfor
        float rata=(float)jumlah/n;
        //tampilkan isi array dan hasil perhitungan
        System.out.println("==Isi Array==");
        for(i=0;i<n;i++)
            System.out.print(A[i]+"\t");
        //endfor
        System.out.println("\nJumlah = "+jumlah);
        System.out.println("Rata-rata = "+rata);
        System.out.println("==Mencari nilai Max & Min dengan perbandingan isi==");
        int max=A[0]; //indeks awal tempat nilai terbesar berada
        int min=A[0]; //indeks awal tempat nilai terkecil berada
        for(i=1;i<n;i++){
            if(A[i]>max) //for if untuk mencari nilai terbesar dengan membandingkan isi
               max=A[i]; //pemindahan isi 
            if(A[i]<min) //for if untuk mencari nilai terkecil dengan membandingkan isi
               min=A[i]; //pemindahan isi
        }
        System.out.println("Nilai terbesar = "+max);
        System.out.println("Nilai terkecil = "+min);
        System.out.println("==Mencari nilai Max & Min dengan perbandingan index==");
        int imax=0;
        int imin=0;
        for(i=1;i<n;i++){
            if(A[i]>A[imax]) //for if untuk mencari nilai terbesar dengan membandingkan indeks
                imax=i;      //pemindahan isi
            if(A[i]<A[imin]) //for if untuk mencari nilai terkecil dengan membandingkan indeks
                imin=i;      //pemindahan isi
        }
        System.out.println("Nilai terbesar = "+A[imax]+ " Terletak pada indeks "+(imax+1));
        System.out.println("Nilai terkecil = "+A[imin]+ " Terletak pada indeks "+(imin+1));
    }
}