import java.util.*;

public class practice_temp {
    public static void  CountVowAndConsonent( String str , char ch , int CountV, int CountC){
        str = str .toLowerCase();
        str= str.replace(" ", "");
        if(ch=='a'|| ch=='e'||  ch=='i'||  ch=='o' ||ch=='u')  {
            CountC++;
            System.out.println("vowel");
        }
        else{
            CountV++;
            System.out.println("consonent");
        }
    }
    public static void main(String[] args) {

    }
}