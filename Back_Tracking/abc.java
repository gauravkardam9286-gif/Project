package Back_Tracking;

public class abc {

    public static void printPermutation(String str, String perm, int idx){
        if(str.length() == 0){
            System.out.println(perm);
            return;
        }
        for(int i = 0; i<str.length(); i++){
            char Currchar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermutation(newStr, perm+Currchar, idx+1);
        }
    }
    public static void main(String args[]){
        String str = "ABCDE";
        printPermutation(str, "", 0);
    }
    
}
