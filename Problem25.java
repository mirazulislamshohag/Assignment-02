package problem.pkg25;

import java.util.Scanner;

public class Problem25 {

    public static void main(String[] args) {
        int a, i, j, k;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter How Many Numbers You Want: ");
        a = input.nextInt();
        for (i = 1; i <= a; i++) {
            for (j = a; j >= i; j--) {
                System.out.print(" ");
            }

            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
