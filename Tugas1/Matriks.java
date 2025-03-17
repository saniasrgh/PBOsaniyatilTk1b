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
import java.util.Random;
public class Matriks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A[][], B[][];
        int bA, kA, bB, kB;
        int menu;

        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        char ulang = ' ';

        // do-while yang digunakan untuk mengulang program
        do {
            // Pemilihan program
            System.out.println("===Program Matriks===");
            System.out.println("1. Tambah");
            System.out.println("2. Kurang");
            System.out.println("3. Kali");
            System.out.println("4. Identitas");
            System.out.println("5. Transpose");
            System.out.println("6. Exit");
            System.out.print("\nPilih program yang ingin dijalankan: ");
            menu = in.nextInt();

            if (menu > 0 && menu < 6) {
                System.out.print("Masukkan jumlah baris array A: ");
                bA = in.nextInt();
                System.out.print("Masukkan jumlah kolom array A: ");
                kA = in.nextInt();
                System.out.print("Masukkan jumlah baris array B: ");
                bB = in.nextInt();
                System.out.print("Masukkan jumlah kolom array B: ");
                kB = in.nextInt();

                A = new int[bA][kA];
                B = new int[bB][kB];

                int i, j, k;
                // Mengisi array 2D secara random
                System.out.println("\n===Isi Matriks===");
                System.out.println("Matriks A: ");
                for (i = 0; i < bA; i++) {
                    for (j = 0; j < kA; j++) {
                        A[i][j] = rand.nextInt(10) + 1;
                        System.out.print(A[i][j] + "\t");
                    }
                        System.out.println();
                }
                System.out.println();

                System.out.println("Matriks B: ");
                for (i = 0; i < bB; i++) {
                    for (j = 0; j < kB; j++) {
                        B[i][j] = rand.nextInt(10) + 1;
                        System.out.print(B[i][j] + "\t");
                    }
                    System.out.println();
                }
                System.out.println();

                switch (menu) {
                    case 1: {
                        if (bA == bB && kA == kB) {
                            int Tambah[][] = new int[bA][kA];
                            System.out.println("Hasil penjumlahan matriks A dan B: ");
                            for (i = 0; i < bA; i++) {
                                for (j = 0; j < kA; j++) {
                                    Tambah[i][j] =A[i][j] + B[i][j];
                                    System.out.print(Tambah[i][j] + "\t");
                                }
                                System.out.println();
                            }
                            System.out.println();
                        } else {
                            System.out.println("Input baris/kolom tidak memenuhi");
                            System.out.println("Catatan: array harus berordo sama");
                        }
                        break;
                    }
                    case 2: {
                        if (bA == bB && kA == kB) {
                            int Kurang[][] = new int[bA][kA];
                            System.out.println("Hasil pengurangan matriks A dan B: ");
                            for (i = 0; i < bA; i++) {
                                for (j = 0; j < kA; j++) {
                                    Kurang[i][j] = A[i][j] - B[i][j];
                                    System.out.print(Kurang[i][j] + "\t");
                                }
                                System.out.println();
                            }
                            System.out.println();
                        } else {
                            System.out.println("Input baris/kolom tidak memenuhi");
                            System.out.println("Catatan: array harus berordo sama");
                        }
                        break;
                    }
                    case 3: {
                        if (bA == kB) {
                            int Kali[][] = new int[bA][kB];
                            System.out.println("Hasil perkalian matriks A dan B: ");
                            for (i = 0; i < bA; i++) {
                                for (j = 0; j < kB; j++) {
                                    for (k = 0; k < kA; k++) {
                                        Kali[i][j] += A[i][k] * B[k][j];
                                    }
                                    System.out.print(Kali[i][j] + "\t");
                                }
                                System.out.println();
                            }
                            System.out.println();
                        } else {
                            System.out.println("Baris array A harus sama dengan kolom array B dalam perkalian matriks");
                        }
                        break;
                    }
                    case 4: {
                        int IdentitasA[][] = new int[bA][kA];
                        int IdentitasB[][] = new int[bB][kB];

                        if (bA != kA) {
                            System.out.println("array A tidak bisa dibuat dalam bentuk identitas karena matriks tidak berbentuk persegi atau baris tidak sama dengan kolom");
                        } else {
                            System.out.println("Hasil matriks identitas A: ");
                            for (i = 0; i < bA; i++) {
                                for (j = 0; j < kA; j++) {
                                    if (i == j) IdentitasA[i][j] = 1;
                                    else IdentitasA[i][j] = 0;
                                    System.out.print(IdentitasA[i][j] + "\t");
                                }
                                System.out.println();
                            }
                            System.out.println();
                        }

                        if (bB != kB) {
                            System.out.println("array B tidak bisa dibuat dalam bentuk identitas ");
                        } else {
                            System.out.println("Hasil matriks identitas B: ");
                            for (i = 0; i < bB; i++) {
                                for (j = 0; j < kB; j++) {
                                    if (i == j) IdentitasA[i][j] = 1;
                                    else IdentitasA[i][j] = 0;
                                    System.out.print(IdentitasA[i][j] + "\t");
                                }
                                System.out.println();
                            }
                            System.out.println();
                        }
                        break;
                    }
                    case 5: {
                        int TransposeA[][] = new int[kA][bA];
                        int TransposeB[][] = new int[kB][bB];

                        System.out.println("Hasil transpose matriks A: ");
                        for (i = 0; i < bA; i++) {
                            for (j = 0; j < kA; j++) {
                                TransposeA[j][i] = A[i][j];
                            }
                        }

                        for (i = 0; i < kA; i++) {
                            for (j = 0; j < bA; j++) {
                                System.out.print(TransposeA[i][j] + "\t");
                            }
                            System.out.println();
                        }
                        System.out.println();

                        System.out.println("Hasil transpose matriks B: ");
                        for (i = 0; i < bB; i++) {
                            for (j = 0; j < kB; j++) {
                                TransposeB[j][i] = B[i][j];
                            }
                        }

                        for (i = 0; i < kB; i++) {
                            for (j = 0; j < bB; j++) {
                                System.out.print(TransposeB[i][j] + "\t");
                            }
                            System.out.println();
                        }
                        System.out.println();
                        break;
                    }
                }

                System.out.print("Apakah ingin mengulang program (y/n)? ");
                ulang = in.next().charAt(0);
            } else if (menu == 6) {
                ulang = 'n';
                System.out.print("Anda telah keluar dari program");
            } else {
                System.out.println("Pilihan tidak ada di menu");
                System.out.print("Apakah ingin mengulang program (y/n)? ");
                ulang = in.next().charAt(0);
            }
        } while (ulang == 'y');
    }
}
