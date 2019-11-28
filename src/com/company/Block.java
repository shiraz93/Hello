package com.company;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;

@Setter
@Getter
public class Block {

    private int coordinatX;
    private int coordinatY;

    /**
     * Create constructor.
     *
     * @param coordinatX coordinat x.
     * @param coordinatY coordinat y.
     */
    public Block(int coordinatX, int coordinatY) {
        this.coordinatX = coordinatX;
        this.coordinatY = coordinatY;
    }


    /**
     * Draws an outlined round-cornered rectangle.
     *
     * @param graphics Grapgics.
     * @param color    the color block.
     */
    void paint(Graphics graphics, int color) {
        graphics.setColor(new Color(color));
        graphics.drawRoundRect(coordinatX * TetrisShape.BLOCK_SIZE.size() + 1, coordinatY * TetrisShape.BLOCK_SIZE.size() + 1, TetrisShape.BLOCK_SIZE.size() - 2, TetrisShape.BLOCK_SIZE.size() - 2, TetrisShape.ARC_RADIUS.size(), TetrisShape.ARC_RADIUS.size());
    }
}
