package org.example;

import java.util.Scanner;

public class LoopingExercise {
    public static void main(String[] args) {
        // For loop: menampilkan bilangan genap dari 1–20
        System.out.println("Bilangan genap dari 1 sampai 20:");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        // While loop: menghitung total belanja
        Scanner input = new Scanner(System.in);
        int total = 0;
        int harga;

        System.out.println("Masukkan harga barang (0 untuk selesai):");
        while (true) {
            System.out.print("Harga: ");
            harga = input.nextInt();
            if (harga == 0) break;
            total += harga;
        }

        System.out.println("Total belanja: Rp" + total);
    }
}