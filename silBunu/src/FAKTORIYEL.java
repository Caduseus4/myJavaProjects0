import java.util.Scanner;

public class FAKTORIYEL {

    public void Faktoriyel(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("faktöriyel alma fonksiyonu");

        int faktoriyel,sayi;

        System.out.print("Faktöriyelini almak istediğiniz sayıyı giriniz:");
        sayi=scanner.nextInt();


        faktoriyel=1;
        for (int i =sayi ; i > 0 ; i--) {
            faktoriyel *=i;

        }

        System.out.println(faktoriyel);

        System.out.println("faktöriyel alma fonksiyonu!");
    }
}
