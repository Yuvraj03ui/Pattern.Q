package PATTERN;

public class patternnumerical3 {
    static void main(String[] args) {

         int n = 4;


          for (int row= 1 ; row<=n ; row++ ){

              for(int col = 1 ; col<=n-row ; col++ ){
                  System.out.print("  ");
              }
              for(int col = 1 ; col<=row ; col++ ){
                  int a = col;
                  int b = 'A'-1;
                  int ans = a+b;
                  char finalAns = (char)ans;
                  System.out.print(finalAns + " ");
              }
              char topoint = (char)(row + 'A'-2);
              for(int col = 1 ; col<=row-1 ; col++ ){

                  System.out.print(topoint + " ");
                  topoint--;
              }

              System.out.println();
          }




















    }
}
