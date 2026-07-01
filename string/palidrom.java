package string;

import java.util.Scanner;

public class palidrom {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word: ");
        String word = sc.nextLine();
        String pala = "";

        for(int i = word.length()-1; i>=0; i--){
            pala = pala + word.charAt(i);

            
        }
        if(word.equals(pala)){
            System.out.println("word is palidrom");
        }else{
            System.out.println("word is not palidrom");
        }

    }
    
}
