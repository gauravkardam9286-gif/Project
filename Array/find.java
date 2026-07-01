package Array;
import java.util.*;


public class find{
    

    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Array Size : ");
    int n = sc.nextInt();
    int [] array = new int [n];
    
    System.out.println("Enter Array Element : ");
    for(int i = 0; i<n; i++){
        array[i] = sc.nextInt();
    }

    // MIN ARRAY
    int min = array[0];

    for(int i = 1; i<n; i++){
        if(array[i] < min){

            min = array[i];
        }
    }
    System.out.println("Your min element is: "+min);
}

    
}
