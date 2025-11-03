package org.example;

import java.util.Scanner;

public class IfElseExercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai ujian (0–100): ");
        int nilai = input.nextInt();

        if (nilai >= 90) {
            System.out.println("Grade: A");
        } else if (nilai >= 80) {
            System.out.println("Grade: B");
        } else if (nilai >= 70) {
            System.out.println("Grade: C");
        } else if (nilai >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: E");
        }
    }
}