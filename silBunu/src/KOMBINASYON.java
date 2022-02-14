import java.util.Scanner;

public class KOMBINASYON {

    public void Kombinasyon() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kombinasyon fonksiyonu");

        int faktoriyel, faktoriyel2, sayi, sayi2;

        System.out.print("Kombinasyonun ilk değerini giriniz:");
        sayi = scanner.nextInt();

        System.out.print("Kombinasyonun ikinci değerini giriniz:");
        sayi2 = scanner.nextInt();
        System.out.println();
        faktoriyel = 1;
        for (int i = sayi; i > 0; i--) {
            faktoriyel *= i;

        }

        System.out.println("ilk sayinin faktoriyeli:" + faktoriyel);

        faktoriyel2 = 1;
        for (int i = sayi2; i > 0; i--) {
            faktoriyel2 *= i;

        }

        System.out.println("ikinci sayinin faktoriyeli:" + faktoriyel2);
        System.out.println();
        int fakFark = (faktoriyel - faktoriyel2);
        System.out.println("Faktoriyellerin farki:" + fakFark);

        int sayiFark = (sayi - sayi2);
        System.out.println("Girilen sayilarin farki:" + sayiFark);
        System.out.println();
        System.out.println("Kombinasyon işleminin sonucu:" + fakFark / sayiFark);
        System.out.println();
        System.out.println("kombinasyon fonksiyonu bitti!");
    }

}
