package org.solution.algorithm;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
//        isHappy(19);//true
//        isHappy(2);//false
        boolean happy = isHappy(1111111);//false
        System.out.println(happy);
    }


    public static boolean isHappy(int n) {
        int result = get(n);
        if (result == -1) {
            return false;
        } else {
            return true;
        }
    }

    public static int get(int n) {
        List<Integer> objects = new ArrayList<>();
        recursion(objects, n);

        int result = 0;
        for (int i = 0; i < objects.size(); i++) {
            result += objects.get(i) * objects.get(i);
        }
        if (result >= 10) {
            return get(result);
        }
        if (result == 1) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void recursion(List<Integer> finalNum, int number) {
        if (number > 0) {
            recursion(finalNum, number / 10);
            finalNum.add(number % 10);
        }
    }
}