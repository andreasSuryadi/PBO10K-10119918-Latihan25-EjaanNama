/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan25ejaannama;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Andreas Suryadi
 * KELAS    : IF-10K
 * NIM      : 10119918
 * Deskripsi Program : Menampilkan ejaan nama
 *
 */

public class PBO10K10119918Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nama;
        int jumlahKarakterNama;

        System.out.print("Masukkan nama depan anda untuk di eja : ");
        nama = scanner.nextLine();

        jumlahKarakterNama = nama.length();

        char[] ch = new char[jumlahKarakterNama];

        System.out.println("\nEjaan untuk nama \"" + nama + "\" adalah :");
        for (int i = 0; i < jumlahKarakterNama; i++) {
            System.out.println("Huruf ke-" + (i + 1) + " : " + nama.charAt(i));
        }
    }
    
}
