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
public class Array1D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A[],n,i;
        int banyak =0;
        int jumlah=0;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Masukkan banyak data : ");
        n = in.nextInt();
        A = new int[n]; // A ukuran n
        System.out.println("== Data Anda ==");
        for(i=0;i<n;i++)
        {
            A[i] = rand.nextInt(100)+1;
            System.out.print(A[i]+"\t");
        }
        System.out.println();
        System.out.println("== Data Array Bernilai Genap ==");
        for(i=0;i<n;i++)
        {
            //seleksi
            if (A[i]%2==0){
                System.out.print(A[i]+"\t");
                banyak+=1;
                jumlah=jumlah+A[i];
            }
        }
           System.out.print("\nBanyak angka genap = "+banyak);
           System.out.print("\nJumlah angka genap = "+jumlah);
        
    }
    
}
