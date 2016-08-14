import java.util.OptionalInt;
import java.util.stream.IntStream;

class NthPrime {

   static OptionalInt start() {
      return IntStream.iterate(1, i -> i + 2).filter(NthPrime::isPrime).skip(10000).findFirst();
   }

   private static boolean isPrime(final int n) {
      return IntStream.rangeClosed(2, (int) Math.round(Math.sqrt(n))).allMatch(i -> n % i != 0);
   }
}
