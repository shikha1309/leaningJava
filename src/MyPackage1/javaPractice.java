
package MyPackage1;
import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;
// // swaping without using third variable
//public class javaPractice {
//    public static void main (String args[]){
//        int a = 10;
//        int b = 30;
//        System.out.println(" Before Swapping variable" + a + "  " + b);
//
//         a= a+b;  // 40
//         b= a-b;  //10
//         a = a-b;   //   30
//
//         System .out.println("After Swapping the values are "  + a + " " + b );
//    }
//}
//
//// swaping    A and B value should Not be Zero without temp variable
//public class javaPractice {
//    public static void main (String args[]){
//        int a = 10;
//        int b = 30;
//        System.out.println(" Before Swapping variable    " + a + "  " + b);
//
//        a= a*b;  // 300
//        b= a/b;   // 10
//        a = a/b;   //   30
//
//        System .out.println("After Swapping the values are "  + a + " " + b );
//    }
//}



////  2.1 reverse 1234 = 4321
//public class javaPractice {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Enter a Numbers :");
//        int num = sc.nextInt() ;
//        int reverse = 0;
//        while( num!=0) {
//            reverse= reverse*10 + num %10; // 0 +4
//            num= num/10 ; // = 123
//          }
//        System.out.println( " Reverse number is : " + reverse );
//
//    }
//}



////  2.1 reverse String buffer
//public class javaPractice {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Enter a Numbers  :  ");
//        int num = sc.nextInt() ;
//        StringBuffer reverse;  //defining the variable
//        StringBuffer sb = new StringBuffer( String.valueOf(num));
//        reverse = sb.reverse();
//      System.out.println( " Reverse number is : " + reverse );
//    }
//}


//  2.1 reverse String  (using concatenation operator)
//public class javaPractice {
//    public static void main(String args[]) {
//        int count = 0;
//     String str = "Shikha is my Name";
//     count  =str.length();
//     System.out.println(count);
//    }
//}


//  finding max and min number in the array
//public class javaPractice {
//    public static void main(String args[]) {
//       Scanner sc = new Scanner(System.in);
//        int size  = sc.nextInt();
//        int array []= new int [size];
//
//        Arrays.sort(array);
//        System.out.println(" min " + array[0]);
//        System.out.println(" max " + array[array.length-1]);
//    }
//}


;
public class javaPractice{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers []= new int [size];
        int min = numbers[0];
        int max = numbers[0];
        // input
        for (int i=0; i<size; i++){
            numbers[i]  =  sc.nextInt();
        }

        for(int i =0; i<size-1;i++){
            if(numbers[i]>numbers[i+1]){
                min = numbers[i+1];
            }
            if(numbers[i]<numbers[i+1]){
                max = numbers[i+1];


            }
        }


        System.out.println("Largest num is : " + max);
        System.out.println("Smallest num is : "  + min);
        sc.close();
    }
}

