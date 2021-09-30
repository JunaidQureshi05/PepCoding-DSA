import java.util.*;
public class PythagoreanTriplets {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        int a,b,c;
        boolean result=false;
        a= scn.nextInt();
        b= scn.nextInt();
        c= scn.nextInt();
        int max =a;
        if(b>=max){
            max=b;
        }
        if(c>=max){
            max=c;
        }
        if(max==a){
             result = ((b*b)+(c*c)==(a*a));
        }
         if(max==b){
             result = ((a*a)+(c*c)==(b*b));
        }
         if(max==c){
             result = ((b*b)+(a*a)==(c*c));
        }
        System.out.println(result);
    }
}
