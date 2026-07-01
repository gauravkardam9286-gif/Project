package JAVA;

import java.util.*;

public class OTPverify {

    public static int resendotp(int o) {

        int Rotp = 0;

        if (o == 6) {

            Random rand = new Random();

            Rotp = 1000 + rand.nextInt(9000);

        } else {

            System.out.println("Invalid Number!");
        }

        return Rotp;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=========== Profile Register ==========");

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Gender: ");
        String Gender = sc.next();

        try {

            System.out.print("Enter age: ");
            int age = sc.nextInt();

            int otp = resendotp(6);

        } catch (Exception e) {
            System.out.println("Please enter age in numbers only!");
            sc.close();

        }

            System.out.print("Your Name : " + name + "\n");
            System.out.print("Your Gender : " + Gender + "\n");
            System.out.print("Your Age: " + age + "\n");
            System.out.print("Your OTR I'D : " + otp + "\n");
    }
}