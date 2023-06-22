

import java.io.*;

class Findzero{
      public static int zero(int n){
             int count = 0;
                 while(n >= 5){
                    n /=5;
                    count +=n;
             }
             return count;
      }
      public static void main(String a[]){
             int number = 27;
             
             int res = zero(number);
             System.out.println("Number of trailing zeros in " + number + "! is: " + res);
   
      }
}
