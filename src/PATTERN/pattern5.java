package PATTERN;

import java.util.Scanner;

public class pattern5 {
    static void main(String[] args) {
       //pyramid pattern
//        int n = 5;
//       for (int row = 1; row <= n; row++) {
//           //space part 1
//           for (int col = 1; col <= n-row; col++) {
//               System.out.print(" ");
//           }
//           for(int col = 1; col <= 2*row-1; col++){
//               System.out.print("*");
//           }
//           System.out.println();
//       }
  // inverse pyramid
       int n =4 ;
       for(int row =1 ; row <= n ; row++){
           //space
           for(int col =1 ; col <= row-1 ; col++){
               System.out.print(" ");
           }
           for(int col =1 ; col <= 2*n-2*row+1  ; col++){
               System.out.print("*");
           }
           System.out.println();
       }






    }
}
