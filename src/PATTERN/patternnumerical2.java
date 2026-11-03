package PATTERN;

public class patternnumerical2 {

    static void main(String[] args) {
         int n = 4;
         for( int row = 1 ; row<=n ;row++ ){
             for( int col = 1 ; col<=n-row ;col++ ){
                 System.out.print(" ");
             }
             for( int col = 1 ; col<=row ;col++ ){
                 System.out.print(col+" ");
             }
             int rowvlaue = row;
             int decroevlaue = row-1;
             for( int col = 1 ; col<=row-1 ;col++ ){
                 System.out.print(decroevlaue + " ");
                 decroevlaue--;
             }
             System.out.println();
         }










    }
}
