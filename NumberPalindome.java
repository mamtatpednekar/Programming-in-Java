public class NumberPalindrome {
  public static boolean isPalindrome(int number){
    int reverse, originalNumber = number;
    while(originalNumber != 0){
      reverse = reverse * 10 + originalNumber % 10;
      originalNumber /= 10;
    }
    return reverse == number;
  }
}
