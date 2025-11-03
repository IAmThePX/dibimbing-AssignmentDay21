package org.example;

import java.util.Scanner;

public class SwitchCaseExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Menu Makanan:");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Sate Ayam");
        System.out.print("Pilih menu (1–3): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Harga: Rp15.000");
                break;
            case 2:
                System.out.println("Harga: Rp12.000");
                break;
            case 3:
                System.out.println("Harga: Rp20.000");
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}