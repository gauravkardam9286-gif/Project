package imptopic;

import java.util.*;
public class ExceptionHandling {


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = 0;

        try{
             n = sc.nextInt(); 
        }
        catch(Exception e){
            System.out.println("Error. !Please Enter only interger");
        }
        System.out.println(n);
    }
    
}
