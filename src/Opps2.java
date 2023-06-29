import Bank.Bank;
class Student1 {
    String name;
    int age;


   // run time polymorphism // using same function(printInfo) for different purposes
    // overloading = same name of function in one class
    public void printInfo(String name) {
        System.out.println(name);

    }
    public void printInfo(int age) {

        System.out.println(age);
    }
    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }


}

// this is my main function
public class Opps2 {
    public static void main (String args[]){
//        Student1 s1 = new Student1 ();
//        s1.name ="Shikha";
//        s1.age = 18;
//
//        s1 .printInfo(s1.name ,   s1.age);

//        Account account1= new Bank.Account();
//        account1.name = "Customer1";
    }
}
