import java.util.*;
public class IsANumberPrime {
    public static void main(String args[]){
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();
    for(int i =0;i<t;i++){
        int no = scn.nextInt();
        Boolean flag= false;
        for(int div=2;div*div<=no;div++){
            if(no%div==0){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("not prime");
        }
        else{
            System.out.println("prime");
        }
    }
    }
}
