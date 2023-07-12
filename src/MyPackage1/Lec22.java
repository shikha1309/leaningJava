package MyPackage1;
// Q.1 Merge sort
// First Divide
//public class Lec22 {
//    public static void conquer(  int arr[], int starti, int endi,int mid) {
//        // just creat a merge array
//        int merged[] = new int[endi - starti + 1];
//        int idx1 = starti; //tracking first array
//        int idx2 = mid + 1; // tracking second array
//        int x = 0; // tracking merged array
//        // SORTING THE ELEMENT
//        while (idx1 <= mid && idx2 <= endi) {
//            if (arr[idx1] <= arr[idx2]) {
//                merged[x] = arr[idx1]; //  in mearged array x put first element of first sorted array
//                x++;
//                idx1++;
//            }
//            // put element of  second array
//            else {
//                merged[x] = arr[idx2];
//                x++;
//                idx2++;
//            }
//        }
//        // for last rest element which are already sorted these two while loop
//        while (idx1 <=mid) {
//            merged[x] = arr[idx1]; // coping the element
//            x++;
//            idx1++;
//
//        }
//
//        while (idx2 <=endi) {
//            merged[x] = arr[idx2];
//            x++;
//            idx2++;
//        }
//        // copy merged element in original element
//        for(int i=0, j =starti; i<merged.length; i++,j++){
//        arr[j ] =merged[i];
//        }
//    }
//    public static void divide ( int arr[], int starti, int endi){
//        if (starti >= endi) {
//            return;
//        }
//        int mid = (starti + endi) / 2;
//        // there will be two steps for dividing the array
//        divide(arr, starti, mid);
//        divide(arr, mid + 1, endi);
//        conquer(arr, starti, endi, mid);
//    }
//    public static void main (String args[]) {
//        int arr[] ={6,3,9,5,2,8} ;
//        int  n = arr.length;
//        divide(arr,0,n-1);
//        for(int i=0; i<n;i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//
//    }
//
//}
//  // Quick sort
public class Lec22 {
    // this method will find the pivot elemnt
    private static int partition(int[] arr, int low, int high) {
        // find the pivot element which last element of array
        int pivot = arr[high];
        int i = low - 1; // used to find how mant element come in array which less than to pivot
        // low-1 means that no one element is less than pivot
        for (int j = low; j < high ; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++; // for pivot
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        return i; // pivot index
    }
    public static void quicksort(int arr[], int low, int high) {
        if (low < high) {
            // find pivot // place end element as its right place
            int pivotIndex = partition(arr, low, high);
            quicksort(arr, low, pivotIndex-1);
            quicksort(arr, pivotIndex + 1, high);
        }
    }
    public static void main(String args[]) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        quicksort(arr, 0 ,n-1);

//print
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " , ");

        }
    }

}






















