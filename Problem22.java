package problem.pkg22;

import java.util.Scanner;

public class Problem22 {

    public static void main(String[] args) {
       int a , i, j;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter How Many Number of Lines You Want: ");
        a = input.nextInt();
        for(i=1; i<=a;i++){
            for(j=a; j>=i;j--){
                System.out.print(" ");
            }
            if(i==1 || i==a){
                for(j=1; j<=(i*2)-1;j++){
                    System.out.print(j);
                }
            }else{
                System.out.print(1);
                for(j=1;j<=(i*2)-3;j++){
                    System.out.print(" ");
                }
                System.out.print(j+1);
            }
            System.out.println("");
        }    
    }
}
