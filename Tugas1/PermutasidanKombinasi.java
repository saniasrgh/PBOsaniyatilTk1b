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
public class PermutasidanKombinasi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, n, a;
      
      Scanner in = new Scanner(System.in);
      System.out.println("---Program Permutasi dan Kombinasi---");
      System.out.println("n = jumlah total objek");
      System.out.println("a = jumlah objek yang dipermutasikan/kombinasikan");
      System.out.print("Masukkan nilai n = ");
      n = in.nextInt();
      System.out.print("Masukkan nilai a = ");
      a = in.nextInt();
      
      //faktorial dari n
      int x = n; //x akan menampung hasil n yang telah difaktorialkan
      for(i=n-1; i>0; i--){
          x = x * i;
      }
      
      //faktorial dari a
      int y = a; //y akan menampung hasil a yang telah difaktorialkan
      for(i=a-1; i>0; i--){
          y = y * i;
      }
      //proses faktorial dari (n-a)
      int na = n - a; //na akan menampung hasil (n-a)
      int naa = na; // naa akan menampunng hasil (n-a) yang telah difaktorialkan
      {
        for(i=na -1; i>0; i--){
            naa = naa * i;
        }
    }
      System.out.println(" ");
      
      System.out.println("-Permutasi-");
      System.out.println("Rumus Permutasi : P(n,a) = n!/n(n-a)!");
      System.out.print("P(" + n +", " + a +" ) = ");
      System.out.print(n + "!/("+ n + " - " + a + ")! = ");
      System.out.print(n + "!/" + na + "! = ");
      System.out.println(x + "/" + naa);
      System.out.println("= "+ x/naa);
      System.out.println("Hasil permutasi = " + x/naa);
      
      System.out.println("");
      
      System.out.println("-Kombinasi-");
      System.out.println("Rumus Kombinasi : C(n,a) = n!/a!(n-a)!");
      System.out.print("C(" + n +", " + a +" ) = ");
      System.out.print(n + "!/"+ a + "!(" + n + " - " + a + ")! = ");
      System.out.print(n + "!/" + a + "!(" + na + ")! = ");
      System.out.println(x + "/(" + y + "x" + naa + ")= ");
      System.out.println(x + "/" + y * naa);
      System.out.println("= "+x/(y*naa));
      System.out.println("Hasil kombinasi = " + x/(y*naa));
    }
    
}
