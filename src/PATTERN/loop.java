package PATTERN;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            System.out.println(n);
//        }



//        for (int i = 1; i <=10; i++) {
//            System.out.println(n*i);

//        for (int i = n; i <= 50; i++) {
//            if (i % 2 == 0) {
//                System.out.println("even"+i);
//            }

        for (int i = 2; i<n; i++) {
            if(n % 1== 0) {
                System.out.println("prime number"+i);
            }
        }
        }

}
