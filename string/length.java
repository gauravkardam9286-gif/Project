package string;

import java.util.*;

public class length {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter your full name: ");      
        String name = sc.nextLine();

        int length = name.length();
        System.out.println("your name length is : "+ length);
    }
    
}
