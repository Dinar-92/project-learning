
public class Multiples {
    public static void main(String[] args) {
// Задача 1 найти сумму всех чисел, кратных 3 или 5 до 1000 по ссылке: https://projecteuler.net/problem=1

        int i;
        int sum = 0;
        for (i = 3; i < 1000; i++) {
            if ((i % 3 == 0) || (i % 5 == 0))
                sum = sum + i;
        }
        System.out.print(sum);


        }
    }

