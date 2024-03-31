package com.reankhode;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class BankingApp {

    private final HashMap<Integer, Double> account = new HashMap<>();
    private int nextAccount = 0;
    private int current = 0;
    private Scanner scanner;
    private boolean stop = false;

    public static void main(String[] args) {
        BankingApp bankingApp = new BankingApp();
        bankingApp.startApp();
    }

    public void startApp() {
        scanner = new Scanner(System.in);
        while (!stop) {
            System.out.println();
            System.out.println("Enter command: "
                    + Colors.RED_BRIGHT + "0 = Quit " + Colors.RESET
                    + Colors.GREEN_BRIGHT + "1 = New Account " + Colors.RESET
                    + Colors.PURPLE_BRIGHT + "2 = Select Account " + Colors.RESET
                    + Colors.YELLOW_BRIGHT +"3 = Deposit Account " + Colors.RESET
                    + Colors.CYAN_BRIGHT +"4 = Loan " + Colors.RESET
                    + Colors.WHITE_BRIGHT +"5 = Add Interest " + Colors.RESET
                    + Colors.BLUE_BRIGHT +"6 = Show All Accounts :)" + Colors.RESET
            );
            int command = scanner.nextInt();
            this.processingCommand(command);
        }
        scanner.close();
    }

    public void processingCommand(int command) {
        switch (command) {
            case 0 -> quitApp();
            case 1 -> createAccount();
            case 2 -> showBalances();
            case 3 -> deposit();
            case 4 -> requestLoan();
            case 5 -> addInterest();
            case 6 -> showAccounts();
            default -> System.out.println("Command invalid!");
        }
    }

    public void createAccount() {
        current = ++nextAccount;
        account.put(current, 0d);
        System.out.println("Your new account number is : " + current);
    }

    public void showBalances() {
        System.out.println("Enter your account number : ");
        current = scanner.nextInt();
        Double balance = account.get(current);
        if (null == balance) {
            System.out.println("Account not found : " + current);
        } else {
            System.out.println("The balance of the account " + current + " is " + balance);
        }
    }

    public void deposit() {
        System.out.println("Enter amount to deposit : ");
        double amount = scanner.nextDouble();
        Double balance = account.get(current);
        if (null == balance) {
            System.out.println("Please select the account you want to deposit.");
        } else {
            account.put(current, amount + balance);
        }
    }

    public void requestLoan() {
        System.out.println("Enter the loan amount : ");
        double amount = scanner.nextDouble();
        Double balance = account.get(current);
        if (null == balance) {
            System.out.println("Please select the account you want to request the loan.");
        } else {
            if (amount <= 50) {
                System.out.println("Your is approved.");
            } else {
                System.out.println("Your loan is denied.");
            }
        }
    }

    public void addInterest() {
        double rate = 0.02;
        Set<Integer> accounts = this.account.keySet();
        if (accounts.isEmpty()) {
            System.out.println("No account found!");
        } else {
            for (Integer acc: accounts) {
                double balance = this.account.get(acc);
                double newBalance = balance * (1 + rate);
                this.account.put(acc, newBalance);
            }
        }
    }

    public void showAccounts() {
        Set<Integer> accounts = this.account.keySet();
        if (accounts.isEmpty()) {
            System.out.println("No account found!");
        } else {
            for (Integer acc: accounts) {
                System.out.println("Bank account " + acc + ": balance = " + this.account.get(acc));
            }
        }
    }

    public void quitApp() {
        stop = true;
        System.out.println("Thank you for using our banking service.");
    }
}
