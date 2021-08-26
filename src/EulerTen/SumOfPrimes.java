package EulerTen;

import static PrimeFactor.PrimeFactor.isPrime;

public class SumOfPrimes {
    public static void main(String[] args) {
        long sum = 2;
        for (int i = 3; i < 2000000; i += 2) {
            if (isPrime(i))
                sum += i;
        }

        System.out.println("Sum: " + sum);
    }
}
