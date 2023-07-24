import java.util.*;
import java.util.HashSet;
//Q.1
//public class HmapQuestions {
//    //step 1 = create hash map
// static void majorityElement(int num[] ,int n) {
//      HashMap<Integer, Integer> mapme = new HashMap<>();
//      //step2= iterate and store K V   ,count frequencies
//
//        for(int i=0 ; i<n; i++)
//        {
//            if(mapme.containsKey(num[i])) {
//                //true update by 1
//                mapme.put(num[i], mapme.get(num[i])+1);
//            }
//            else {//false
//                mapme.put(num[i],1);
//            }
//        }
//        //step 3= for each or enhanced for loop to compare frequency value
//        for(Map.Entry<Integer,Integer> entry: mapme.entrySet() )  {
//            System.out.println(entry.getKey()+"  occurs " + entry.getValue());
//
//        }
//    }
//    public static void main(String[] args)
//    {
//        int[] num = { 1,3,2,5,1,3,1,5,1 ,1};
//        int n= num.length;
//        majorityElement(num, n);
//
//    }
//}


// Q.1.1 by Brute force  On^2
//public class HmapQuestions {
//    public static void main(String[] args) {
//        int[] arr = {1, 3, 2, 5, 1, 3, 1, 5, 1, 1};
//        int freq[] = new int[arr.length];
//        int visited = -1; //will not store
//        for (int i = 0; i < arr.length; i++) {
//            int count = 1;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    count++;
//                    //To avoid counting same element again
//                    freq[j] = visited;
//                }
//            }
//            if (freq[i] != visited) {
//                freq[i] = count;
//
//            }
//        }
//        for (int i=0; i< freq.length;i++) {
//            if(freq[i]!=visited) {
//                System.out.println( arr[i] + " times    " + freq[i]);
//            }
//        }
//    }
//}

//// Q2 unoion or array by using set
//public class HmapQuestions {
//    public static int union(int arr1[] , int arr2[])
//    {
//        HashSet<Integer> setme = new HashSet<>();
//        // for arr1
//        for(int i=0; i<arr1.length; i++)
//        {
//            setme.add(arr1[i]);
//        }
//        for (int j=0; j< arr2.length; j++) {
//            setme.add(arr2[j]);
//
//        }
//        // for each loop
//        for(Integer strme :setme) {
//            System.out.print(strme + " ,");
//        }
//        return setme.size();
//
//
//    }
//
//    public static void main(String[] args) {
//        int arr1[] ={7,3,9};
//        int arr2[] = {6,4,3,2,5,9};
//        System.out.print(" this is the size  " + union(arr1,arr2));
//
//
//
//
//
//
//    }
//
//}


// Q3 Intersection or array by using set
//public class HmapQuestions {
//    public static int union(int arr1[], int arr2[]) {
//        HashSet<Integer> setme = new HashSet<>();
//        // for arr1
//        for (int i = 0; i < arr1.length; i++) {
//            setme.add(arr1[i]);
//        }
//        for (int j = 0; j < arr2.length; j++) {
//            setme.add(arr2[j]);
//
//        }
//        return setme.size();
//    }
//
//    public static int intersection(int arr1[], int arr2[]) {
//        HashSet<Integer> set = new HashSet<>();
//        int count = 0;
//        //arr1 element will go on hash set which will be unique
//        for (int i = 0; i < arr1.length; i++) {
//            set.add(arr1[i]); // will be unique element
//        }
//        // loop in array 2 , and check will exist on set or not
//        for (int j = 0; j < arr2.length; j++){
//            if (set.contains(arr2[j])) {
//                count++;
//                System.out.println(arr2[j]);
//
//               // useless set.remove(arr2[j]);
//
//            }
//    }
//return count;
//
//}
//
//    public static void main(String[] args) {
//        int arr1[] ={7,3,9};
//        int arr2[] = {6,4,3,2,5,9};
//        System.out.print(" this is the size  " + intersection(arr1,arr2));
//
//
//
//
//  }
//
//}

// Q.4   Find Itinerary form tickets // error is there
//public class HmapQuestions {
//    //find start point
//    // find reverse
//    public static String getStart(HashMap< String ,String> tick) {
//        HashMap <String ,String >  reverse_tickets = new HashMap<>();
//        for(String key: tick.keySet()) {
//            // key will key ; val will be tick.get(key)
//            // value will be key and key will be value
//            reverse_tickets.put(tick.get(key) ,key);
//        }
//        // Loop in original map
//        for(String key:tick.keySet())
//        {
//            if(!reverse_tickets .containsKey(key)) {
//                 return key;
//            }
//        }
//              return null;
//    }
//    public static void main(String[] args) {
//        HashMap <String ,String >  tickets = new HashMap<>();
//        tickets.put(" Chennai" , "bangaluru") ;
//        tickets.put(" Mumbai" , "Delhi") ;
//        tickets.put(" Goa " , "Chennai") ;
//        tickets.put("Delhi" , "Goa") ;
//        String start = getStart(tickets) ;
//          while (tickets.containsKey(start)) {
//              System.out.print(start + " ->");
//              start = tickets.get(start);
//          }
//        System.out.println(start);
//
//    }



