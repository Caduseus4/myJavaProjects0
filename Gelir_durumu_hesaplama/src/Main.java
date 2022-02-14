import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(1000);
        System.out.println(3500);
        System.out.println(5000);
        System.out.println(7500);
        System.out.println(15000);
        System.out.print("Gelir Düzeyinizi Yukarıdan Seçin:");
        int gelir = scanner.nextInt();

        switch (gelir) {

            case 1000:
                System.out.println("FAKİR.");
                break;

            case 3500:
                System.out.println("Gelir Düzeyiniz Düşük.");
                break;

            case 5000:
                System.out.println("Gelir Düzeyiniz Fena Değil.");
                break;

            case 7500:
                System.out.println("Gelir Düzeyiniz İyi.");
                break;

            case 15000:
                System.out.println("Abi Kiramı Ödesene Be.");
                break;

            default:
                System.out.println("Geçersiz Miktar Girdiniz.");
        }

    }
}
