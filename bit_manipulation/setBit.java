package bit_manipulation;

public class setBit{

    public static void main(String args[]){
        int n = 5; // Binary = 0101
        int position = 4;

        int bitMask = 1<< position;

        // Set Bit
        int newNumber = bitMask | n;
        System.out.println("New Number: " + newNumber);
    
    }   
}