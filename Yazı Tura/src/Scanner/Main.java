package Scanner;

public class Main {

    public static void main(String[] args) {

        double num = Math.random();

        if (num < 0.5) {
            System.out.println("Yazı.");
        } else if (num > 0.5) {
            System.out.println("Tura.");
        }

    }
}
