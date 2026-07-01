package JAVA;

import java.util.ArrayList;
import java.util.Scanner;

public class atm2 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO ATM MACHINE");
        int password = 6565;
        int balance = 1000;
        int attempts = 3;

        // Array list use store widthdraw and deposit history

        ArrayList<String> transactions = new ArrayList<>();

        // pin verification loop

        while (attempts > 0) {
            System.out.print("Enter your 4-digit pin: ");
            int pin;
            try {
                pin = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input! Please enter numbers only.");
                sc.next();
                continue; // clear invalid input
            }

            if (pin == password) {
                System.out.println("Pin Accepted! ");

                while (true) {
                    System.out.println("-----------ATM Menu-------- ");
                    System.out.println("1. Check Balance ");
                    System.out.println("2. Deposit Money ");
                    System.out.println("3. Withdraw Money");

                    System.out.println("4. Mini Statement ");
                    System.out.println("5. Exit ");
                    System.out.println("--------------------------- ");
                    System.out.println("Enter your choice(1-5): ");
                    int choice;
                    try {
                        choice = sc.nextInt();
                    } catch (Exception e) {
                        System.out.println("Invalid Input! Please enter a number");
                        sc.next();// clear invalid choice
                        continue;
                    }
                    // check balance

                    if (choice == 1) {
                        System.out.println("Your Current Balance is Rs: " + balance);
                    }

                    // deposite money
                    else if (choice == 2) {
                        System.out.println("Enter amount to deposit in Rs: ");
                        int deposit = sc.nextInt();
                        if (deposit <= 0) {
                            System.out.println("Amount must be greater then 0.");
                        } else {
                            balance += deposit;
                            transactions.add("Deposited Rs " + deposit);
                            System.out.println("Deposited Rs " + deposit + " New Balance Rs: " + balance);

                        }
                    }
                    // withdrawal money
                    else if (choice == 3) {
                        System.out.println("Enter amount to withdraw: Rs ");
                        int withdraw = sc.nextInt();
                        if (withdraw <= 0) {
                            System.out.println("Amount must be greater then 0.");
                        } else {
                            if(withdraw > balance){
                                System.out.println("Insufficent Balance");
                            }else{
                            balance -= withdraw;
                            transactions.add("Withdraw Rs " + withdraw + " | Remaianing balance: Rs" + balance);
                            }
                        }
                    }
                    // mini statement
                    else if (choice == 4) {
                        System.out.println("\n Mini Statement: ");
                        if (transactions.isEmpty()) {
                            System.out.println("NO recent transcations. ");

                        } else {
                            int start = Math.max(transactions.size()-5,0);
                            for (int i = start; i < transactions.size(); i++) {
                                System.out.println("- " + transactions.get(i));
                            }
                        }
                        System.out.println("-------------------------------");

                    } else if (choice == 5) {
                        System.out.println("Thank you for using ATM. Please Visit Again! ");
                        break;
                    } else {
                        System.out.println("Invalid choice. Please enter between 1-5.");
                    }

                }
                break;

            }
            // wrong pin logic
            else{
                attempts--;
                System.out.println("Incorrect PIN. "+ attempts + " attempts(s) left. ");
            }if(attempts == 0){
                System.out.println("Too many incorrect attempts. Card Blocked");
            }
        }
        sc.close();

    }

}
