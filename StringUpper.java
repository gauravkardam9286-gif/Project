public class StringUpper {
    public static void checkS(String word) {
        int uppercase = 0;
        for(int i = 0; i< word.length(); i++){
           if(Character.isUpperCase(word.charAt(i))){
            uppercase ++;
           }
        }
        if (uppercase == word.length() || uppercase == 0 || (uppercase == 1 && Character.isUpperCase(word.charAt(0)))) {
            System.out.println("true");
            
        }else{
            System.out.println("false");
        }
        
        }
        public static void main(String[] args) {
            String word = "Gaurav";
            checkS(word);
        }
}
