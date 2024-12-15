package org.solution;

public class Main {
    public static void main(String[] args) {
        int[] ints = new int[1];
        ints[0] = 9;
//        ints[1] = 9;
//        ints[2] = 9;

        int[] extracted2 = extracted(ints);
    }


    private static int[] extracted2(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] += 1;
                return digits;
            }
        }
        int[] ints = new int[digits.length + 1];
        ints[0] = 1;
        return ints;
    }


    private static int[] extracted(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
                if (i != 0 && digits[i - 1] < 9) {
                    digits[i - 1] += 1;
                    break;
                }
            } else {
                digits[i] += 1;
                return digits;
            }

            if (i == 0) {
                int[] ints1 = new int[digits.length + 1];
                ints1[0] = 1;
                return ints1;
            }
        }
        return digits;
    }
}