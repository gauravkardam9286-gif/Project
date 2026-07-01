package bit_manipulation;

public class getBit {

    public static void main(String args[]){

        int n = 5;
        int position = 2;

        // Create Bit Mask
        
        int bitMask = 1 << position;

        // Get Bit
        if((bitMask & n) == 0){
            System.out.println("Bit is 0");

        }else{
            System.out.println("Bit is 1");
        }
    }
    
}
