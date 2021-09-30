import java.util.Scanner;

public class PrintFibonaciiNumbersTillN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int first = 0;
        int second =1;
        if(1<=n){
            System.out.println(0);
        }
        if(2<=n){
            System.out.println(1);
        }
        for(int i=2;i<n;i++){
            int temp = first;
            first = second;
            second = first + temp;

            System.out.println(second);

        }
    }
}
