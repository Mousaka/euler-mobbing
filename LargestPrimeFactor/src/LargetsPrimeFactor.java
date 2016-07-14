public class LargetsPrimeFactor {

/*
   The prime factors of 13195 are 5, 7, 13 and 29.

   What is the largest prime factor of the number 600851475143 ?
 */

   public static long getLargestPrimeFactor(long value){
      final long root = Math.round(Math.sqrt(value));
      for(long i = root; i > 0; i--) {
         if (value % i == 0 && isPrime(i)) {
            return i;
         }
      }
      return 0;
   }

   public static boolean isPrime(long value) {
      if(value == 2) {
         return true;
      }
      long squareRoot = (long)Math.floor(Math.sqrt(value));
      long largestPrimeFactor = squareRoot;
      for (long i = 2; i <= squareRoot; i++){
         if (value % i == 0){
            return false;
         }
      }
      return true;
   }

}
