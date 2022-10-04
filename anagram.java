import java.util.Arrays;
import java.util.Scanner;

class anagram {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first String: ");
    String str1 = input.nextLine();
    System.out.print("Enter second String: ");
    String str2 = input.nextLine();

   
    if(str1.length() == str2.length()) {

      char[] Array1 = str1.toCharArray();
      char[] Array2 = str2.toCharArray();
      Arrays.sort(Array1);
      Arrays.sort(Array2);

      boolean result = Arrays.equals(Array1,Array2);

      if(result) {
        System.out.println(str1 + " and " + str2 + " are anagram.");
      }
      else {
        System.out.println(str1 + " and " + str2 + " are not anagram.");
      }
    }
    else {
      System.out.println(str1 + " and " + str2 + " are not anagram.");
    }

  }
}
