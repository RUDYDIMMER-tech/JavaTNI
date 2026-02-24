package Banking;

import java.util.Scanner;

public class BankSystem1 {

    public static String input_account_id(Scanner sc) {
        String accId;

        while (true) {
            System.out.print("Enter account id: ");
            accId = sc.nextLine();

            if (accId.length() == 10) {
                return accId;
            } else {
                System.out.println("Account id must be 10 characters. Try again.");
            }
        }
    }

    public static double input_initial_balance(Scanner sc) {
        double balance;

        while (true) {
            try {
                System.out.print("Enter your initial deposit amount: ");
                balance = Double.parseDouble(sc.nextLine());
                return balance;
            } catch (NumberFormatException e) {
                System.out.println("Try again!! Enter your initial deposit amount:");
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String account_bank = input_account_id(sc);
        double initial_balance = input_initial_balance(sc);

        OpenNewAccount account =
                new OpenNewAccount(account_bank, initial_balance);

        String result = account.recordAccount();
        System.out.println(result);

        sc.close();
    }
}