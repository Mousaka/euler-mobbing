import java.util.OptionalInt;
import java.util.stream.IntStream;

class SmallestMultiple {

   static OptionalInt start() {
      return IntStream.iterate(20, i -> i + 20)
              .filter(SmallestMultiple::testDivisibility)
              .findFirst();
   }

   private static boolean testDivisibility(final int n) {
      return IntStream.iterate(20, i -> i - 1).limit(19).allMatch(i -> n % i == 0);
   }
}
