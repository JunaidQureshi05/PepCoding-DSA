import java.util.*;
public class PrintAllPrimeTillN {
    public static void main(String args[]){
      int low,high;
      Scanner scn = new Scanner(System.in);
      low = scn.nextInt();
      high = scn.nextInt();
      for(int i=low;i<=high;i++){
          int no = i;
          Boolean flag= false;
          for(int div=2;div*div<=no;div++){
              if(no%div==0){
                  flag=true;
                  break;
              }
          }
          if(!flag){
              System.out.println(no);
          }
      }
    }
}
