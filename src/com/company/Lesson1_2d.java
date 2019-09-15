package com.company;

public class Lesson1_2d {
    void SolveExpression(int x) {
        int y;
        if (x == 3) {
            y = 0;
            System.out.println(y);
        } else if (x < 0) {
            y = 2 * Math.abs(x) - 5;
            System.out.println(y);
        } else if (x > 0) {
            y = 2 * x + 1;
            System.out.println(y);
        }
    }
}
