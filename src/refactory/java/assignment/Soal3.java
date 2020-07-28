package refactory.java.assignment;

import java.util.Scanner;

public class Soal3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Angka : ");

        int angka = input.nextInt();
        if (angka % 2 != 0) {
             if (angka % 5 == 0) {
                System.out.println("Imperio Aberto");
            }else{
                 System.out.println("Imperio");
             }
        }else {
            if (angka % 4 == 0) {
                System.out.println("Crucio Reducto");
            }else{
                System.out.println("Crucio");
            }
        }
    }
}
