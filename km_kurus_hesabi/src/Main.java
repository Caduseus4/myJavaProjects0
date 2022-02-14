import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private String color;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        NumberFormat fmt = NumberFormat.getCurrencyInstance(Locale.US);

        System.out.print("You're Car How Many Cent To Spend In The Km:");
        double kurus = scanner.nextDouble();

        System.out.print("How Many Km Went Road:");
        double km=scanner.nextDouble();

        String spendMoney=fmt.format(km*kurus);
        System.out.println(("You're Car Spend Money:" + spendMoney ));




    }


}
