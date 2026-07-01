package Back_Tracking;

public class backAB{
    public static void printPermutations(String str, String perm){

        // base case
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
        // Choice
        for(int i = 0; i<str.length(); i++){
            char currChar = str.charAt(i);

            // Remaining String
            String newStr = str.substring(0,i) + str.substring(i + 1);

            // Recursive Call
            printPermutations(newStr, perm + currChar);
        }
    }
    public static void  main(String[] args){
        printPermutations("ABC",  "");
    }
    
}
