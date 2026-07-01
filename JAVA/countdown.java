package JAVA;
public class countdown{
    public static void main(String args[]) throws InterruptedException {
        
        for(int i = 10; i>0; i--){
            System.out.println("Time left : "+ i + " sec");
            
            Thread.sleep(1000);
        }
        System.out.println("Time over!");
    }
}