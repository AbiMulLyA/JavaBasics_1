package refactory.java.assignment;

import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
//        System.out.printf("Masukkan Umur : ");
//
//        int umur = input.nextInt();

        var umur = (int) (Math.random() * 29) + 1;
        System.out.println(umur);
        if (umur >= 21) System.out.println("Dewasa");
        else if (umur >= 13) System.out.println("Remaja");
        else if (umur >= 9)System.out.println("Bimbingan Orang Tua");
        else System.out.println("Semua Usia");
    }
}
