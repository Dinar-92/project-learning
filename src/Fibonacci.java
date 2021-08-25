public class Fibonacci {
    public static void main(String[] args) {
        //Задача 2: Найти сумму всех четных элементов ряда Фибоначчи, которые не превышают 4 миллиона.
        int a = 0;
        int b = 1;
        int c = 0;
        int total = 0;

        do {
            if (b % 2 == 0) {
                total = total + b;
            }
            c = a + b;
            a = b;
            b = c;
        } while (b < 4000000);

        System.out.println(total);
    }
}
