package problem.pkg20;

import java.util.Scanner;

public class Problem20 {
    public static void main(String[] args) {
        int i, j, n;
        Scanner hp = new Scanner(System.in);
        System.out.print("Enter The Number of Rows You Want: ");
        n = hp.nextInt();
        for(i = 1; i <= n; i++){
            for(j = 1; j <= i; j++){
                if(i==1 || i==n || j==1||j==i){
                    System.out.print(j);
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
