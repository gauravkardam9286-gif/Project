import java.util.*;
import java.util.HashSet;
public class Hashset {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Array Size : ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    HashSet<Integer>set =  new HashSet<>();
    System.out.println("Enter Input in Array : ");
    for(int i =0; i< arr.length; i++){
        arr[i] = sc.nextInt();
        set.add(arr[i]);
    }
    System.out.println(set);
}

    
}
