/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
public class Bank {
    private Nasabah[] nasabah;
    private int jumNasabah;
    private String namaAkhir;
    
    //Konstruktor Default
    public Bank(){
        nasabah = new Nasabah [100]; //Maksimum 100 Nasabah
        jumNasabah = 0;
    }
    public void tambahNasabah(String namaAwal, String namaAkhir){
        nasabah[jumNasabah++] = new Nasabah(namaAwal, namaAkhir);
    }
    public void tambahNasabah(String namaAwal, String namaAkhir, Tabungan tabungan){
        Nasabah n = new Nasabah(namaAwal, namaAkhir);
        n.settabungan(tabungan);
        nasabah[jumNasabah++] = n; 
    }
    public int getjumNasabah(){
        return jumNasabah;
    }
    public Nasabah getNasabah(int indeks){
        return(indeks >= 0 && indeks <jumNasabah)? nasabah[indeks] : null;
    }
    public int searchNasabah(String namaAwal, String namaAkhir){
        for(int i=0; i<jumNasabah; i++){
            if (nasabah[i].toString().contains(namaAwal + " " + namaAkhir )){
                return i;
            }
        }
        return -1;
    }
    public int[] searchNasabah(String namaAwal){
        int[] hasil= new int[jumNasabah];
        int count = 0;
        for(int i=0; i<jumNasabah; i++){
            if(nasabah[i].toString().contains(namaAwal)){
                hasil[count++]=i;
            }
        }
        return java.util.Arrays.copyOf(hasil, count);
    }
}