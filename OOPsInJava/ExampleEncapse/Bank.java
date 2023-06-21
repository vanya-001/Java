package ExampleEncapse;

class Account{
    public String name;
    protected String email;
    private String password;

    // to access private access modifiers => getters& setters

    public String getPassword(){
        return this.password;
    }
    public void setPassword(String Pass){
        this.password = Pass;
    }
}
public class Bank{
    public static void main(String[] args) {
        Account ac1 = new Account();
        ac1.name="Vanya";
        ac1.email = "vanimaheshwari19@gmail.com";

        ac1.setPassword("abcd");
        System.out.println(ac1.getPassword());
    }
}
