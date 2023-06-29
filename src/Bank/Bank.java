package Bank;
  class Account{
      public String name;
      protected String email;   // only subclass of other packages will access this ,, as well as  current packages

      private  String password;

      // getter and setter
      public String getPassword(){
          return  this. password;
      }
      public void setPassword(String pass){
          this .password=pass;
      }
  }
public class Bank {
      public static void main(String args[]){
          Account account1 =new Account();
          account1 .name= "This is my home";
          account1.email =" shikhayadav1309@gmail.com";
          account1.setPassword("12345");  // we cant access the password of Account class in the bank class
          // private parameter will access with the help of getter and setters
          System.out.println(account1.getPassword() );
      }
}
