import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//palindrom mu
/*
        String kelime, tersi = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("palindrom test için kelime gir:");
        kelime = scanner.nextLine();

        int length = kelime.length();

        for (int i=length-1; i>=0; i--)
            tersi+=kelime.charAt(i);

        if (tersi.equals(kelime))
            System.out.println("palindrome");
else
            System.out.println("not palindrome");

*/


//sayı basamağı toplama
/*

        Scanner scanner=new Scanner(System.in);
        System.out.print("enter the positive number"
        +"(negatif number to quit):");

        int num = scanner.nextInt();
        while(num>0){

            System.out.println("sum of digits of number "+num+" is");
            int total=0;

            while(num>0){
                total+=num%10;
                num/=10;
            }
            System.out.println(total);
            System.out.println("enter a positive number" +
                    "(negative number to quit):");
            num = scanner.nextInt();
        }


*/


//palindrom mu
    /*    String str, another = "y";
        int left, right;

        Scanner scanner = new Scanner(System.in);

        while (another.equalsIgnoreCase("y")) {
            System.out.print("enter a potential palindrome:");
            str = scanner.nextLine();

            left = 0;
            right = str.length() - 1;
            while (str.charAt(left) == str.charAt(right) && left<right) {
left++;
right--;
            }
            System.out.println();

   if (left<right){
       System.out.println("not palindrome");
   }else{
       System.out.println("palindrome");
   }
            System.out.println();
            System.out.println("test another palindrome (y/n)? ");
            another=scanner.nextLine();


        }

//Arrays Çalışması
*/


        //arrays
        /*
        ArrayList<String> band = new ArrayList<String>();
        band.add("Paul");
        band.add("Ali");
        band.add("Pete");
        band.add("Faik");
        band.add("Faruk");
        band.add("Rıfat");
        band.add("Halil");
        band.add("Kemal");

        System.out.println(band);
        System.out.println("At İndex 1: " + band.get(1));

        System.out.println();

        band.add(2,"Ringo");
        System.out.println(band);

        System.out.println("Size of the band: "+ band.size() );

        int index=0;
while(index< band.size()){
    System.out.println(band.get(index));
    index++;
}
*/


        //basamak değeri korunarak sayı toplama
/*
int number, lastDigit, reverse = 0 ;

Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer:");
        number=scanner.nextInt();

do {
    lastDigit=number%10;
    reverse=(reverse*10)+lastDigit;
    number=number/10;
}while (number>0);
        System.out.println("That number reversed is:"+reverse);

*/

        //üçgen yapma bundan sonrakiler
/*
        int i,k;//Değişkenlerimizi tanımladık.
        int sembol=1;//Yıldızımızın program başlangıçında, kaç tane yıldız yazdıracağını belirtiriz.

        for(k=0; k<9; k++) {//Döngümüzün kaç kere döneceğini ve kaça kadar yıldız yazdıracağını belirtir.
            for (i=0; i <sembol; i++) {//Yıldızımızın satırlarda kaçar kaçar basılacağını belirttik.
                System.out.print("*");//Sembolümüzü belirttik.
            }
            System.out.println("");//Yıldızlarımız basıldıktan sonra alt satıra geçilmesini sağlıyoruz.
            sembol++;//Yıldızımızın birer birer artmasını sağlarız.
        }*/


        int i, k;
        int sembol = 1;

        for (k = 0; k < 9; k++) {
            for (i = 0; i < sembol; i++) {
                System.out.print("*");
            }
            System.out.println();
sembol++;
        }



        /*int total = 0;
        int i = 1;
        while (i <= 100) {

            if (i % 2 == 0) {
                total = total + i;
            } else {

            }
            i++;
        }
        System.out.println(total);

*/

    }
}
