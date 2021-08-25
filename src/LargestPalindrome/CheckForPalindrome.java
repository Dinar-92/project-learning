package LargestPalindrome;

//проверяем на палиндром (взял из интернета)
public class CheckForPalindrome {
    public boolean isPalindrome(String s) {
        if (s.length() % 2 != 0) {
            s = s.substring(0, s.length() / 2) + s.substring((s.length() / 2) + 1);
        }

        return new StringBuffer(s.substring(0, s.length() / 2)).
                reverse().toString().equals(s.substring(s.length() / 2));
    }
}
