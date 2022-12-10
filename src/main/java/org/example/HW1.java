package org.example;


//Даны два целых числа x и n, напишите функцию для вычисления x^n
// решение 1 - рекурсивно O(n)
// решение 2 - улучшить решение 1 до O(lon n)
//
//
public class HW1 {
    public static void main(String[] args) {

        //System.out.println(getElement());
        System.out.println(multiplexRecurs(2, 4));
        System.out.println(multiplexLog(2, 4));
    }

    static int multiplexRecurs(int x, int n) {
        int res = 1;
        if (n == 0)
            return 1;
        else
            res = x * multiplexRecurs(x, n - 1);
        return res;
    }

    static int multiplexLog(int x, int n) {
        int res = 1;
        if (n == 0)
            return 1;
        if (n % 2 == 1) {
            res = x * multiplexLog(x, n - 1);
        } else {
            int j = multiplexLog(x, n / 2);
            res = j * j;
        }
        return res;
    }

}
