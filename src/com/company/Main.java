package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Lesson_1_3e lesson_1_3e=new Lesson_1_3e();
        double x=scanner.nextDouble();
        double y=scanner.nextDouble();
        lesson_1_3e.Isin(x,y);
    }
}
