/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tugas1;

/**
 *
 * @author FA506NF
 */
import java.util.Random;
import java.util.Scanner;
public class Array1D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A[], B[], C[];
        int n, m;
        
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.println("---Program Penggabungan Array 1 Dimensi---");
        //input user array A
        System.out.print("Masukkan ukuran array A: ");
        n = in.nextInt(); //input user n
        A = new int[n]; //array A ukuran n
        
        //input user array B
        System.out.print("Masukkan ukuran array B: ");
        m = in.nextInt(); //input user m
        B = new int[m]; //array B ukuran m
        
        //deklarasi iterasi
        int i;
        
        //input random array A
        for(i = 0; i < n; i++) {
            A[i] = rand.nextInt(100);
        }
        
        //input random array B
        for(i = 0; i < m; i++) {
            B[i] = rand.nextInt(100);
        }
        
        //output array A
        System.out.println("\nUkuran array A dan anggotanya: " + n);
        for(i = 0; i < n; i++) {
            System.out.print(" " + A[i] + " ");
        }
        
        //output array B
        System.out.println("\nUkuran array B dan anggotanya: " + m);
        for(i = 0; i < m; i++) {
            System.out.print(" " + B[i] + " ");
        }
        
        //menggabungkan array A dan B
        C = new int[n + m];
        
        System.out.println("\nUkuran array C dan anggotanya: " + (n + m));
        if(n > m) {
            for(i = 0; i < n; i++) 
                System.out.print(" " + A[i] + " ");
            for(i = 0; i < m; i++)
                System.out.print(" " + B[i] + " ");
        }
        else if(m > n) {
            for(i = 0; i < m; i++) 
                System.out.print(" " + B[i] + " ");
            for(i = 0; i < n; i++)
                System.out.print(" " + B[i] + " ");
        }
        else {
            for(i = 0; i < n; i++) 
                System.out.print(" " + A[i] + " ");
            for(i = 0; i < m; i++)
                System.out.print(" " + B[i] + " ");
            System.out.println("\nArray yang pertama akan berada lebih awal "
                    + "jika ukuran kedua array sama");
        }
    }
}
