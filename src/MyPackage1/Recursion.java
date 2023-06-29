package MyPackage1;

//public class Recursion {
//    //printing number 5 to 1
//    public static void printNumber(int n) {
//        // base case
//        //in   1 to 5 case === n==6
//        if(n==0) {
//            return;
//        }
//        System.out.println(n); // print statement
//        printNumber(n-1);  // calling itself
//    }
//    public static void main (String args[]) {
//        int n=5;
//        // calling this function in main function
//        printNumber(n);  // n=5
//    }
//
//}

// Q.2 n natural number sum
// public class Recursion {
//    // it will take 3 parameters  ,, value of n,,, base conditions  ,,sum==? where to store
//    public static void printSum(int i , int n , int sum) {
//        if( i==n) {
//            sum +=i;
//            System.out.println( " addition of natual numbers   " + sum);
//            return;
//
//        }
//        sum+=i;
//        printSum(i+1 , n,sum);
//
//    }
//     public  static void main (String args[]) {
//        printSum(1, 5 , 0);
//
//     }
//
//
//}


//// Q.3 find factorial of a given number
//public class Recursion {
//
//    public static int calcFactorial(int n){
//        if (n==1 || n==0 )  {
//            return 1;
//        }
//      int fact_nMinusOne = calcFactorial(n-1);
//      int fact_n = n*fact_nMinusOne;
//      return fact_n;
//
//
//    }
//    public  static void main (String args[]) {
//        int n = 5;
//        int ans = calcFactorial(n);   // storing in int A
//        System.out.println(ans);
//
//
//
//    }
//
//
//}
//




// Q.4  find fibonacci sequence till Nth term
//public class Recursion {
//
//       public static void fibonacci(int a , int b , int n  ){
//        if (n==0){
//            return;
//
//        }
//    int c= a+b;
//    System.out.println(c);
//    fibonacci(b,c,n-1 );
//    }
//
//   public  static void main(String args[]){
//        int a = 0;
//        int b = 1;
//        System.out.println(a);
//        System.out.println(b);
//        int n= 7;   // we will pass n-2 term ,because 2 term already printed
//        fibonacci(a,b,n-2);
//       }
//}

// 4.1 Printing Fibonacci series using Iterations
//public class Recursion {
//
//       public static void main( String[] args){
//           int term = 7;
//           int a, b , c;
//           a=0;
//           b=1;
//           for( int i=0;  i< term; i++) {
//               System.out.println( a + " ");
//                  c = a+b;
//                  a=b;   // swaping
//                  b=c;
//           }
//       }
//
//}




//  // Q.5 calculating X^N  or ( Stack height ==n)
//public class Recursion {
//    public  static int calcPower( int x , int n){
//        if( n==0  ){
//            return 1;
//        }
//        if( x==0) {
//            return 0;
//        }
//        // work
//        int xPowerNMinusOne = calcPower(x,n-1);
//        int xPown = x*xPowerNMinusOne;
//        return xPown;
//    }
//    public static void main(String args[]) {
//        int x = 2;
//        int n= 5;
//        //storing the value
//        int  answer = calcPower( x, n);
//        System.out.println(answer);
//
//    }
// }




// Q.5.2  ( Stack height ==n)
//public class Recursion {
//    public  static int calcPower( int x , int n){
//        if( n==0  ){
//            return 1;
//        }
//        if( x==0) {
//            return 0;
//        }
//        // if n is even
//        if(n % 2==0) {
//         return   calcPower( x, n/2) *calcPower(x, n/2) ;
//        }
//        else{
//            return calcPower( x, n/2) *calcPower(x, n/  2) * x ;
//        }
//
//
//    }
//    public static void main(String args[]) {
//        int x = 2;
//        int n= 5;
//        //storing the value
//        int  answer = calcPower( x, n);
//        System.out.println(answer);
//
//    }
//   }




// Q.7 Tower of Hanoi
//public class Recursion {
//     public static void towerOfHanoi(int n, String src , String helper , String dest){
//         if( n==1) {
//              System.out.println( " transfer disk " + n + "from " + src + " to " + dest);
//              return;
//         }
//         towerOfHanoi( n-1 ,src,  dest, helper); // moving S to D
//         System.out.println(" transfer disk " + n + "from " + src + " to " + dest);
//         towerOfHanoi( n-1, helper , src  ,dest );
//     }
//     public  static void main ( String args[]) {
//      int n= 3;
//   towerOfHanoi(n , "S", "H ", "D");
//
//  }
//}


// Q.8 Reverse the string using Index with recursive function
//public class Recursion {
//    public  static void printRev( String str , int idx ) {
//        if(idx == 0) {
//            System.out.println(str.charAt(idx));
//            return;
//        }
//        System.out.print(str.charAt(idx));
//        printRev(str, idx-1 );
//
//    }
//
//
// public static  void main ( String args[]) {
//        String str = "Shikha";
//        printRev(str ,str .length()-1);
//
// }
//}


//// Q 9.
//public class Recursion {
//    public static  int First = -1;
//    public static  int Last = -1;
//
//// function will void bcoz we dont need to return anything, only need to store value in First and Last Occurance
//    public static void findOccurance ( String str , int idx , char element){
//        // base case
//        if(idx== str.length()) {
//            System .out.println(First);
//            System.out.println(Last);
//            return;
//        }
//        char currChar = str . charAt(idx);
//                if ( currChar == element) {
//                    if(First ==-1){
//                        First =idx;
//                    }
//                    else{
//                        Last = idx;
//                    }
//
//                }
//                findOccurance(str , idx+1 , element);
//
//    }
//    public static  void main(String args[]) {
//        String str = "abaacdaefaahhip";
//        findOccurance( str ,0,  'a');
//
//    }
//
//
//}


// Q 10. Check it is strictly sorted or Not
//public class Recursion {
//    public static void moveAllX(String str, int idx, int count, String newString) {
//        //  base condition
//        if( idx ==str.length()){
//            for( int i=0; i<count; i++) {
//                newString += 'x';
//            }
//            System.out.println(newString);
//            return;
//        }
//        char currChar = str.charAt(idx);
//        if (currChar == 'x') {
//            count++;
//            moveAllX(str , idx+1 , count , newString);
//        } else {
//            newString += currChar; // newstring= newString + Current Char
//            moveAllX(str , idx+1 , count , newString);
//        }
//
//    }
//    public static void main(String args[]) {
//          String str = "axbcxxd";
//          moveAllX(str, 0,0," ");
//    }
//}

//Q.12  not understand
//public class Recursion {
//    public static boolean [] map = new boolean[26]  ;
//    public static  void removeDuplicates(String str, int idx , String newString)  {
//        if (idx ==str.length()) {
//            System.out.println(newString);
//            return;
//        }
//
//        char currentChar = str.charAt(idx);
//        if(map[currentChar - 'a']) { // if it is true
//            removeDuplicates( str , idx+1 , newString);
//        } else {
//            newString +=currentChar;
//            map[currentChar -'a']= true;
//            removeDuplicates(str ,idx +1 ,newString);
//        }
//
//    }
//    public static  void main (String args[]){
//        String str ="abbccda";
//        removeDuplicates(str ,0,   " ");
//    }
//
//}
//
//// Q .13.
//public class Recursion {
//    public  static void subsequesces ( String str , int idx , String newString)  {
//        // base case
//        if(idx == str.length()) {
//            System.out.println(newString);
//            return;
//        }
//
//        char currChar  = str.charAt(idx);
//        // to be
//        subsequesces( str , idx +1, newString+currChar); // will joint the char for next call
//        //not to be
//        subsequesces(str , idx+1 ,newString);  // not add the current char
//
//    }
//    public static void main(String args[]) {
//        String str = "abc";
//        subsequesces(str , 0, "");
//    }
//}


import java.util.HashSet;

// Q .14 Print all unique subsequences
//public class Recursion {
//    public  static void subsequesces ( String str , int idx , String newString , HashSet<String> set)  {
//
//        // base case
//        if(idx == str.length()) {
//          if(set.contains(newString)){ // will print nothing
//              return;
//          }  else {
//            System.out.println( newString);
//            set.add (newString );
//            return;
//          }
//        }
//
//        char currChar  = str.charAt(idx);
//        // to be
//        subsequesces( str , idx +1, newString+currChar ,set ); // will joint the char for next call
//        //not to be
//        subsequesces(str , idx+1 ,newString ,set);  // not add the current char
//
//    }
//    public static void main(String args[]) {
//        String str = "aaa ";
//        HashSet<String> set = new HashSet<>();
//
//        subsequesces(str , 0, ""  ,set);
//    }
//}

 //Q .15 Print Keypad
//public class Recursion {
//      // mapping of keypad will given
//     // str= "23"
// public  static String [] keypad = { "." , "abc" , "def" , "ghi" , "jkl" ,  "mno" , "pqrs" , "tu" , "vwx", "yz"} ;
//  public static  void printComb ( String str, int idx , String combination )
//  {
//      if(idx==str.length()) {
//           System.out.println(combination);
//           return;
//      }
//      char currChar  = str.charAt(idx);
//      String mapping = keypad[currChar -'0'];
//      for( int i=0; i<mapping.length(); i++) {
//          printComb(str,idx +1 , combination+mapping.charAt(i));
//
//      }
//  }
//  public static  void main(String args[]) {
//      String str = "3";
//      printComb(str, 0, "");
//
//
//    }
//
//}

<<<<<<< HEAD

public class Recursion {
    public static void printPermutation(String str, String permutation ){
        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for( int i=0; i<str.length(); i++) {
            // find first char of level 1
            char currChar = str.charAt(i);
            // if we choose a then make bc / cb
            String newStr = str.substring( 0 , i) + str.substring(i+1);
            printPermutation(newStr, permutation+currChar);


        }

    }

    public static void main(String args[]) {
        String str ="abcd";
        printPermutation(str ,"");

    }


=======
//// 16. Find the permutation of String *
//public class Recursion {
//    public static void printPermutation(String str, String permutation ){
//        if(str.length() == 0){
//            System.out.println(permutation);
//            return;
//        }
//        for( int i=0; i<str.length(); i++) {
//            // find first char of level 1
//            char currChar = str.charAt(i);
//            // if we choose a then make bc / cb
//            String newStr = str.substring( 0 , i) + str.substring(i+1);
//            printPermutation(newStr, permutation+currChar);
//
//
//        }
//
//    }
//
//    public static void main(String args[]) {
//        String str ="abcd";
//        printPermutation(str ,"");
//
//    }
//}


// 17 . Count total path in a maze to move from (0, 0) to (n,m)
public class Recursion {
    public static int countPaths( int i , int j , int n , int m ){
        if(i==n || j==n){
            return 0; // no path

        }
        if(i==n-1 && j==m-1){
            return 1; //stop
        }

           int downPath = countPaths( i+1 , j ,n ,m); // move downward
           int rightPath = countPaths(i, j+1, n,m);   // move right
           return downPath + rightPath;


    }
    public static void main(String args[]){
        int n= 3, m=3;
        int totalPath= countPaths(0,0,n,m);
        System.out.println(totalPath);

    }

>>>>>>> 2e7a13d (practice)
}








<<<<<<< HEAD

=======
>>>>>>> 2e7a13d (practice)
