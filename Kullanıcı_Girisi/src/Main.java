import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int wrongEntry = 3;
        Scanner scanner = new Scanner(System.in);

        String nickName = "sakir";
        String password = "123";


        System.out.println();
        System.out.println("************************************");
        System.out.println("Welcome The User Login Platform");
        System.out.println("************************************");

        while (true){
        System.out.print("Enter The User Name:");
        String userNickName = scanner.nextLine();

        System.out.print("Enter The User Name:");
        String userPassword = scanner.nextLine();

        if (userNickName.equals(nickName) && userPassword.equals(password)) {

            System.out.println("Congrulations! You're Succesfuly Entered.");
            System.out.println("Welcome Dear:"+nickName);
break;
        }else if((!userNickName.equals(nickName) && userPassword.equals(password))) {
                System.out.println("Wrong User Name! Please Try Again!");
                wrongEntry--;
            if (wrongEntry==0){
                System.out.println("Entry Permit Expired");
                break;
            }

        }else if ((userNickName.equals(nickName) && !userPassword.equals(password))){
            System.out.println("Wrong Password! Please Try Again!");
            wrongEntry--;
            if (wrongEntry==0){
                System.out.println("Entry Permit Expired");
                break;
            }
        }else {
            System.out.println("Wrong User Name And Password! Please Try Again!");
            wrongEntry--;
            if (wrongEntry == 0) {
                System.out.println("Entry Permit Expired");
                break;
            }


        }

        }


    }
}
