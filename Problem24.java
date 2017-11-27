package problem.pkg24;

import java.util.Scanner;

public class Problem24 {

    public static void main(String[] args) {
        int a, i, j;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter How Many Numbers You Want: ");
        a = input.nextInt();
        for (i = 1; i <= a; i++) {
            System.out.print(i);
        }
        for (j = a - 1; j >= 1; j--) {
            System.out.print(j);
        }
        System.out.println("");
    }
}
