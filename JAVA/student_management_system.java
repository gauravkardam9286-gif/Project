package JAVA;

import java.util.Scanner;

public class student_management_system {

    // Function to print line

    public static void line() {
        System.out.println("----------------------------");

    }

    // Function to calculate average
    public static int average(int marks[]) {
        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }

        return sum / marks.length;
    }

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        // String input
        System.out.print("Enter Student First Name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter Student Last Name: ");
        String lastName = sc.nextLine();

        // String Concatenation
        String fullName = firstName + " " + lastName;

        // Array
        int marks[] = new int[5];

        line();

        // Loop for marks intput
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Enter Marks of Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        line();
        // Function calling
        int avg = average(marks);

        // output
        System.out.println("Student Name: " + fullName);

        // String methods
        System.out.println("Uppercase Name:" + fullName.toUpperCase());
        System.out.println("Total Character: " + fullName.length());

        line();

        System.out.println("Average Marks : " + avg);

        // if-else condition 
        if(avg >= 90){
            System.out.println("Grade : B");
        
        }
        else if(avg >= 75){
            System.out.println("Grade : A");
        
        }else if(avg>=60){
            System.out.println("Grade : B");

        }
        else if(avg>= 40){
            System.out.println("Grade : C");

        }else{
            System.out.println("Fail");
        }

        line();

        // Switch case
        
        System.out.println("Choose Option:");
        System.out.println("1. Show Name");
        System.out.println("2. Show Average");
        System.out.println("3. Exit");

        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("Student Name is:"+ fullName);
                break;
            
            case 2:
                System.out.println("Average Marks are: " + avg);
                break;
            

            case 3:
                System.out.println("Program Ended");
                break;

            default:
                System.out.println("Invalid Choice");

        }

        line();

        // Reverse name using loop + string


        String reverse = "";
        for(int i = fullName.length()-1; i>=0; i--){
            reverse = reverse + fullName.charAt(i);
        }

        System.out.println("Reverse Name: "+ reverse);

        sc.close();




        }   

    }

