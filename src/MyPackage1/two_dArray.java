package MyPackage1;
import java.util.*;

public class two_dArray {
//  1.  public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int rows = sc.nextInt();
//        int column = sc.nextInt();
//         int [][] sampleOfTwoDArray = new  int [rows] [column];
//
//         // input  m*n  ,,,i==m
//        for(int i=0; i<rows; i++) {
//            for( int j=0; j<column; j++  ){
//                sampleOfTwoDArray [i][j] =sc.nextInt();
//            }
//        }
//        int x = sc.nextInt();
//        // output me jo revert hoga
//        for (int i=0; i<rows; i++){
//            for(int j=0; j<column; j++ ){
//                // compare with x
//                if(sampleOfTwoDArray[i][j] == x){
//                    System.out.println("x found at locations ("  +  i  +  "  ,  "  +  j + ")  "   );
//
//                }
//
//            }
//            System.out.println();
//        }
//    }
//   2   public static void main(String args[]){
//          Scanner sc = new Scanner(System.in);
//          int n = sc.nextInt();
//          int m = sc.nextInt();
//
//          int matrix [][]  = new int[n][m];
//
//          // for input
//          for(   int i=0; i<n; i++){
//              for (int j=0; j<m; j++){
//                  matrix [i][j] = sc.nextInt();
//              }
//          }
//          System.out.println("The transpose is : ");
//          // to transpose
//
//          for( int j=0; j<m; j++){
//              for (int i=0; i<n; i++){
//                  System.out.print(matrix[i][j] + "  ");
//              }
//               System.out.println();
//
//          }
// Q. 3 when matrix is given
// public static void main(String args[]){
//       int rows , cols;
//
//
//    //Initialize matrix a
//    int a[][] = {
//            {1, 2, 3},
//            {4, 5, 6},
//            {7, 8, 9}
//    };
//
//    // Calculates number of rows and columns present in given matrix
//    rows = a.length;
//    cols = a[0].length;
//
//    //Declare array t with reverse dimensions
//    int t[][] = new int[cols][rows];
//
//    //Calculates transpose of given matrix
//    for(int i = 0; i < cols; i++){
//        for(int j = 0; j < rows; j++){
//            //Converts the row of original matrix into column of transposed matrix
//            t[i][j] = a[j][i];
//        }
//    }
//    System.out.println("Transpose of given matrix: ");
//    for(int i = 0; i < cols; i++){
//        for(int j = 0; j < rows; j++){
//            System.out.print(t[i][j] + " ");
//        }
//        System.out.println();
//    }
public static void main(String args[]){
    int rows , cols;


    //Initialize matrix a
    int a[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    //Calculates number of rows and columns present in given matrix
    rows = a.length;
    cols = a[0].length;

    //Declare array t with reverse dimensions
    int t[][] = new int[cols][rows];

    //Calculates transpose of given matrix
    for(int i = 0; i < cols; i++){
        for(int j = 0; j < rows; j++){
            //Converts the row of original matrix into column of transposed matrix
            t[i][j] = a[j][i];
        }
    }
    System.out.println("Transpose of given matrix: ");
    for(int i = 0; i < cols; i++){
        for(int j = 0; j < rows; j++){
            System.out.print(t[i][j] + " ");
        }
        System.out.println();
    }




}



}



