package MyPackage1;
//Q.3
//public class ArrayPract  {
//    static void segregate0and1 (int arr[] , int n) {
//        int count = 0; // counts the no of zeros in arr
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == 0) {
//                count++;
//            }
//        }
//                // loop fills the arr with 0 until count
//                for (int i = 0; i < count; i++)    {
//                    arr[i] =0;
//                    // loop fills remaining arr space with 1
//                }
//               for (int i = count; i<n; i++)    {
//                   arr[i] =1;
//        }
//    }
//    public static void main(String [ ] args) {
//        int arr[]={0, 1,0,1,1,1,0,1,1};
//        int n= arr.length;
//        segregate0and1(arr ,n);
//        //for printing  the output
//        System.out.print("Array after segregation is ");
//        for (int i = 0; i < n; i++)
//            System.out.print(arr[i] + " ");
//    }
//    }


// Q.4
//public class ArrayPract  {
//    static void reverse( int arr[], int n) {
//        int[] arr2 = new int[n]; // this is a temp array
//        int j = n;
//        for( int i=0; i<n; i++) {
//            arr2[j-1] =arr[i];
//            j=j-1;
//        }
//        // for printing the output
//        for (int k=0; k<n; k++) {
//            System.out.print(arr2[k] + " ");
//        }
//
//    }
//    public static void main(String [ ] args) {
//        int [] arr ={10,20,30,40,50};
//
//
//        reverse(arr ,arr.length);
//
//
//    }
//}



// Q.4 .1
//public class ArrayPract  {
//    static void reverseWithoutTempArray( int arr[]) {
//        int i=0 , j=arr.length-1;
//      for( i=0; i<arr.length/2; i++, j--)    {
//          int temp = arr[i];
//          arr[i]=arr[j];
//          arr[j] =temp;
//
//      }
//      for(i=0; i<arr.length;i++) {
//          System.out.print(arr[i] + " ");
//      }
//    }
//    public static void main(String args[]) {
//        int arr[] = { 12,22,45,76,876};
//        reverseWithoutTempArray(arr);
//
//    }
//}

// Q.6
//public class ArrayPract  {
//    static void findTarget( int arr[], int target) {
//        for(int i=0; i<arr.length-1; i++) {
//            for( int j= i+1; j< arr.length;j++) {
//                if(arr[i]+arr[j]==target) {
//                    System.out.print(" target fount at " + i +" ," + j);
//                }
//            }
//        }
//
//    }
//
//    public static void main(String args[]) {
//        int arr[] = { 12,22,45,76,876};
//        findTarget(arr, 34);
//
//
//    }
//}


// Q. 8.1

public class ArrayPract  {
    static void Rotatetoright( int arr[] , int n, int k ){
        if(n==0)
            return;
           k= k % n; // if k is less than k = k ,,,, greater than k>n  then k will store the remainder of that
          if (k>n)
            return;
          int[] temp =new int[k];
          for(int i=n-k;  i<n; i++) {
              temp[i-n+k] = arr[i];
          }

    }

    public static void main(String args[]) {


    }
}











