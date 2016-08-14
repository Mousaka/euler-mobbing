import java.util.stream.LongStream;

class SumOfPrimes {

   static long sumOfPrimes(final int limit) {
      return LongStream.range(2, limit)
              .filter(SumOfPrimes::isPrime)
              .sum();
   }

   private static boolean isPrime(final long n) {
      return LongStream.rangeClosed(2, Math.round(Math.sqrt(n))).allMatch(i -> n % i != 0);
   }
}
