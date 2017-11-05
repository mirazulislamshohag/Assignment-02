package problem.pkg04;

import java.util.Scanner;

public class Problem04 {

    static Scanner hp = new Scanner(System.in);

    public static void main(String[] args) {
        int i, j, k, n;
        System.out.print("Enter Any Number You Want: ");
        n = hp.nextInt();
        for (i = n; i >= 1; i--) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (k = n; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}