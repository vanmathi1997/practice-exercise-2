   import java.util.*;
    public class PalCheck {
        public static Boolean isPalindrome(String input) {

            String temp = "";

            int length = input.length();

            for (int i = length - 1; i >= 0; i--) //condition to check the palindrome
            {
                temp = temp + input.charAt(i);
            }
            if (input.equals(temp)) {

                return true;//returning true if the input is palindrome

            } else {
                return false;//returning false if the input is not a palindrome
            }

        }
    }


