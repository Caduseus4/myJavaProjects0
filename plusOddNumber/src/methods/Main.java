package methods;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean oddnumber = true;
        System.out.println();
        System.out.println("Tek Sayı Toplama Uygulamasına Hoş Geldiniz :)");
        System.out.println();
        System.out.print("Bir Sayı Giriniz:");
        int total = 0;




        int i = 0;
        while (i < 150) {

            int input = scanner.nextInt();

            if (input % 2 == 0 && input>0) {

                oddnumber = false;
                System.out.println("Girdiğiniz Sayı Çift Sayıdır.");
                System.out.println();

            } else if (oddnumber || input > 0) {
                total = total + input;
                System.out.println("Şu Ana Dek Girilen Tek Sayıların Toplamı:" + total);
                System.out.println();

            } else if (input < 0) {
                System.out.println("Girdiğiniz Tek Sayıların Toplamı:" + total);
                System.out.println("İşleminiz Bitmiştir.");
                break;
            }


            System.out.print("Bir Sayı Daha Giriniz ya da Çıkmak İçin Negatif Bir Sayı Giriniz:");
            i++;
        }

    }
}
