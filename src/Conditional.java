
import java.util.*;

public class Conditional {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if( a==b){

            System.out.println("Equal");
        } else {
            if(a>b){
                System.out.println("a is grater");
            }
            else{
                System.out.println("a is lesser");
            }
        }


//        if(x % 2 ==0){
//            System.out.println("Even");
//        }
//        else{
//            System.out.println("Odd");
//        }



    }
}
