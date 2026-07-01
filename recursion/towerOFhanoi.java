package recursion;

import java.util.*;

public class towerOFhanoi {

    public static void towerOhanoi(int n, String src, String helper, String dest) {

        if (n == 1) {
            System.out.println("Transfer disk" + n + "form" + src + "to" + dest);
        }
        towerOhanoi(n - 1, src, dest, helper);
        System.out.println("Transfer disk" + n + "form" + src + "to" + dest);
        towerOhanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        towerOhanoi(n, "S", "H", "D");
    }

}
