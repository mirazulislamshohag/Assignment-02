package problem.pkg02;

import java.util.Scanner;

public class Problem02 {
    static Scanner hp = new Scanner(System.in);
    public static void main(String[] args) {
       int i, j, n, m;
        System.out.print("Enter Any Number You Want: ");
        n = hp.nextInt();
        System.out.print("Enter the number of columns");
        m = hp.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= m; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
