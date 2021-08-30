package EulerTwelve;

import static EulerTwelve.Divisors.getNumberOfDivisors;

public class Twelve {
    public static void main(String[] args) {
        int i = 1;
        int x = 2;
        boolean found = false;
        while (!found) {
            if (getNumberOfDivisors(i) > 500) {
                System.out.println(i);
                found = true;
            } else {
                i += x;
                x++;
            }
        }
    }
}
