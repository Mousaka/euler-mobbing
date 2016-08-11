public class LargestPalindromProduct {



   public static int largestPalindromeProduct(int factorDigits){
      int maxProduct = (int)Math.pow((double)max(factorDigits), 2.0);
      for(int i=maxProduct; i>0; i--){
         if(isPalindrome(i) && isProductOfTwoFactors(i, factorDigits)){
            System.out.println("pali: "+i);
         }
      }
      return 0;
   }

   public static boolean isProductOfTwoFactors(final int n, final int factorDigits) {
      int max = max(factorDigits);
      int min = min(factorDigits);


      return (n%min == 0 && n/min >= min) || (n%max == 0 && n/max >= min);
   }

   private static int min(final int factorDigits) {
      StringBuilder zeros = new StringBuilder("1");
      for (int i = 1; i < factorDigits; i++) {
         zeros.append("0");
      }
      return Integer.parseInt(zeros.toString());
   }

   private static int max(final int productDigits) {
      StringBuilder nines = new StringBuilder();
      for (int i = 0; i < productDigits; i++) {
         nines.append("9");
      }
      int maxFactor = Integer.parseInt(nines.toString());
      return maxFactor;
   }

   public static boolean isPalindrome(final int i) {
      final String number = Integer.toString(i);
      final String reversed = new StringBuilder(number).reverse().toString();
      return number.equals(reversed);
   }
}
