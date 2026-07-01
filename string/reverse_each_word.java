package string;

import java.util.Scanner;

public class reverse_each_word {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sent = sc.nextLine() + " ";
        
        String java = "";

        for(int i = 0; i< sent.length(); i++){
            if(sent.charAt(i) != ' '){
                java = java + sent.charAt(i);
            }else{
                for(int j = java.length()-1; j>=0; j--){
                    System.out.print(java.charAt(j));
             }
             System.out.print(" ");
             java = "";
            }

        }
            
        
    }
    
}
