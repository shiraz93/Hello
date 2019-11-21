package com.company;

import java.awt.*;

public class Block {
    private int coordinatX;
    private int coordinatY;

    public Block(int coordinatX, int coordinatY) {
        this.coordinatX = coordinatX;
        this.coordinatY = coordinatY;
    }

    public int getCoordinatX() {
        return coordinatX;
    }

    public void setCoordinatX(int coordinatX) {
        this.coordinatX = coordinatX;
    }

    public int getCoordinatY() {
        return coordinatY;
    }

    public void setCoordinatY(int coordinatY) {
        this.coordinatY = coordinatY;
    }

    /**
     * Draws an outlined round-cornered rectangle using this graphics context's current color.
     *
     * @param graphics
     * @param color    the color block
     */
    void paint(Graphics graphics, int color) {
        graphics.setColor(new Color(color));
        graphics.drawRoundRect(coordinatX * TetrisShape.BLOCK_SIZE.size() + 1, coordinatY * TetrisShape.BLOCK_SIZE.size() + 1, TetrisShape.BLOCK_SIZE.size() - 2, TetrisShape.BLOCK_SIZE.size() - 2, TetrisShape.ARC_RADIUS.size(), TetrisShape.ARC_RADIUS.size());
    }
}
