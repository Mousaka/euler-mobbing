import java.util.stream.IntStream;

class LargestPalindromProduct {

   static boolean isPalindrome(final int i) {
      final String number = Integer.toString(i);
      final String reversed = new StringBuilder(number).reverse().toString();
      return number.equals(reversed);
   }

   static int start() {
      return oneToNineNineNine().map(LargestPalindromProduct::multiplyWithAll).max().orElse(0);
   }

   private static int multiplyWithAll(final int n) {
      return oneToNineNineNine().map(i -> i * n).filter(LargestPalindromProduct::isPalindrome).max().orElse(0);
   }

   private static IntStream oneToNineNineNine() {
      return IntStream.rangeClosed(1, 999);
   }
}