package JAVA;

import java.util.Scanner;

public class Atm {

    // Function to print line
    public static void line(){
        System.out.println("-------------------------------------");

    }
    
    // Function to check balance
    public static void checkBalance(int balance){
        System.out.println("Current Balance: " + balance);
    }
    
    // Function to deposit money
    public static int deposit (int balance, int amount){
        balance = balance + amount;
        System.out.println(amount + "Deposited Successfully");
        return balance;
    }

    //Function to withdraw money
    public static int withdraw(int balance, int amount){
        if(amount > balance){
            System.out.println("Insufficient Balance");
        }else{
            balance = balance - amount;
            System.out.println(amount + "Withdraw Successfully");
        }
        return balance;
    }

    // Function to calculate interst
    public static double interest(int balance, double rate){
        double interest = (balance * rate * 1)/100;
        return interest;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // String Input
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        // Initial balance

        int balance = 1000;

        // Array
        int transactions[] = new int[10];

        int index  = 0;
        
        int Choice;

        // do while loop
        do{
            line();
            

            System.out.println("WELCOME " + name.toUpperCase());
            
            
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Show Transactions");
            System.out.println("5. Calculate Interest");
            System.out.println("6. Reverse Name");
            System.out.println("7. Exit");

            line();

            System.out.print("Enter Your Choice: ");
            Choice = sc.nextInt();

            switch(Choice){
                
                case 1:
                    checkBalance(balance);

                    break;
                
                case 2:
                    System.out.print("Enter Deposit Amount: ");
                    int depositAmount = sc.nextInt();
                    balance = deposit(balance, depositAmount);
                    if(index < transactions.length){
                        transactions[index] = depositAmount;
                        index ++;
                    }
                    break;

                    case 3:

                        System.out.print("Enter withdraw Amount: ");

                        int withdrawAmount = sc.nextInt();

                        balance = withdraw(balance, withdrawAmount);

                        if(index < transactions.length){
                            transactions[index] = -withdrawAmount;
                            index ++;

                        }
                        break;

                    case 4:
                            System.out.println("Transaction History");

                            // while loop

                            int i = 0;

                            while(i < index){
                                if(transactions[i] > 0){
                                    System.out.println("Deposited: " + transactions[i]);

                                    
                                }else{
                                    System.out.println("Withdraw: " + (-transactions[i]));                          
                                }

                                i++;
                            }           
                  
                            break;
                    

                        case 5:
                                System.out.print("Enter Interest Rate: ");
                                double rate = sc.nextDouble();
                                double totalInterest =  interest(balance, rate);
                                System.out.println("Interest Amount: " + totalInterest);
                                break;    

                        case 6:
                             String reverse = "";

                              // Reverse string using for loop
                             for(int j = name.length()-1; j>=0; j--){
                                reverse = reverse + name.charAt(j);
                              }

                             System.out.println("Reverse Name: "+ reverse);
                             break;

                        case 7:

                            System.out.println("Thank You For Using ATM");

                            break;

                        default:
                            System.out.println("Inalid Choice");
                        


            }
          



        }while(Choice != 7);
          sc.close();
    }
}
    
