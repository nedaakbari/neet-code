package org.solution.algorithm;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        while (get(n) != 1) {
            n = get(n);
            if ()
        }
    }

    public static boolean isHappy(int n) {
        return true;
    }

    public static int get(int n) {
        List<Integer> objects = new ArrayList<>();
        recursion(objects, n);
        if (objects.size() == 2) {
            Integer i = objects.get(0);
            Integer a = objects.get(1);
            return i * i + a * a;
        }else {

        }
        return n;
    }

    public static void recursion(List<Integer> finalNum, int number) {
        if (number > 0) {
            recursion(finalNum, number / 10);
            finalNum.add(number % 10);
        }
    }
}
