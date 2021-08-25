package PrimeFactor;
//Задача 3 находим Наибольший простой делитель
import static PrimeFactor.PrimeFactor.isPrime;

public class Main {
    public static void main(String[] args) {
        long x = 600851475143L;

        long largestFactor = 1;
        long divider = 1;
        while (divider * divider < x) {
            if (x % divider == 0 && divider > largestFactor) {
                if (isPrime(divider)) {
                    largestFactor = divider;
                }
            }
            divider++;
        }
        System.out.println(largestFactor);
    }
}
