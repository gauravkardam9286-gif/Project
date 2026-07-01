package imptopic;

public class sleepExample {

    public static void main(String args[]){

        try{
            System.out.println("Wating....");
            Thread.sleep(2000);
            System.out.println("Done");
        }catch (Exception e){
            System.out.println(e);
        }
    }
    
}
