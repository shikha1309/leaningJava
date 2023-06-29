

public class Pattern {
    public static void main(String args[]) {
        int n = 4;
        int number = 1;
//        int m = 6;

//  Q.1   Printing Solid Rectangle
// outer for Loop
//        for( int i = 1; i<=n; i++){
//            // inner loop
//            for( int j = 1; j<=m; j++){
//                System.out.print("  *  ");  // PRINTING IN A HORIZONTAL LINE
//            }
//            System.out.println();  // get a new line
//        }


 // Q.3    Printing a half Pyramid
        // outer Loop
//        for( int i =1 ; i<=n; i++){
//            // inner Loop
//            for ( int j= 1; j<=i; j++){
//                System.out.print("#");
//            }
//            System.out.println( );
//        }

        // Q.4   Printing a half Pyramid ka invert form
        // outer Loop
//        for( int i =n ; i>=1; i--){
//            // inner Loop
//            for ( int j= 1; j<=i; j++){
//                System.out.print("#");
//            }
//            System.out.println( );
//        }

// Q. 5 printing half of pyramid of 180 rotation
        // outer Loop
//        for(int i=1; i<=n; i++){
//            // inner Loop Space printing
//            for( int j=1; j<=n-i; j++) {
//                System.out.print("");
//            }
//
//            // inner Loop for star printing
//            for( int j=1; j<=i; j++){
//                System.out.print("@");
//            }
//            System.out.println();
//        }

//   Q.6
//        outer Loop
//        for(int i=1; i<=n; i++){
//
//            for( int j=1; j<=i; j++) {
//                System.out.print(j+ " ");
//            }
//
//
//               System.out.println();
//        }

// Q.7
//      //  outer Loop
//        for(int i=1; i<=n; i++){
//    // Inner Loop
//            for( int j=1; j<=n-i+1; j++) {
//                System.out.print(j+ " ");
//            }
//
//            System.out.println();
//        }



// Q.8
//        outer Loop
//        for(int i=1; i<=n; i++){
//            // Inner Loop
//            for( int j=1; j<=i; j++) {
//                System.out.print(number+ " ");
//                number ++;
//            }
//
//            System.out.println();
//        }

// Q. 9
        // Outer Loop
//        for(int i=1; i<=n; i++){
//            for( int j =1; j<=i; j++){
//                int sum =i+j;
//             if(sum % 2==0) {
//                 System.out.print("1 ");
//             } else {
//                 System.out.print("0 ");
//             }
//            }
//            System.out.println();
//
//        }


// Q.10  Butterfly pattern
        // Outer Loop
//         upper half
//        for( int i=1; i<=n; i++){
//            // first part
//            for(int j=1; j<=i; j++){
//                System.out.print("#");
//            }
//            // Spaces
//            int spaces =2*(n-i);
//            for ( int j=1; j<=spaces; j++){
//                System.out.print(" ");
//            }
//            // for 2 nd part
//            for (int j=1; j<=i; j++){
//                System.out.print("#");
//
//            }
//            System.out.println();
//
//        }
////            Code for Lower half
//
//        for( int i=n; i>=1; i--){
//            // first part
//            for(int j=1; j<=i; j++){
//                System.out.print("#");
//            }
//            // Spaces
//            int spaces =2*(n-i);
//            for ( int j=1; j<=spaces; j++){
//                System.out.print(" ");
//            }
//            // for 2 nd part
//            for (int j=1; j<=i; j++){
//                System.out.print("#");
//
//            }
//            System.out.println();
//
//        }


// Q. 11.

//for(int i=1; i<=n; i++) {
//    // Spaces
//    for(int j=1; j<=n-i; j++){
//        System.out.print(" ");
//    }
////stars
//    for (int j=1; j<=5; j++){
//        System.out.print("#");
//    }
//    System.out.println();
//}


// Q.12

//        for(int i=1; i<=n; i++) {
//            // Spaces
//            for(int j=1; j<=n-i; j++){
//                System.out.print(" ");
//            }
////stars  // printing Row number , row number times,
//            for (int j=1; j<=i; j++){
//                System.out.print(i+ " ");
//            }
//            System.out.println();
//        }
// Q.13

//


        //  Q.14

        for( int i=1; i<=n; i++) {  // for upper half

            for (int j = 1; j <= n - i; j++) {         // spaces
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {        // stars
                System.out.print("*");
            }
            System.out.println();
        }


            for( int i=n; i>=1  ; i--){  // for lower half reverse the code

                for (int j=1; j<=n-i; j++){  // spaces
                    System.out.print(" ");
                }

                for( int j=1; j<=2*i-1; j++){  // stars
                    System.out.print("*");
                }
                System.out.println();  // new line

        }
<<<<<<< HEAD







=======
// printing AAA
//        class Main {
//            public static void main(String[] args) {
//                char  ch ='A';
//                for( int i=1; i<=5; i++){
//                    for( int j=1; j<=i; j++) {
//                        System.out.print (ch + " ");
//
//                    }
//                    System.out.println();
//                }
//
//
//            }
//        }


//       a
//      bb
//      ccc
//         class Main {
//   public static void main(String[] args) {
//     char  ch ='A';
//     for( int i=1; i<=5; i++){
//          for( int j=1; j<=i; j++) {
//            System.out.print (ch + " ");
//
//          }
//           System.out.println();
//       ch++;
//     }
//
//
//   }
// }
>>>>>>> 2e7a13d (practice)




















    }
}