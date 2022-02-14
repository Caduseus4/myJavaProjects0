import java.util.Scanner;

public class US_ALMA {

    public void usAlma() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("üs alma fonksiyonu");
        System.out.print("Taban Değer Giriniz:");
        int taban = scanner.nextInt();

        System.out.print("Kaçıncı Kuvvetini Almak İstedğiinizi Giriniz:");
        int kuvvet = scanner.nextInt();

        long sonuc = 1;

        for (int i = 0; i <= 1000 ; i++) {
            if (kuvvet != 0){
                sonuc *= taban;
                --kuvvet;
        }
        }


        System.out.println("cevap = " + sonuc);

        System.out.println("üs alma fonksiyonu bitti!");

    }

}

