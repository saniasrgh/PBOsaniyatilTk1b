/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pratikum250325;

/**
 *
 * @author FA506NF
 */
/** NAMA : SANIYATIL WADA'I BR SARAGIH
    NIM  : 2401083012
    KELAS : 1B TEKNIK KOMPUTER
*/
public class TestBank {
    public static void main(String[] args) {
        Bank bank = new Bank();
    
        //membuat objek nasabah pertama
        Bank.Nasabah eren = bank.new Nasabah("Eren", "Yeager");
        Bank.Tabungan tabungan1 = bank.new Tabungan(500000);
        eren.settabungan(tabungan1);
    
        //membuat objek nasabah kedua
        Bank.Nasabah sania = bank.new Nasabah("Sania", "Saragih");
        Bank.Tabungan tabungan2 = bank.new Tabungan(600000);
        sania.settabungan(tabungan2);
        
        //Menampilkan data awal
        System.out.println(eren);
        System.out.println(sania);
        System.out.println();
        
        //objek 1 menabung
        tabungan1.simpanUang(100000);
        System.out.println(eren.getnamaAwal()+" menabung Rp 100.000, saldo : Rp "+tabungan1.getsaldo());
        
        //objek 2 menabung
        tabungan2.simpanUang(200000);
        System.out.println(sania.getnamaAwal()+" menabung Rp 200.000, saldo : Rp "+tabungan2.getsaldo());
        System.out.println();
        
        //objek 1 mengambil uang
        if(tabungan1.ambiluang(300000)){
            System.out.println(eren.getnamaAwal()+" mengambil uang Rp 300.000, saldo : Rp "+tabungan1.getsaldo());
        }
        //objek 2 mengambil uag
        if(tabungan2.ambiluang(400000)){
            System.out.println(sania.getnamaAwal()+" mengambil uang Rp 400.000, saldo : Rp "+tabungan2.getsaldo());
        }
        System.out.println();
        
        //objek 2 mentransfer ke objek 1
        if(tabungan1.transfer(tabungan2, 100000)){
            System.out.println(eren.getnamaAwal()+" transfer ke "+ sania.getnamaAwal()+" sebanyak Rp 100.000");
        }
        System.out.println();
        
        //menampilkan saldo akhir
        System.out.println("Saldo akhir "+eren.getnamaAwal()+" Rp : "+tabungan1.getsaldo());
        System.out.println("Saldo Akhir "+sania.getnamaAwal()+" Rp : "+tabungan2.getsaldo());
    } 
}
