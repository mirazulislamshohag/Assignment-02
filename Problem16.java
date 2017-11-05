package problem.pkg16;

import java.util.Scanner;

public class Problem16 {

    static Scanner hp = new Scanner(System.in);

    public static void main(String[] args) {
        int i, j, k, n;
        System.out.print("Enter Any Number You Want: ");
        n = hp.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}