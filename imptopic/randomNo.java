package imptopic;

import java.util.Random;
public class randomNo{
    public static void main(String args[]){
        int i = 1;

        while(true){

            Random r = new Random();
            int num = 1000 + r.nextInt(9000);
            System.out.println(i + " otp " + num);
            i++;

        }

    }
}