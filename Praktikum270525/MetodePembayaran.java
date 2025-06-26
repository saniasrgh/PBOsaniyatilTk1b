/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum270525;

/**
 *
 * @author FA506NF
 */
public abstract class MetodePembayaran {
    protected String namaPemilik;

    public MetodePembayaran(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public abstract void prosesPembayaran(double jumlah);
}

