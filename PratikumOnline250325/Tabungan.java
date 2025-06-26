/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PratikumOnline250325;

/**
 *
 * @author FA506NF
 */
/** NAMA : SANIYATIL WADA'I BR SARAGIH
    NIM  : 2401083012
    KELAS : 1B TEKNIK KOMPUTER
*/
class Tabungan {
    private int saldo;
    
    //Konstruktor dengan parameter
    public Tabungan(int saldo) {
        this.saldo = saldo;
    }
    public int getsaldo(){
        return saldo;
    }
    public void simpanUang(int jumlah){
        saldo += jumlah;
    }
    public boolean ambiluang(int jumlah){
        if(jumlah <= saldo){
            saldo -= jumlah;
            return true;
        }
        return false;
    }
    public boolean transfer(Tabungan t, int jumlah){
        if(ambiluang(jumlah)){
            t.simpanUang(jumlah);
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
    return "Saldo Rp " + saldo;
    }
}

