package EulerTen;

public class FindPrime {
    private static boolean isPrime(int i) {
        for (int j = 3; j * j <= i; j += 2) {
            if (i % j == 0)
                return false;
        }
        return true;
    }
}
