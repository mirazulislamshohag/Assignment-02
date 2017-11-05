package problem.pkg15;

import java.util.Scanner;

public class Problem15 {

    static Scanner hp = new Scanner(System.in);

    public static void main(String[] args) {
        int i, j, k, n;
        System.out.print("Enter Any Number You Want: ");
        n = hp.nextInt();
        for (i = n; i >= 1; i--) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (k = i; k <= n; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}