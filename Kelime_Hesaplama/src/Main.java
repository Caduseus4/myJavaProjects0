import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter You Text And Let's Find Out How Many Words Are In This Text: ");
        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println(count + 1);

    }
}
