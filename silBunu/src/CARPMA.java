import java.util.Scanner;

public class CARPMA {

    public void carpma() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("çarpım fonksiyonu");

        System.out.print("ilk deger:");
        int a = scanner.nextInt();
        System.out.print("ikinci deger:");
        int b = scanner.nextInt();

        int carpim = a * b;
        System.out.println("carpim degeri:" + carpim);

        System.out.println("çarpım fonksiyonu bitti!");
    }

}
