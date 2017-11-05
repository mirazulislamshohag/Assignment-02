package problem.pkg12;

import java.util.Scanner;

public class Problem12 {
    
    static Scanner hp = new Scanner(System.in);
    
    public static void main(String[] args) {
        int i, n;
        System.out.print("Enter Any Number You Want: ");
        n = hp.nextInt();
        for (i = 1; i <= n; i++) {
            System.out.print(i +" ");
        }
    }
}
