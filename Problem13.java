package problem.pkg13;

import java.util.Scanner;

public class Problem13 {
    static Scanner hp = new Scanner(System.in);
    public static void main(String[] args) {
       int i, j, n, m;
        System.out.print("Enter the number of  rows you want: ");
        n = hp.nextInt();
        System.out.print("Enter the number of columns you want: ");
        m = hp.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= m; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    } 
}
