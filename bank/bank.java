package bank;
class Account{
    public String name;
    protected String email;
    private String password;
// getters and setters

public String getpassword(){
    setPassword(randomPass);
    return this.password;
}
private void setpassword(String pass){
     this.password = pass;
}



}



public class bank {
    public static void main(String args[]){
        Account account1 = new Account();
        account1.name = "apna college";
        account1.email = "apnacollege@gmail.com";
        account1.setpassword("klfgsj");
        System.out.println(account1.getpassword());
    }
    
}
