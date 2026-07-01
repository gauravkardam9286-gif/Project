package recursion;

import java.util.*;


public class find_First_and_last_occrance {
    public static int first = -1;
    public static int last = -1;
    public static void floccrance(String str, int idx, char element){
        if(idx == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char Currchar = str.charAt(idx);
        if(Currchar == element){
            if(first == -1){
                first = idx;
            }else{
                last = idx;
            }
        }
        floccrance(str, idx+1, element);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str =  sc.next();
        System.out.print("Enter character to find: ");
        char ch = sc.next().charAt(0);
        floccrance(str, 0, ch);

    }
    
}
