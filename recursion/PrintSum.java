package recursion;
import java.util.*;
public class PrintSum {
    public static void Printsum(int n, int i, int sum){

        if(i == n){
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        Printsum(n, i+1, sum);

    }

    public static void main(String args[]){
        Scanner dp = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = dp.nextInt();
        int i = 1;
        int sum = 0;
        Printsum(n, i, sum);
    }
    
}
