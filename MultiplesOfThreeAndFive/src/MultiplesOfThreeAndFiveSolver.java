import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class MultiplesOfThreeAndFiveSolver {

   public long sumOfMultiplesOld(int max){
      long sum = 0;
      for(int i = 3; i<max; i++){
         if(i % 3 == 0 || i % 5 == 0)
         sum += i;
      }
      return sum;
   }

   public long sumOfMultiples(int max) {
    // return LongStream.range(3, max).reduce(0,  (sum, i) -> (i % 3 == 0 || i % 5 == 0) ? sum + i : sum);
      return LongStream.range(3,max).filter(this::divisibleBy5or3).sum();
   }

   public boolean divisibleBy5or3(long n){
      return n % 3 == 0 || n % 5 == 0;
   }

   public static void main(final String args[]){
      System.out.println(new MultiplesOfThreeAndFiveSolver().sumOfMultiples(10));
   }
}
