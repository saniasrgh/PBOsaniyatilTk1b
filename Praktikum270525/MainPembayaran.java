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
import java.util.Scanner;

public class MainPembayaran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pembayaran pembayaran;

        System.out.println("Pilih metode pembayaran:");
        System.out.println("1. Transfer");
        System.out.println("2. E-Wallet");
        System.out.println("3. Cash");
        System.out.println("4. Kartu Kredit");
        System.out.print("Masukkan pilihan (1-4): ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // buffer clear

        switch (pilihan) {
            case 1:
                System.out.print("Masukkan nama bank: ");
                String bank = scanner.nextLine();
                pembayaran = new Transfer(bank);
                break;
            case 2:
                pembayaran = new EWallet();
                break;
            case 3:
                pembayaran = new Cash();
                break;
            case 4:
                pembayaran = new KartuKredit();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
                scanner.close();
                return;
        }

        // Proses pembayaran
        pembayaran.prosesPembayaran();
        scanner.close();
    }
}

