import java.util.*;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int num = random.nextInt(3);


        for (int i = 0; i < 100; i++) {
            System.out.println();
            System.out.print("Taş,Kağıt,Makas Olaylarından Birini Seçiniz:");
            String yourChoose1 = scanner.nextLine();
            String yourChoose = yourChoose1.toUpperCase(Locale.ROOT);
            System.out.println();
            System.out.println("Sizin Seçiminiz:" + yourChoose);


            if (num == 0) {

                if (yourChoose.equalsIgnoreCase("Taş")) {
                    System.out.println("Bilgisayarın Seçimi:TAŞ!");
                    System.out.println("Berabere!");
                } else if (yourChoose.equalsIgnoreCase("Kağıt")) {
                    System.out.println("Bilgisayarın Seçimi:TAŞ!");
                    System.out.println("Kazandınız!");
                } else if (yourChoose.equalsIgnoreCase("Makas")) {
                    System.out.println("Bilgisayarın Seçimi:TAŞ!");
                    System.out.println("Kaybettiniz!");
                } else {
                    System.out.println("Geçersiz Sayı Girdiniz");
                }


            } else if (num == 1) {

                if (yourChoose.equalsIgnoreCase("Taş")) {
                    System.out.println("Bilgisayarın Seçimi:KAĞIT!");
                    System.out.println("Kaybettiniz!");
                } else if (yourChoose.equalsIgnoreCase("Kağıt")) {
                    System.out.println("Bilgisayarın Seçimi:KAĞIT!");
                    System.out.println("Berabere!");
                } else if (yourChoose.equalsIgnoreCase("Makas")) {
                    System.out.println("Bilgisayarın Seçimi:KAĞIT!");
                    System.out.println("Kazandınız!");
                } else {
                    System.out.println("Geçersiz Sayı Girdiniz");
                }


            } else if (num == 2) {

                if (yourChoose.equalsIgnoreCase("Taş")) {
                    System.out.println("Bilgisayarın Seçimi:MAKAS!");
                    System.out.println("Kazandınız!");
                } else if (yourChoose.equalsIgnoreCase("Kağıt")) {
                    System.out.println("Bilgisayarın Seçimi:MAKAS!");
                    System.out.println("Kaybettiniz!");
                } else if (yourChoose.equalsIgnoreCase("Makas")) {
                    System.out.println("Bilgisayarın Seçimi:MAKAS!");
                    System.out.println("Berabere!");
                } else {
                    System.out.println("Geçersiz Sayı Girdiniz");
                }


            } else {
                System.out.println("Geçersiz Sayı Girdiniz");
            }


        }

    }
}
