package com.company;

import java.util.Scanner;

public class LessonThreeLevelOneExcersiceFour {
    /**
     * this method show direction Robot after push command
     * @param initialDirection
     */
    void showDirectionRobotAfterPushButton(String initialDirection) {
        int pushDirection = 7;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Write command Robot <1>-Right  <-1>-Left  <1>-Straight ");
            pushDirection = scanner.nextInt();
            if (pushDirection >= -1 && pushDirection <= 1) {
                String dir = "NESW";
                int initialIndexDirection = dir.indexOf(initialDirection.toUpperCase());
                switch (pushDirection) {
                    case 0:
                        initialDirection = String.valueOf(dir.charAt(initialIndexDirection));
                        System.out.println("Robot direction is " + getWholeNameDirection(dir.charAt(initialIndexDirection)));
                        break;
                    case 1:
                        if (initialIndexDirection + 1 > 3) {
                            initialDirection = String.valueOf(dir.charAt(0));
                            System.out.println("Robot direction is " + getWholeNameDirection(dir.charAt(0)));
                        } else {
                            initialDirection = String.valueOf(dir.charAt(initialIndexDirection + 1));
                            System.out.println("Robot direction is " + getWholeNameDirection(dir.charAt(initialIndexDirection + 1)));
                        }
                        break;
                    case -1:
                        if (initialIndexDirection - 1 < 0) {
                            initialDirection = String.valueOf(dir.charAt(dir.length() - 1));
                            System.out.println("Robot direction is " + getWholeNameDirection(dir.charAt(dir.length() - 1)));
                        } else {
                            initialDirection = String.valueOf(dir.charAt(initialIndexDirection - 1));
                            System.out.println("Robot direction is " + getWholeNameDirection(dir.charAt(initialIndexDirection - 1)));
                        }
                        break;
                }
                System.out.println("if you want to exit input 7");
            } else if (pushDirection != 7) {
                System.out.println("you write mistake input " +
                        "\n Write command Robot <1>-Right  <-1>-Left  <1>-Straight " +
                        "\n repeat again");
            }
        } while (pushDirection != 7);
    }

    /**
     * this method return whole name of direction
     * @param dir
     * @return
     */
    String getWholeNameDirection(char dir) {
        String nameDirection = null;
        switch (dir) {
            case 'N':
                nameDirection = "North";
                break;
            case 'E':
                nameDirection = "East";
                break;
            case 'S':
                nameDirection = "South";
                break;
            case 'W':
                nameDirection = "West";
                break;
        }
        return nameDirection;
    }
}
