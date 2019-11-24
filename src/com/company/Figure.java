package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Figure {
    private Random random = new Random();
    private List<Block> figure = new ArrayList<>();
    private int[][] shape = new int[4][4];
    private int size = 4;
    private int coordinatX = 3;
    private int coordinatY = 0;
    private int type;
    private int color;
    private final int colors[] = {0x00f0f0, 0xf0f000, 0x0000f0, 0xf0a000, 0x00f000, 0xa000f0, 0xf00000};
    private final int SHAPES[][][] = {
            {{0, 0, 0, 0}, {1, 1, 1, 1}, {0, 0, 0, 0}, {0, 0, 0, 0}}, // I
            {{0, 0, 0, 0}, {0, 1, 1, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}}, // O
            {{1, 0, 0, 0}, {1, 1, 1, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}}, // J
            {{0, 0, 1, 0}, {1, 1, 1, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}}, // L
            {{0, 1, 1, 0}, {1, 1, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}}, // S
            {{1, 1, 1, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}}, // T
            {{1, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}}  // Z
    };


    public Figure() {
        type = random.nextInt(SHAPES.length);
        color = colors[type];
        if (type == 0 || type == 1) {
            coordinatY = -1;

        } else {
            size = size - 1;
        }
        for (int i = 0; i < size; i++) {
            System.arraycopy(SHAPES[type][i], 0, shape[i], 0, SHAPES[type][i].length);
        }

        createFigure();
    }

    /**
     * Check shape matrix where  if element is greater than zero create block take each block coordinate.
     */
    void createFigure() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (shape[j][i] == 1) {
                    figure.add(new Block(i + coordinatX, j + coordinatY));
                }
            }
        }
    }

    /**
     * Draws figure which is contain  outlined rectangles  using this graphics current color.
     *
     * @param graphics
     */
    void paint(Graphics graphics) {
        figure.forEach(p -> p.paint(graphics, color));
    }

    /**
     * is check figure touched ground or another figure
     *
     * @param mine
     * @return{@code true} if figure is touched ground or another figure , {@code false} otherwise.
     */
    boolean isTouchGround(int mine[][]) {
        boolean isTouch = false;
        for (Block block : figure) {
            if (mine[block.getCoordinatY() + 1][block.getCoordinatX()] > 0) {
                isTouch = true;
                break;
            } else {
                isTouch = false;
            }

        }
        return isTouch;
    }

    /**
     *  Get coordinate each of block of figure and as index of mine matrix and put color.
     *
     * @param mine
     */
    void leaveOnTheGround(int mine[][]) {

        figure.forEach(p -> mine[p.getCoordinatY()][p.getCoordinatX()] = color);
    }

    void stepDown() {
        figure.forEach(p -> p.setCoordinatY(p.getCoordinatY() + 1));
        coordinatY++;
    }

    /**
     * Figure is step down while figure is not touch ground or another figure.
     *
     * @param mine
     */
    void drop(int[][] mine) {
        while (!isTouchGround(mine)) {
            stepDown();
        }
    }

    /**
     * Move figure left or right.
     *
     * @param keycode is code pressed keyboard.
     * @param mine
     */
    void move(int keycode, int mine[][]) {

        if (!isTouchWall(mine, keycode)) {
            if (keycode == TetrisShape.LEFT.size()) {
                figure.forEach(p -> p.setCoordinatX(p.getCoordinatX() - 1));
                coordinatX--;
            }
            if (keycode == TetrisShape.RIGHT.size()) {

                figure.forEach(p -> p.setCoordinatX(p.getCoordinatX() + 1));
                coordinatX++;
            }
        }

    }

    /**
     * Check figure is touched wall or another figure.
     *
     * @param mine
     * @param direction move direction.
     * @return {@code true} if figure is touched wall left,right or another figure, {@code false} otherwise.
     */
    boolean isTouchWall(int[][] mine, int direction) {
        boolean isTouch = false;
        for (Block block : figure) {
            if (direction == TetrisShape.LEFT.size() && (block.getCoordinatX() == 0 || mine[block.getCoordinatY()][block.getCoordinatX() - 1] > 0)) {

                isTouch = true;
                break;

            } else if (direction == TetrisShape.RIGHT.size() && (block.getCoordinatX() == TetrisShape.FIELD_WIDTH.size() - 1 || mine[block.getCoordinatY()][block.getCoordinatX() + 1] > 0)) {
                isTouch = true;
                break;

            } else {
                isTouch = false;
            }

        }
        return isTouch;
    }

    /**
     *  Check there are free space for new figure.
     *
     * @param mine
     * @return {@code false} if there are free space for  new figure{@code true} otherwise.
     */
    boolean isCrossGround(int mine[][]) {
        boolean isCross = false;
        for (int i = 0; i < TetrisShape.FIELD_WIDTH.size(); i++) {
            if (mine[0][i] > 0) {
                isCross = true;
                break;
            }
        }
        return isCross;
    }

    /**
     *  Rotate figure 90 degree.
     *
     * @param mine
     */
    void rotate(int mine[][]) {

        for (int x = 0; x < size / 2; x++) {

            for (int y = x; y < size - x - 1; y++) {
                // store current cell in temp variable
                int temp = shape[x][y];

                // move values from right to top
                shape[x][y] = shape[y][size - 1 - x];

                // move values from bottom to right
                shape[y][size - 1 - x] = shape[size - 1 - x][size - 1 - y];

                // move values from left to bottom
                shape[size - 1 - x][size - 1 - y] = shape[size - 1 - y][x];

                // assign temp to left
                shape[size - 1 - y][x] = temp;
            }
        }
        if (isCanRotate(mine)) {
            figure.clear();
            createFigure();
        }
    }

    /**
     *  Check are there free space for rotated figure.
     *
     * @param mine
     * @return{@code true}if there are free space for rotated figure  , {@code false} if will touch another figure.
     */
    boolean isCanRotate(int[][] mine) {
        int carryDirection = 0;
        boolean isCan = true;
        for (Block block :
                figure) {
            if (block.getCoordinatX() == 0) {
                carryDirection = 1;
                break;
            } else if (block.getCoordinatX() == 9) {
                carryDirection = -1;
                break;
            }
        }
        if (carryDirection != 0) {

            if (carryDirection == 1) {
                coordinatX = 0;
            } else if (carryDirection == -1) {
                if (type == 0) {
                    coordinatX = 6;
                } else {
                    coordinatX = 7;
                }

            }
        }
        for (int x = 0; x < size; x++)
            for (int y = 0; y < size; y++)
                if (shape[y][x] == 1) {

                    if (mine[y + this.coordinatY][x + this.coordinatX] > 0) {
                        isCan = false;
                        break;
                    }
                }

        return isCan;
    }
}
