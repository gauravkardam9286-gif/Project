package string;

import java.util.*;

public class reverse {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word: ");
        String word = sc.nextLine();

        StringBuilder sb = new StringBuilder(word);
        System.out.println("reverse word: "+sb.reverse());
        
    }
    
}
