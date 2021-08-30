package EulerTwelve;

public class Divisors {

    public static long getNumberOfDivisors(long n) {
        int ret = 1;
        long factor = 2;
        while (factor <= n) {
            int temp = 1;
            while (n % factor == 0) {
                n /= factor;
                temp++;
            }
            ret *= temp;
            factor++;
        }
        return ret;
    }
}
