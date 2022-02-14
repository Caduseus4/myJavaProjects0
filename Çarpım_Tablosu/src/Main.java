public class Main {

    public static void main(String[] args) {


        multiplicationTable();

    }


    public static int multiplicationTable() {


        int num1 = 1;

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.println("x=" + i + " y=" + j + " x*y=" + result);
            }
            System.out.println("---------------------------------------------");
        }


        return num1;

    }

}
