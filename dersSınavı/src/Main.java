import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int alinan = scanner.nextInt();
        soru(alinan, alinan);
    }

    public static void soru(int sayi, int bolum) {

        while (bolum > 1) {
            bolum--;
            if (sayi % bolum == 0) {

                System.out.println(bolum);
                return;
            }

        }

    }
}