package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String dir = "NESW";
        String direction = null;
        Scanner scanner = new Scanner(System.in);
        LessonThreeLevelOneExcersiceOne threeLevelOneExcersiceOne = new LessonThreeLevelOneExcersiceOne();
        System.out.println("Write initial direction Robot <N>-North <E>-East <S>-South <W>-West ");
        do {
            direction = scanner.next();
            if (dir.contains(direction.toUpperCase())) {
                threeLevelOneExcersiceOne.showDirectionRobotAfterPushButton(direction);
            } else if (!direction.equals("Q")) {
                System.out.println("you write mistake input " +
                        "\n Write initial direction Robot <N>-North <E>-East <S>-South <W>-West " +
                        "\n repeat again" +
                        "\n if you want to exit push  <Q>");
            }

        } while (!direction.equals("Q"));

    }
}
