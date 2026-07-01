package Array;

import java.util.*;

public class evenodd {

    // ARRAY FUNCTION
    public static void oddeven(int[] arr) {
        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even = even + 1;
            } else if (arr[i] % 2 != 0) {
                odd = odd + 1;
            } else {
                System.out.println("code fail");
            }
        }
        System.out.println("even :  " + even);
        System.out.println("odd : " + odd);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter Array Element: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        oddeven(arr);
        sc.close();
    }

}
