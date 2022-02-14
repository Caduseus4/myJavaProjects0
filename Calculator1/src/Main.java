import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.print("\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t*******************" +
                "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  Welcome\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t*******************" +
                "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t1.Addition\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t-------------------" +
                "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t2.Subtraction\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t-------------------" +
                "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t3.Division\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t-------------------" +
                "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t4.Multiplication \n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t-------------------" +
                "\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tYou Enter want to Procces Number:");


        for (int i = 0; i < 15; i++) {

            byte procces = scanner.nextByte();
            if (procces == 1 || procces == 1. || procces == 2 || procces == 2. || procces == 3 || procces == 3. || procces == 4 || procces == 4.) {

                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tYou Will Enter The First Number:");
                int numb1 = scanner.nextInt();

                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tYou Will Enter The Second Number:");
                int numb2 = scanner.nextInt();
                int result;
                int division;

                if (procces == 1 || procces == 1.) {

                    result = numb1 + numb2;
                    System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tAddition Result:" + result);
                    System.out.println();
                    System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tAgain Choose Of The Number  For Procces:");

                } else if (procces == 2 || procces == 2.) {

                    result = numb1 - numb2;
                    System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tSubtraction Result:" + result);
                    System.out.println();
                    System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tAgain Choose Of The Number  For Procces:");

                } else if (procces == 3 || procces == 3.) {

                    division = numb1 / numb2;
                    System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tDivision Result:" + division);
                    System.out.println();
                    System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tAgain Choose Of The Number  For Procces:");

                } else {

                    result = numb1 * numb2;
                    System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tMultiplication Result:" + result);
                    System.out.println();
                    System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tAgain Choose Of The Number  For Procces:");

                }

            } else {
                System.out.print("\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tYou Entered İnvalid Number,Please Try Again:");
            }

        }


    }
}
