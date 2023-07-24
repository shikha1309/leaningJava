package MyPackage1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Arrays;

// Q.1 count occurance of given character in a given string
//public class StringPrac {
//    public static void main(String[] args) {
//        String str = "My name is Shikha Yadav";
//        str = str.replace(" ", "");
//        str = str.toLowerCase();
//        int Count = 0;
//        for (char c='a' ; c<='z' ; c++) {
//            Count=0;
//            for (int j = 1; j < str.length() -1; j++) {
//                if (c == str.charAt(j)) {
//                    Count++;
//
//                }
//            }
//            if(Count!=0) {
//                System.out.println("The occurance   " + c + "  is  " + Count);
//            }
//
//        }
//
//    }
//}

//Q 1.1  max and min occurance of string
//public class StringPrac {
//    public static void main(String[] args) {
//        String str = "This is my new file of String in java";
//        str = str.replace( " ", "");
//
//        int[ ] array = new int[127];
//        for(int i=0; i<str.length(); i++) {
//            array[str.charAt(i)] = array[str.charAt(i)] +1;
//        }
//
//        // find  maximum
//        int max=-1;
//        char maxbar =' ';
//        for (int i=0; i<str.length()-1; i++) {
//            if (max < array[str.charAt(i)]) {
//                max = array[str.charAt(i)];
//                maxbar = str.charAt(i);
//            }
//        }
//        System.out.println("maximum character is " + maxbar + " which  is  " +  max);
//        // find the Min
//         int min = 100;
//         char minbar =' ';
//         for (int i=0; i<str.length(); i++) {
//              if( min>array[str.charAt(i)]){
//                  min= array[str.charAt(i)] ;
//                  minbar=str.charAt(i);
//              }
//         }
//         System.out.println("minimum character is " + minbar + " which  is  " +  min);
//    }
//}

//1.2 count the frequency of string with Using HashMap
//public class StringPrac {
//    public static void getcharCount( String Name) {
//        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
//        char charArray[] = Name.toCharArray();
//        // Iterate the array using for each loop
//        for (char c : charArray) {
//            if (charMap.containsKey(c)) {
//                charMap.put(c, charMap.get(c)+1);
//            }
//            else {
//                charMap.put(c,1);
//            }
//        }
//        System.out.println(Name + " : " + charMap);
//    }
//
//    public static void main(String[] args) {
//        getcharCount("shikha");
//
//    }
//}

//Q.3
//public class StringPrac {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter First String");
//        String str1 = input.nextLine();
//        System.out.println("Enter Second String");
//        String str2 = input.nextLine();
//
//
//        if(str1.length()== str2.length()) {
//          char[] charArrayStr1= str1.toCharArray();
//          char[] charArrayStr2 = str2.toCharArray();
//
//            Arrays.sort(charArrayStr1);
//            Arrays.sort(charArrayStr2);
//
//            boolean result  = Arrays.equals(charArrayStr1, charArrayStr2);
//
//            if(result) {
//                System.out.println(" this is anagram");
//            }
//            else {
//                System.out.println(" This is not anagram");
//            }
//
//        }
//        else {
//            System.out.println(" This is not anagram");
//        }
//    }
//}

// Q.4 Giving char is digit Or N
//The Character class is a subclass of Object class and it wraps a value of the
// primitive type char in an object.
//public class StringPrac {
// public static void main(String[] args) {
//  String str = "shikha123";
//  for(int i=0; i<str.length(); i++) {
//   Boolean flag = Character.isDigit(str.charAt(i));
//    if(flag) {
//     System.out.println(str.charAt(i)  + " is number");
//    }
//    else{
//     System.out.println(str.charAt(i) + " is a letter");
//    }
//  }
//
// }
//
//}
// Q.6 delete the vowels of the string
//public class StringPrac {
//
// public static void main(String[] args) {
//  Scanner sc= new Scanner(System.in) ;
//  String s = sc.nextLine();
//  for (int i = 0; i < s.length(); i++) {
//   if (s.charAt(i) == 'a' || s.charAt(i) == 'e'
//           || s.charAt(i) == 'i' || s.charAt(i) == 'o'
//           || s.charAt(i) == 'u' || s.charAt(i) == 'A'
//           || s.charAt(i) == 'E' || s.charAt(i) == 'I'
//           || s.charAt(i) == 'O'
//           || s.charAt(i) == 'U') {
//    continue;
//   }
//
//   else {
//    System.out.print(s.charAt(i));
//   }
//  }
//
//
// }
//
//}


// Q.7 count alphabet and digit and special character in a String
public class StringPrac  {
    public static void count(String test) {
        char [] ch = test.toCharArray();
        int letter =0;
        int space = 0;
        int num=0;
        int specialChar =0;
        for( int i=0; i<test.length(); i++) {
            if(Character.isLetter(ch[i])) {
                letter++;
            }

           else if(Character.isDigit(ch[i])) {
                num++;
            }

          else  if(Character.isSpaceChar(ch[i])) {
                space++;
            }
          else {
              specialChar++;
            }

        }

        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + num);
        System.out.println("other: " + specialChar);
    }

    public static void main(String[] args) {
        String test = " my nam eiskjkd 8949 @#$adf 25.99";
        count(test);
    }

}