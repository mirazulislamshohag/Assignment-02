package problem.pkg10;

import java.util.Scanner;

public class Problem10 {

    public static void main(String[] args) {
        int i, j, n;
        Scanner hp = new Scanner(System.in);
        System.out.print("Enter The Number of Rows: ");
        n = hp.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= (2 * i - 1); j++) {

                if (i == n || j == 1 || j == (2 * i - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
