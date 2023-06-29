import java.util.*;
// Q .1 make a function to add 2 numbers and return the sum
//public class Functions {
// public static int calculateProduct( int a, int b){
//     int sum = a+b;
//     return sum;
//
//    }
//
//
//    public static void main (String  args[]){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//          int sum = calculateProduct(a,b);
//          System.out.println("The sum of the variable is " + sum);
//    }
//}



// Q .2 Make a function to multiply 2 numbers and return the product
//public class Functions {
//    public static int calculateProduct( int a, int b){  // making a function
//        int multiply = a*b;
//        return multiply;
//
//    }
//
//
//    public static void main (String  args[]){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        int multiply = calculateProduct(a,b);
//        System.out.println("The multiplication of the variable is " + multiply);
//    }
//}


// Q 3. Factorial find
//public class Functions {
//    public static void printFactorial( int n){  // making a function
//
//        if(n <= 0){
//            System.out.println("Invalid Number");
//            return;
//        }
//        int factorial =1;
//        for (int i=n; i>=1; i--){                //loop
//       factorial = factorial*i;
//   }
//     System.out.println(factorial);
//    }
//
//
//    public static void main (String  args[]){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//    printFactorial(n);
//    }
//}





// Q 4. Enter 3 numbers from the user & make a function to print their average
//public class Functions {
//
//public static void main (String  args[]){
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c= sc.nextInt();
//
//        int average = (a+b+c)/3;
//        System.out.println(average);
//    }
//}


// Q.5 Write a function to print the sum of all odd numbers from 1 to n.
public class Functions {

    public static void printSum(int n){
        int sum=0;
        for(int i=1; i<=n; i++){
            if(i % 2!=0){
                sum = sum +i;
            }
        }
     System.out.println(sum);
    }
    public static void main(String  args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        printSum(n);


    }
}