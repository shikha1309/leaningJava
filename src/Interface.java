interface Animal1 {
    public void walk();
    int eyes =2;
}
interface Herbivore{

}

// This is the example of multiple inheritance
class Cow implements Animal1 , Herbivore{
    public void walk(){  // using this function
        System.out.println("walks on 4 legs");
    }

}

public class Interface {
    public static void main (String args[]){
        Cow cow =new Cow();
        cow.walk();

    }
}
