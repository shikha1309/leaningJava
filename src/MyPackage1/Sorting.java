package MyPackage1;

//  1 . BUBBLE SORT
//  public class Sorting {
//    public  static void printArray(int arr[]) {
//        for (int i =0; i<arr.length; i++){
//            System.out.print(arr[i] + "  ,  ");
//        }
//     System.out.println();
//    }
//    public static void main( String args[]) {
//        int arr[] = { 7,9,3,1,4,22};
//
//        // bubble sort
//        for( int i=0; i< arr.length-1; i++){ // no of elements  ... and loop n-1 times ... time complexity = n^2
//            for(int j=0; j< arr.length-i-1; j++){     // indexing
//                if (arr[j] > arr[j+1]){
//                    // swap
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//            }
//        }
//
//        printArray(arr);
//    }
//


// 2. selection sort
//public class Sorting {
//    public static void printArray(int arr[]) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + "  ,  ");
//        }
//        System.out.println();
//    }
//
//    public static void main(String args[]) {
//        int arr[] = {7, 9, 3, 1, 4, 22};
//
//        // selection sort
//        for (int i = 0; i < arr.length - 1; i++) {  //outer loop  // n time  // time complexity = n^2
//            int smallest = i;
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[smallest] > arr[j]) {
//                    smallest = j;
//                }
//            }
//
//            int temp = arr[smallest];
//            arr[smallest] = arr[i];
//            arr[i] = temp;
//
//
//            printArray(arr);
//        }
//    }
//}



// 3. Insertion  sort
public class Sorting {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ,  ");
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = {7, 9, 3, 1, 4, 22};


        // Insertion Sort
        for (int i=1; i<arr.length; i++) {
            int current = arr[i];   // first element which is sorted
            int j= i-1;  // last part of sorted
            // traversing in sorted part
            while( j>=0    &&     current < arr[j] ) {
                // making place
                arr[j+1] = arr[j];
                j--;

            }
            // placement
          arr[j+1] = current;
        }
        printArray(arr);
    }
}