package problem.pkg07;

import java.util.Scanner;

public class Problem07 {

    public static void main(String[] args) {
        int i, j, n, m;
        Scanner hp = new Scanner(System.in);
        System.out.print("Enter the number of rows you want: ");
        n = hp.nextInt();
        System.out.print("Enter the number of columns you want: ");
        m = hp.nextInt();

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= m; j++) {
                if (i != 1 && i != n) {
                    if (j == 1 || j == m) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
