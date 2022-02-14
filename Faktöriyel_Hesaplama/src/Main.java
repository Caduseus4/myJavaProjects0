import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("bir sayı girin: ");
        int num =scanner.nextInt();
        int count=num;
        long faktoriyel=1;

        while (count>1){

            faktoriyel*=count;
            count--;
        }
        System.out.println(faktoriyel);

    }
}
