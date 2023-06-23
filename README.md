

import java.io.*;

class Demo{
      public static void main(String a[]){

      System.out.println(pow(2, 0));
    }
 
           static long pow(long a, long b){
            long res =1;
              while (b > 0){
                  if((b&1) != 0){
                     res = res * a  ;
                  }
            a = a * a;
            b = b >> 1;
        }
        return res;
    }
}     
      
