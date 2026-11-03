package PATTERN;

public class pattern10 {
    static void main(String[] args) {

        int n =4 ;
        for(int row =1 ; row <= n ; row++){
            //space
            for(int col =1 ; col <= row-1 ; col++){
                System.out.print(" ");
            }
            for(int col =1 ; col <= 2*n-2*row+1  ; col++){
                if(row == n){
                    continue;
                }
                System.out.print("* ");
            }
            System.out.println();
        }

//        int n = 5;
       for (int row = 1; row <= n; row++) {
           //space part 1
           for (int col = 1; col <= n-row; col++) {
              System.out.print(" ");
          }
          for(int col = 1; col <= 2*row-1; col++){
             System.out.print("* ");
         }
         System.out.println();
     }



















 }
}
