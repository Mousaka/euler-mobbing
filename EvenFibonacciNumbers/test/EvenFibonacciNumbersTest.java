import org.junit.Test;

import static org.junit.Assert.*;

public class EvenFibonacciNumbersTest {

   @Test
   public void firstFib(){
      //assertEquals(new EvenFibonacciNumbers().evenFibonacciNumbersSum(5));
   }

   @Test
   public void sumEvenMax10(){
      assertEquals(44, new EvenFibonacciNumbers().evenFibonacciNumbersSum(100));
   }

   @Test
   public void sumEvenMax4000000(){
      System.out.print(new EvenFibonacciNumbers().evenFibonacciNumbersSum(4000000));
   }

   @Test
   public void sumTest10(){
      new EvenFibonacciNumbers().evenFibonacciNumbersSum(10);
      //assertEquals(44, new EvenFibonacciNumbers().evenFibonacciNumbersSum(100));
   }
}