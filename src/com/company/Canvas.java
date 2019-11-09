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
     * checked mine matrix where element contain color of int type , Paints a 3-D highlighted rectangle filled with the color .
     *
     * @param g
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        for (int i = 0; i < TetrisShape.FIELD_WIDTH.size(); i++) {
            for (int j = 0; j < TetrisShape.FIELD_HEIGHT.size(); j++) {
                g.setColor(new Color(mine[j][i]));
                g.fill3DRect(i * TetrisShape.BLOCK_SIZE.size() + 1, j * TetrisShape.BLOCK_SIZE.size() + 1, TetrisShape.BLOCK_SIZE.size() - 1, TetrisShape.BLOCK_SIZE.size() - 1, true);
            }
            if (gameOver) {
                g.setColor(Color.white);
                for (int y = 0; y < GAME_OVER_MSG.length; y++)
                    for (int x = 0; x < GAME_OVER_MSG[y].length; x++)
                        if (GAME_OVER_MSG[y][x] == 1) g.fill3DRect(x * 11 + 18, y * 11 + 160, 10, 10, true);
            } else {
                figure.paint(g);
            }
        }
    }

    /**
     * set the figure
     *
     * @param figure
     */
    public void setFigure(Figure figure) {
        this.figure = figure;
    }

    /**
     * set the gameover
     *
     * @param gameOver
     */
    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }
}

