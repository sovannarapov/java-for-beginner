package com.sovannarapov;

import java.util.Scanner;

public class BankClient {
    private int current = 1;
    private Scanner scanner = new Scanner(System.in);
    private boolean stop = false;
    private final Bank bank = new Bank();

    public void run() {
        scanner = new Scanner(System.in);
        while (!stop) {
            System.out.println();
            System.out.println("Enter command("
                    + Colors.RED_BRIGHT + " 0 = Quit " + Colors.RESET
                    + Colors.GREEN_BRIGHT + " 1 = New Account " + Colors.RESET
                    + Colors.PURPLE_BRIGHT + " 2 = Select Account " + Colors.RESET
                    + Colors.YELLOW_BRIGHT + " 3 = Deposit " + Colors.RESET
                    + Colors.CYAN_BRIGHT + " 4 = Loan " + Colors.RESET
                    + Colors.WHITE_BRIGHT + " 5 = Add Interest " + Colors.RESET
                    + Colors.BLUE_BRIGHT + " 6 = Show All Account): " + Colors.RESET);

            int command = scanner.nextInt();
            this.processingCommand(command);
        }
        scanner.close();
    }

    public void processingCommand(int command) {
        switch (command) {
            case 0 -> closeProgram();
            case 1 -> addAccount();
            case 2 -> selectAccount();
            case 3 -> deposit();
            case 4 -> loan();
            case 5 -> addInterest();
            case 6 -> showAllAccounts();
            default -> System.out.println("Command invalid!");
        }
    }

    public void closeProgram() {
        stop = true;
        System.out.println("Thank you for using services our banking!");
    }

    private void addAccount() {
        current = bank.newAccount();
        System.out.println("Your new account number is: " + current);
    }

    private void selectAccount() {
        System.out.println("Enter your account number: ");
        current = scanner.nextInt();
        double balance = bank.getBalance(current);
        System.out.println("The balance of account " + current + " is " + balance);
    }

    private void deposit() {
        System.out.println("Enter deposit amount: ");
        double amount = scanner.nextDouble();
        bank.deposit(current, amount);
    }

    private void loan() {
        System.out.println("Enter loan amount: ");
        double amount = scanner.nextDouble();
        if (bank.loan(current, amount))
            System.out.println("Your loan is approved.");
        else
            System.out.println("Your loan is denied.");
    }

    private void addInterest() {
        bank.addInterest();
    }

    private void showAllAccounts() {
        System.out.println(bank.showAllAccounts());
    }
}
