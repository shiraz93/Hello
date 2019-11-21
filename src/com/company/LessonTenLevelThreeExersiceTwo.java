package com.company;

public class LessonTenLevelThreeExersiceTwo {
    /**
     *
     * @param strFirst
     * @param strSecond
     */
    void minusLargeNumbers(String strFirst, String strSecond) {
        boolean isnegative = false;
        int differenceLenght = strFirst.length() - strSecond.length();
        char[] firstNumber = strFirst.toCharArray();
        char[] secondNumber = strSecond.toCharArray();
        String result = "";
        if (firstNumber.length >= secondNumber.length) {
            for (int i = strFirst.length() - 1; i >= strFirst.length() - strSecond.length(); i--) {
                if (firstNumber[i] >= secondNumber[i - differenceLenght]) {
                    result = (Integer.valueOf(firstNumber[i]) - Integer.valueOf(secondNumber[i - differenceLenght])) + result;
                } else if (i == 0 && firstNumber[i] > secondNumber[i] || i != 0) {

                    result = (Integer.valueOf(firstNumber[i]) + 10) - Integer.valueOf(secondNumber[i - differenceLenght]) + result;
                    int countZeroFrom_i = 1;
                    while (firstNumber[i - countZeroFrom_i] == 48 && i - countZeroFrom_i >= 0) {
                        firstNumber[i - countZeroFrom_i] = '9';
                        countZeroFrom_i++;
                    }
                    if (i - countZeroFrom_i >= 0) {
                        firstNumber[i - countZeroFrom_i] = Character.valueOf((char) (Integer.valueOf(firstNumber[i - countZeroFrom_i]) - 1));
                    }
                } else {
                    isnegative = true;
                }
            }
            if (differenceLenght != 0) {
                for (int i = firstNumber.length - secondNumber.length - 1; i >= 0; i--) {
                    result = firstNumber[i] + result;
                }

            }

        } else {
            isnegative = true;
        }
        if (!isnegative) {
            if (result.charAt(0) == '0') {
                System.out.println(result.substring(1));
            } else {
                System.out.println(result);
            }
        } else {
            System.out.println("is negative");
        }
    }
}
