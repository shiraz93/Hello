package com.company;

import java.awt.*;

public class Block {
    private int x;
    private int y;

    public Block(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    /**
     * Draws an outlined round-cornered rectangle using this graphics context's current color.
     *
     * @param g
     * @param color the color block
     */
    void paint(Graphics g, int color) {
        g.setColor(new Color(color));
        g.drawRoundRect(x * TetrisShape.BLOCK_SIZE.size() + 1, y * TetrisShape.BLOCK_SIZE.size() + 1, TetrisShape.BLOCK_SIZE.size() - 2, TetrisShape.BLOCK_SIZE.size() - 2, TetrisShape.ARC_RADIUS.size(), TetrisShape.ARC_RADIUS.size());
    }
}
