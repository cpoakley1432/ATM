import java.util.Scanner;

/**
 * Created by cameronoakley on 10/9/15.
 */
public class ATM {
    public static void run() throws Exception {
        System.out.println("Welcome to City Bank");
        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (name.equals(""))
            throw new Exception("Invalid name.");

        System.out.println("[1] Check my balance");
        System.out.println("[2] Withdraw Funds");
        System.out.println("[3] Cancel ");
        String action = scanner.nextLine();
        int actionNum = Integer.valueOf(action);
        if (actionNum == 1) {
            System.out.println("Your balance is $200");
        } else if (actionNum == 2) {
            System.out.println("How much would you like to withdraw?");
            String withdraw = scanner.nextLine();
            int withdrawNum = Integer.valueOf(withdraw);
            if (withdrawNum > 100) {
                throw new Exception("Not enough funds");

            } else if (withdrawNum < 100) {
                System.out.println("Please take your money");
            }
        } else if (actionNum == 3){
            System.out.println("Thank you and please come again");
        }
    }
}
