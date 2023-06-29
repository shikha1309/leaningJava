package MyPackage1;
import java.util.*;

public class Arrays {
//1.      public static void main(String args[]){
//            Scanner sc = new Scanner(System.in);
//            int size = sc.nextInt();
//            int numbers[] = new int [size];
//
//              // input
//            for(int i=0; i<size; i++){
//                  numbers[i] = sc.nextInt();
//            }
//            int x = sc.nextInt();
//           // output
//            for (int i=0; i<size; i++){
//                 if (numbers[i]==x){
//                       System.out.println("x found at index :" + i );
//                 }
//            }
//
//      }

      public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int numbers []= new int [size];

            // input
            for (int i=0; i<size; i++){
                  numbers[i]  =  sc.nextInt();

            }
            int min = Integer.MIN_VALUE;
            int max = Integer .MAX_VALUE;

            for( int i=0; i<numbers.length; i++){
                  if(numbers[i] < min){
                        min=numbers[i];
                  }
                   if (numbers[i]>max){
                         max=numbers[i];
                   }
            }

            System.out.println("Largest num is : " + max);
            System.out.println("Smallest num is : "  + min);

      }
}
