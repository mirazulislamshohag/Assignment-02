package problem.pkg11;

import java.util.Scanner;

public class Problem11 {

    public static void main(String[] args) {
        int a, i, j;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter How Many Number of Lines You Want:  ");
        a = input.nextInt();
        for (i = 1; i <= a; i++) {
            for (j = a; j >= i; j--) {
                System.out.print(" ");
            }
            if (i == 1) {
                for (j = 1; j <= (i * 2) - 1; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (j = 1; j <= (i * 2) - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println("");
        }
        for (i = a - 1; i >= 1; i--) {
            for (j = i; j <= a; j++) {
                System.out.print(" ");
            }
            if (i == 1) {
                for (j = 1; j <= (i * 2) - 1; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("*");
                for (j = 1; j <= (i * 2) - 3; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
