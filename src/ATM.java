import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by cameronoakley on 10/9/15.
 */
public class ATM {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to City Bank");

        HashMap<String, Double> accounts = new HashMap();


        while (true) {
            System.out.println("What is your name?");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            if (name.equals(""))
                throw new Exception("Invalid name.");

            if (!accounts.containsKey(name)) {
                System.out.println("Do you want to make a new account?");
                String s = scanner.nextLine();
                if (s.equals("yes")) {
                    accounts.put(name, 200.0);
                } else {
                    System.exit(0);
                }
            }

            double balance = accounts.get(name);

            System.out.println("[1] Check my balance");
            System.out.println("[2] Withdraw Funds");
            System.out.println("[3] Cancel ");
            System.out.println("[4] Delete my account");
            String action = scanner.nextLine();
            int actionNum = Integer.valueOf(action);
            if (actionNum == 1) {
                System.out.println("Balance is $" + accounts.get(name));
            } else if (actionNum == 2) {
                System.out.println("How much would you like to withdraw?");
                String withdraw = scanner.nextLine();
                int withdrawNum = Integer.valueOf(withdraw);
                if (withdrawNum > 100) {
                    throw new Exception("Not enough funds");

                } else if (withdrawNum < 100) {
                    System.out.println("Please take your money");
                }
            } else if (actionNum == 3) {
                System.out.println("Thank you and please come again");
            } else if (actionNum == 4){
                System.out.println(" Your account has been deleted");
            }
        }
    }
}

