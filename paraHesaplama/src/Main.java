import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double yirmi_bes_krs = 0.25;
        double elli_krs = 0.5;
        double bir_tl = 1;
        System.out.println();
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Kaç Tl'de kaç adet bilmem kaç kuruş vardır uygulamasına oj geldiniz.");
        System.out.println("-----------------------------------------------------------------------------");


        int i = 0;
        while (i < 100) {

            System.out.print("Bir para gir lan:");
            double para = scanner.nextDouble();
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("1-25krş\n2-50krş\n3-1Tl");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.print("Hangisini bulmak istiyosan onun numarasını yazdır(Çıkmak için 0'yazdırabilirsin):");
            byte secim = scanner.nextByte();
            System.out.println("-----------------------------------------------------------------------------");

            if (secim == 1) {

                System.out.println(para + " Tl'de " + para / yirmi_bes_krs + " adet 25krş vardır.");
                System.out.println("-----------------------------------------------------------------------------");

            } else if (secim == 2) {
                System.out.println(para + " Tl'de " + ((para / elli_krs)) + " adet 50krş vardır.");
                System.out.println("-----------------------------------------------------------------------------");

            } else if (secim == 3) {
                System.out.println(para + " Tl'de " + para / bir_tl + " adet 1 Tl vardır.");
                System.out.println("-----------------------------------------------------------------------------");

            } else if (secim == 0) {
                break;
            } else {
                System.out.println("Geçersiz numara girdiniz!");
                System.out.println("-----------------------------------------------------------------------------");
            }
            i++;
        }


    }
}
