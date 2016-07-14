import java.util.ArrayList;
import java.util.stream.IntStream;

public class EvenFibonacciNumbers {

   //F(0), F(1) = 1
   //F(n) = F(n-1) + F(n-2)

   public long evenFibonacciNumbersSum(int max){
      long sum = 0;
      int f_n_minus_1 = 1;
      int f_n_minus_2 = 1;
      int fn = 0;
      for (int i = 3; true; i++){
         fn = f_n_minus_1 + f_n_minus_2;
         if (fn > max) {
            break;
         }
         if(fn % 2== 0){
            sum += fn;
         }
         f_n_minus_2 = f_n_minus_1;
         f_n_minus_1 = fn;
         System.err.println(fn);
      }
      return sum;

   }


}
