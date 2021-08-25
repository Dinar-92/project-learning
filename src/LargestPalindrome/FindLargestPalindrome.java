package LargestPalindrome;

//ищем самый большой палиндром перемножая все по очереди начиная с 999 и дальше вниз

public class FindLargestPalindrome {
    public static void main(String[] args) {
        CheckForPalindrome e = new CheckForPalindrome();
        long biggest = 0;

        int a = 999, b = 999;
        for (int bb = b; bb > 0; bb--) {
            for (int aa = a; aa > 0; aa--) {
//                добавляем проверку на палиндром
                if (e.isPalindrome(new Long(aa * bb).toString())) {
                    if (aa * bb > biggest) {
                        biggest = aa * bb;
                    }
                }
            }
        }
        System.out.println(biggest);
    }
}
