package Bank;

class Account{
    public String name;
    protected String email;
    private String password;

    //getters and setters
    public String getPassword(){
        return this.password;

    }
    public void setPassword(String pass){
        this.password = pass;    
    }

}
public class GetandSet {
    public static void main(String[] args){
        Account a1 = new Account();
        a1.name = "Pratiksha Rale";
        a1.email = "pprale@mitaoe.ac.in";
        a1.setPassword("Password@123");
        System.out.println(a1.name);
        System.out.println(a1.email);
        System.out.println(a1.getPassword());


    }


}
