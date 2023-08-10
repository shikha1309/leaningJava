
package MyPackage1;




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
public class prac1 {


     // Function to Reverse the array
     public static void reverse(int[] numbers, int start, int end) {
         while ( start<=end){
             int temp = numbers[start];
             numbers[start]=numbers[end];
             numbers[end] = temp;
             start++;
             end--;

         }
     }
     // Function to Rotate k elements to right
    public static void rotate (int [] numbers ,int n ,int k){

        reverse( numbers,0,numbers.length-1); // reversing whole array
        reverse( numbers,0,k-1);            // 0 to k-1 reverse
        reverse( numbers,k,numbers.length-1);   //k to length-1 reverse

    }
    public static void main( String args[]) {
        int numbers [] ={ 1,2,3,4,5,6,7,8} ;
        int k=3;
        int n= numbers.length;
        rotate(numbers,n,k);
        for(int i=0; i<n;i++) {
              System.out.print(numbers[i] + " ")  ;

        }
    }
    }


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



//// Q.8.1    palendrom
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