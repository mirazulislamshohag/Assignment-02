package problem.pkg18;

import java.util.Scanner;

public class Problem18 {

    static Scanner hp = new Scanner(System.in);

    public static void main(String[] args) {
        int i, j, k, n;
        System.out.print("Enter Any Number You Want: ");
        n = hp.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (k = 1; k < (i * 2); k++) {
                System.out.print(k);
            }
            System.out.println();
        }

        for (i = n - 1; i >= 1; i--) {
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (k = 1; k < (i * 2); k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
