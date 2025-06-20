/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tubes.tugas1;

import java.util.Scanner;

/**
 *
 * @author FA506NF
 */

public class maintugas1 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        while (true) {
            System.out.println("\n=== MENU BANGUN DATAR ===");
            System.out.println("1. Input Rectangle");
            System.out.println("2. Input Circle");
            System.out.println("3. Input Square");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- INPUT RECTANGLE ---");
                    System.out.print("Masukkan panjang: ");
                    double length = scanner.nextDouble();
                    System.out.print("Masukkan lebar: ");
                    double width = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Masukkan warna: ");
                    String colorRect = scanner.nextLine();
                    System.out.print("Apakah terisi (true/false): ");
                    boolean filledRect = scanner.nextBoolean();

                    Rectangle rect = new Rectangle(width, length, colorRect, filledRect);
                    System.out.println("\n--- HASIL RECTANGLE ---");
                    System.out.println(rect.toString());
                    break;

                case 2:
                    System.out.println("\n--- INPUT CIRCLE ---");
                    System.out.print("Masukkan radius: ");
                    double radius = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Masukkan warna: ");
                    String colorCircle = scanner.nextLine();
                    System.out.print("Apakah terisi (true/false): ");
                    boolean filledCircle = scanner.nextBoolean();

                    Circle circle = new Circle(radius, colorCircle, filledCircle);
                    System.out.println("\n--- HASIL CIRCLE ---");
                    System.out.println(circle.toString());
                    break;

                case 3:
                    System.out.println("\n--- INPUT SQUARE ---");
                    System.out.print("Masukkan sisi: ");
                    double side = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Masukkan warna: ");
                    String colorSq = scanner.nextLine();
                    System.out.print("Apakah terisi (true/false): ");
                    boolean filledSq = scanner.nextBoolean();

                    Square square = new Square(side, colorSq, filledSq);
                    System.out.println("\n--- HASIL SQUARE ---");
                    System.out.println(square.toString());
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }
    }
}