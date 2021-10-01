import java.util.Scanner;

public class InverseOfANumber{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int pow = 1;
        int inverted=0;
        while(n>0){
            int digit = n%10;
            inverted += pow*Math.pow(10,digit-1);  
            pow++;
            n/=10;
        }
        System.out.println(inverted);
    }
}