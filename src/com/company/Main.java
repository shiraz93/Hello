package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Lesson1_2d lesson1_2d=new Lesson1_2d();
        lesson1_2d.SolveExpression(scanner.nextInt());
    }
}
