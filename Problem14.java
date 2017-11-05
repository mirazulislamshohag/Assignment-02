package problem.pkg14;

import java.util.Scanner;

public class Problem14 {
    static Scanner hp = new Scanner (System.in);
    public static void main(String[] args) {
        int i, j, n;
        System.out.print("Enter Any Number you Want: ");
        n = hp.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1;  j<= i; j++) {
                System.out.print(j +" ");
            }
            System.out.println("");
        }
    }
}
