package io.github.the724;

import java.util.regex.Pattern;

public final class LuhnChecksum {

    private LuhnChecksum() {
        throw new AssertionError();
    }

    public static boolean evaluate(String expression) {
        return checkNotEmpty(expression)
                && checkAllDigits(expression)
                && checkModulo10(expression);
    }

    private static boolean checkNotEmpty(String obj) {
        return obj != null && !obj.equals("");
    }

    private static boolean checkAllDigits(String obj) {

        return Pattern.compile("\\d+").matcher(obj).matches();
    }

    private static boolean checkModulo10(String obj) {

        int[] digits = toIntArray(obj.toCharArray());

        for (int i = 0; i < digits.length - 1; i++) {

            if (i % 2 == 0) {
                digits[i] = nineAlign(digits[i]);
            }
        }
        return sumOfArray(digits) % 10 == 0;
    }

    private static int[] toIntArray(char[] charArray) {

        int[] intArray = new int[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            intArray[i] = Character.getNumericValue(charArray[i]);
        }

        return intArray;
    }

    private static int nineAlign(int number) {
        return number * 2 > 9 ? (number * 2 - 9) : number * 2;
    }

    private static int sumOfArray(int[] array) {

        int sum = 0;
        for (int item : array)
            sum += item;
        return sum;
    }
}


