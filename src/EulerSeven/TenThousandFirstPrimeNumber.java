package EulerSeven;

import static PrimeFactor.PrimeFactor.isPrime; // этот класс я сделал ранее для 10 задачи

//// Ищем 10001 простое число
public class TenThousandFirstPrimeNumber {
    public static void main(String[] args) {
        long number = 2L;
        long primesCount = 0;
        while (primesCount <= 10001) {
            if (isPrime(number)) {
                primesCount++;
                if (primesCount == 10001) {
                    System.out.println(number);
                }
            }
            number++;
        }
    }
}

