import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("bir sayı giriniz:");
        int sayi = scanner.nextInt();
        int toplam = 0;

        while (sayi > 0) {
            toplam += sayi % 10;
            sayi = sayi / 10;
        }

        System.out.println("girdiğiniz sayının rakamları toplamı:"+toplam);


    }
}
