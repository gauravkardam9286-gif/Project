package string;

public class conc{

    public static void main(String args[]){
        //CONCATENATION
        String firstname = "Gaurav";
        String lastname = "Kardam";
        String fullname = firstname + lastname;
        System.out.println(fullname);
        System.out.println(fullname.length());
        for(int i = 0; i < fullname.length(); i++){
            System.out.println(fullname.charAt(i));
        }

    }
}