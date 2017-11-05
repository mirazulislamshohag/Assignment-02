package problem.pkg01;

import java.util.Scanner;

public class Problem01 {

    static Scanner hp = new Scanner(System.in);

    public static void main(String[] args) {
        int i, n;
        System.out.print("Enter Any Number You Want: ");
        n = hp.nextInt();
        for (i = 1; i <= n; i++) {
            System.out.print("* ");
        }
    }
}