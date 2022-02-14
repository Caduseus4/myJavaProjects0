import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        for (int j = 0; j < 100; j++) {
            System.out.print("Write On Potentional Perfect Number:");
            int potential = scanner.nextInt();
            int total = 0;
            for (int i = 1; i < potential; i++) {
                if (potential % i == 0) {
                    total = total + i;
                    System.out.println(i);
                }
            }
            if (total == potential) {
                System.out.println("This İs Perfect Number.");
                System.out.println();

            } else {
                System.out.println("This İs Not Perfect Number.");
                System.out.println();
            }
        }
    }
}