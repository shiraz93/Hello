package com.company;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {
    private int mine[][];
    private Figure figure;
    private boolean gameOver = false;
    final int[][] GAME_OVER_MSG = {
            {0, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 0},
            {1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1},
            {1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1},
            {1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 0},
            {0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0},
            {1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0},
            {1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0},
            {1, 0, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 1, 0},
            {0, 1, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 0, 1, 0, 0, 1, 0}};

    public Canvas(int mine[][]) {
        this.mine = mine;

    }

    /**
     *  Paints a 3-D highlighted rectangle filled with the color .
     *
     * @param graphics
     */
    @Override
    public void paint(Graphics graphics) {
        super.paint(graphics);
        for (int i = 0; i < TetrisShape.FIELD_WIDTH.size(); i++) {
            for (int j = 0; j < TetrisShape.FIELD_HEIGHT.size(); j++) {
                graphics.setColor(new Color(mine[j][i]));
                graphics.fill3DRect(i * TetrisShape.BLOCK_SIZE.size() + 1, j * TetrisShape.BLOCK_SIZE.size() + 1, TetrisShape.BLOCK_SIZE.size() - 1, TetrisShape.BLOCK_SIZE.size() - 1, true);
            }
            if (gameOver) {
                graphics.setColor(Color.white);
                for (int y = 0; y < GAME_OVER_MSG.length; y++)
                    for (int x = 0; x < GAME_OVER_MSG[y].length; x++)
                        if (GAME_OVER_MSG[y][x] == 1) graphics.fill3DRect(x * 11 + 18, y * 11 + 160, 10, 10, true);
            } else {
                figure.paint(graphics);
            }
        }
    }

    /**
     * Set the figure.
     *
     * @param figure
     */
    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    /**
     * Set the gameover.
     *
     * @param gameOver
     */
    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }
}

