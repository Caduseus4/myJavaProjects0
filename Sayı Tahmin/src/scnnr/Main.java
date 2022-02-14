package scnnr;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("0 ile 50 Arasında Bir Sayı Giriniz:");
        int sayi = input.nextInt();

        double random = Math.random() * 50;
        int random1 = (int) random;

        if (sayi == random1) {
            System.out.print("Doğru Tahmin.");
        } else{
            System.out.println("Yanlış Tahmin.");
            System.out.println("Doğru Cevap:" + random1);
        }

    }
}
