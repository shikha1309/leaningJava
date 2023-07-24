
package MyPackage1;


import java.util.*;
import java.lang.*;



//Q 1
//public class prac1 {
//    public static void main( String args[]){
//
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//        int array[] = new int[size];
//        int min = array[0];
//        int max = array[0];
//
//        for( int i=0; i<size ; i++){
//            array[i]= sc.nextInt();
//        }
//        for( int i=0; i<size-1; i++){
//            if( array[i]>array[i+1]) {
//                min = array[i+1];
//            }
//            if( array[i]<array[i+1]) {
//                max = array[i+1];
//            }
//
//           }
//        System.out.println( "minimum " + min);
//        System.out.println( "maximax " +max );
//        sc.close();
//    }
//}




//2.1
//public class prac1 {
//    static  int arraySortedOrNot(int arr[], int n){
//        if(n==0 || n==1)
//            return 1;
//        if(arr[n-1]<arr[n-2])
//            return 0;
//        return arraySortedOrNot( arr ,n-1);
//    }
//    public static void main( String args[]){
//
//        int arr[] = { 20, 23, 45, 78, 88 };
//        int n = arr.length;
//        if (arraySortedOrNot(arr, n) != 0)
//            System.out.println("Yes");
//        else
//            System.out.println("No");
//
//    }
//}


 //Q.3
//public class prac1 {
//
//
//     // Function to Reverse the array
//     public static void reverse(int[] numbers, int start, int end) {
//         while ( start<=end){
//             int temp = numbers[start];
//             numbers[start]=numbers[end];
//             numbers[end] = temp;
//             start++;
//             end--;
//
//         }
//     }
//     // Function to Rotate k elements to right
//    public static void rotate (int [] numbers ,int n ,int k){
//
//        reverse( numbers,0,numbers.length-1); // reversing whole array
//        reverse( numbers,0,k-1);            // 0 to k-1 reverse
//        reverse( numbers,k,numbers.length-1);   //k to length-1 reverse
//
//    }
//    public static void main( String args[]) {
//        int numbers [] ={ 1,2,3,4,5,6,7,8} ;
//        int k=3;
//        int n= numbers.length;
//        rotate(numbers,n,k);
//        for(int i=0; i<n;i++) {
//              System.out.print(numbers[i] + " ")  ;
//
//        }
//    }
//    }


//4
//public class prac1 {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int size  = sc.nextInt();
//         String array[]= new String[size];
//         int toLenght =0;
//         for( int i=0; i<size; i++) {
//             array [i]= sc.next();
//             toLenght += array[i].length();
//         }
//         System.out.println(toLenght);
//        }
//
//    }

//4.2
//public class prac1 {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//       String str1 = "shikha";
//        String str2 = "shikha";
//        String str3 = "shikha";
//        String strfinal = str1 + " , "  + str2  +", " +str3;
//
//
//        System.out.println(strfinal);
//        System.out.println(strfinal .length());
//    }
//
//}

// Q.5
//public class prac1 {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        String result = "";
//        for(int i=0; i<str.length(); i++){
//
//            if(str.charAt(i)=='e') {
//                result += 'i';
//            } else {
//                result +=str.charAt(i);
//            }
//        }
//        System.out.println(result);
//    }
//
//}

//Q.6
//public class prac1 {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        String Email= sc.next();
//        String userName = " ";
//         for( int i=0; i<Email.length(); i++) {
//             if(Email.charAt(i)=='@') {
//                 break;
//             } else{
//                 userName += Email.charAt(i);
//             }
//         }
//        System.out.println(userName);
//    }
//}
//
//Q.6
//public class prac1 {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        String Email= sc.next();
//        String userName = " ";
//         for( int i=0; i<Email.length(); i++) {
//             if(Email.charAt(i)=='@') {
//                 break;
//             } else{
//                 userName += Email.charAt(i);
//             }
//         }
//        System.out.println(userName);
//    }
//}
// Q.7 CHECK BALANCE PARANTHESIS
//class prac1{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the string");
//        String str = sc.next();
//        char[] c1 = {'(', '{', '['};
//        char[] c2 = {')', '}', ']'};
//         int count =0;
//         for(int i=0; i<str.length(); i++) {
//             for(int j=0; j< c1.length; j++){
//                 if(str.charAt(i) == c1[j])
//                     count++;
//             }
//             for (int j=0; j<c2.length; j++){
//                 if (str.charAt(i)==c2[j]) {
//                     count--;
//                 }
//             }
//
//         }
//         if(count==0) {
//             System.out.println("balanced");
//         }
//         if(count!=0) {
//             System.out.println("not balanced");
//         }
//
//
//    }
//}

// Q.8    Reverse a string
//public class prac1 {
//    public static void main(String args[]) {
//        String myName = "Shikha";
//        String reverse = "";
//        for( int i= myName.length()-1; i>=0; i--){
//            reverse += myName.charAt(i);
//        }
//        System.out.println(reverse);
//
//      }




//// Q.8.   palendrom
//public class prac1 {
//    public static void main(String args[]) {
//        String myName = "madam";
//        String reverse = "";
//        for( int i= myName.length()-1; i>=0; i--){
//            reverse += myName.charAt(i);
//        }
//         // use if instead of print reverse
//        if(myName.equals(reverse)) {
//            System.out.println(" it is a palendrom number ");
//        }
//        else{
//            System.out.println(" it is   not palendrom number ");
//        }
//
//    }
//}

//// Q.8.1    palendrom
//public class prac1 {
//    public static void main(String args[]) {
//        String myName = "madam";
//        String reverse = "";
//        for( int i= myName.length()-1; i>=0; i--){
//            reverse += myName.charAt(i);
//        }
//        // use if instead of print reverse
//        if(myName.equals(reverse)) {
//            System.out.println(" it is a palendrom number ");
//        }
//        else{
//            System.out.println(" it is   not palendrom number ");
//        }
//
//    }
//}


// Q.9
//public class prac1 {
//    public static void main(String args[]) {
//        String s = "thisismyshikhayadav    ";
//        int[] arr = new int[127]; // size of  array depends on us
//        for( int i =0; i<s.length(); i++) {
//            arr [s.charAt(i)] = arr[s.charAt(i)] +1; // increasing the default value of that index of array by 0
//        }
//        // find maximum and minimum
//        int max =-1;
//        char maxbar = ' ' ;
//        for( int i=0; i<s.length(); i++) {
//             if(max<arr[s.charAt(i)]) {
//                   max= arr[s.charAt(i)];
//                   maxbar=s.charAt(i);
//             }
//        }
//        System.out.println("maximum repeated character is " + maxbar);
//
//        int min =100;
//        char minbar= ' ' ;
//        for( int i=0; i<s.length(); i++) {
//            if(min>arr[s.charAt(i)]) {
//                min= arr[s.charAt(i)];
//                minbar=s.charAt(i);
//            }
//        }
//        System.out.println("minimum repeated character is " + minbar );
//
//
//
//    }
//}

// Q 10
//public class prac1 {
//    public static void main(String [] args) {
//       String str= "abbccc";
//        int count;
//        // converting str = array
//        char[] ch = str.toCharArray();
//        for(int i=0; i<ch.length; i++) {
//            count=1;
//             for( int j=i+1; j<ch.length; j++) {
//                 if(ch[i]==ch[j] && ch[i]!=' ') {
//                     count++;
//                     //Set ch[j] to 0 to avoid printing visited character
//                     ch[j] = '0';
//                 }
//             }
//            //A character is considered as duplicate if count is greater than 1
//            if(count > 1 && ch[i] != '0') {
//                System.out.println(ch[i]);
//                System.out.println(count);
//            }
//        }
//
//    }
//
//}




//public class prac1 {
//    public static void main(String args[]) {
//        String str = "shikhe    ";
//        System.out.println(str.replace( 'e', 'i'));
//
//
//    }
//
//}

// Q 11.
//public class prac1 {
//    public static void main(String[] args) {
//        String myName = "shikha";
//        StringBuilder name = new StringBuilder();
//
//        for (int i = 0; i < myName.length(); i++) {
//            char ch = myName.charAt(i);
//            int index =myName.indexOf(ch , i+1);
//            // -1 means char not found
//            if(index ==-1) {
//                name.append(ch);
//            }
//        }
//        System.out.println(name);
//    }
//}



//public class prac1 {
//    public static void main(String[] args) {
//        String myName = "shikha";
//        StringBuilder name = new StringBuilder();
//
//        for (int i = 0; i < myName.length(); i++) {
//            char ch = myName.charAt(i);
//            int index =myName.indexOf(ch , i+1);
//            // -1 means char not found
//            if(index ==-1) {
//                name.append(ch);
//            }
//        }
//        System.out.println(name);
//    }
//}

//Q12
//public class prac1 {
// static boolean isPrime(int n) {
//        if (n <= 1) {
//         return false;
//        }
//        for (int i = 2; i < n; i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//
//    public static void main(String[] args) {
//        int n=1;
//       if (isPrime(n) )
//        {
//            System.out.println(" prime");
//        }
//       else
//        {
//            System.out.println(" non prime ");
//        }
//    }
//
//}



//Q13 calculator
//public class prac1 {
//    public  prac1() {
//    }
//    public int add(int a , int b) {
//        return a+b;
//    }
//    public int sub(int a , int b) {
//        return a-b;
//    }
//    public int mul(int a , int b) {
//        return a*b;
//    }
//    public int div(int a , int b) {
//        if(b==0) {
//            System.out.println("not valid");
//            return 0;
//        }
//      else{
//         return  a/b;
//        }
//    }
//
//
//
//    public static void main(String[] args) {
//        prac1 mycalcu= new prac1();
//        System.out.println(mycalcu.add(5,7));
//
//    }
//    }
//Q14.check vowel consonent in a given string
//public class prac1{
//    void findVowelOrNot(char ch) {
//        if (ch=='a' || ch =='e' ||ch=='i' || ch=='o'|| ch=='u' ) {
//            System.out.println("Entered character " +ch+ " is vowel") ;
//        }
//        else{
//            System.out.println(" is consonent");
//        }
//    }
//
//    public static void main(String[] args) {
//        prac1 Charc = new prac1();
//        Scanner sc= new Scanner(System.in);
//        char in = sc.next().charAt(0);
//        char in2;
//        in2 = Character.toLowerCase(in);
//        Charc.findVowelOrNot(in2);
//    }
//
//
//
//
//        }


// Q.15 print 5 to 1 with recursion
//public class prac1{
//    public static void printNumber(int n) {
//        if (n==0){
//            return;
//        }
//        System.out.println(n);
//        printNumber(n-1);
//    }
//
//    public static void main(String[] args) {
//        int n=5;
//        printNumber(5);
//    }
//}

// Q 16.
//public class prac1{
//    // it will take 3 parameters  -> value of n,,, base conditions  ,,sum==? where to store
//    public static  void printSum(int i , int n ,int sum)
//    {
//        // B.C.
//        if(i==n){
//            sum+=i;   // can't skip last n before return
//            System.out.println( "add  is : " + sum);
//            return;
//        }
//        // work
//         sum+=i;
//         printSum(i+1 ,n ,sum);
//    }
//
//    public static void main(String[] args) {
//     printSum(1,15,0);
//    }
//}

// Q 17. find factorial of a given number
//public class prac1{
//    public static int printFact(int n ){
//        if(n==1|| n==0){
//            return 1;
//
//        }
//        int fact_nMinusOne =   printFact(n-1);
//        int fact_n= n*fact_nMinusOne;
//        return fact_n;
//}
// public static void main(String[] args) {
//        int n=5;
//        int ans=  printFact(n);
//        System.out.println(ans);
//
//    }
//}
// Q.18
//public class prac1{
//
//    public static  void printFib(int a, int b, int n) {
//        if(n==0) {
//            return;
//        }
//       int c= a+b;
//        System.out.println(c) ;
//        printFib(b,c,n-1);
//
//    }
//
//    public static void main(String[] args) {
//      int a=0;
//      int b=1;
//        System.out.println(a );
//        System.out.println(b);
//        int n=7;
//        printFib(a,b,n-2);
//
//
//    }
//}


// Q.18.1 with iteration
//public class prac1{
//    public static void main(String[] args) {
//        int a,b,c;
//        int n=7;
//        a=0;
//        b=1;
//        for(int i=0; i<n; i++) {
//            System.out.println(a +" ");
//            c =a+b;
//            a=b;
//            b=c;
//        }
//    }
//
// }

// 19 Tower of Hanoi
//public class prac1{
//    public static void towerOfHanoi ( int n, String src, String helper, String dest) {
//        if(n==1 ) {
//            System.out.println("Transfer Disk " + n + "from : " + src +  " to " + dest);
//            return;
//        }
//        towerOfHanoi( n-1, src,dest,helper);
//        System.out.println("Transfer Disk " + n + "from" + src +  "to " + dest);
//        towerOfHanoi(n-1,helper ,src, dest);
//
//    }
//    public static void main(String[] args) {
//        int n=3;
//        towerOfHanoi(n,"SRC" , "HELPER" ,"DESTINATION");
//
//    }
//
//
//
//}

// 20. X^n
//public class prac1{
//
//    public static int calcPower(int x , int n) {
//        if(n==0) {
//            return 1;
//        }
//
//        if(x==0) {
//            return 0;
//        }
//
//        int xPowerNminusOne= calcPower(x, n-1) ;
//        int xPowerN= x*xPowerNminusOne;
//        return  xPowerN;
//    }
//
//    public static void main(String args[]){
//        int x=2, n=5;
//        int answer = calcPower(x,n);
//        System.out.println(answer);
//
//
//    }
//
//
//
//}

//21.
//public class prac1{
//    public  static int first = -1;
//    public  static int Last = -1;
//      public static void findOccurance(String str, int idx, char element) {
//          if( idx ==str.length()) {
//              System.out.println(first);
//              System.out.println(Last);
//              return;
//          }
//           char currChar= str .charAt(idx);
//         if(currChar == element) {
//             if(first == -1) {
//                 first = idx;
//             }
//             else {
//                 Last = idx;
//             }
//         }
//         findOccurance( str, idx+1 ,element );
//
//      }
//
//    public static void main(String[] args) {
//        String str = "aabbccdioa";
//        findOccurance(str, 0,'a');
//
//    }
//
// }

//  Q.22
public class prac1 {
    public static boolean  isSorted(int[] arr, int index) {
        if(index== arr.length-1) {
            return true;
        }
        if (arr[index] <arr[index+1]) {
           return   isSorted(arr , index+1);
        }
        else {
            return false;

        }
    }

    public static void main(String[] args) {
        int arr[] = {1,3,5,6,2};
        isSorted(arr,0);
        System.out.println(isSorted(arr,0));

    }
}


