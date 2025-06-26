/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum270525;

/**
 *
 * @author USer
 */
public class Transfer extends Pembayaran {
    private String namaBank;

    public Transfer(String namaBank) {
        this.namaBank = namaBank;
    }

    @Override
    public void prosesPembayaran() {
        System.out.println("Pembayaran melalui Transfer ke bank: " + namaBank);
    }
}

