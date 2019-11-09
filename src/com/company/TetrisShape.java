package com.company;

public enum TetrisShape {

    BLOCK_SIZE(25), // size of one block
    ARC_RADIUS(6),
    FIELD_WIDTH(10), //count of block each horizontal line
    FIELD_HEIGHT(18),//count of block each vertical line
    FIELD_DX(7), // determined experimentally
    FIELD_DY(26),
    LEFT(37), // key codes
    UP(38),
    RIGHT(39),
    DOWN(40);

    int size;

    TetrisShape(int size) {
        this.size = size;
    }

    public int size() {
        return size;
    }

}
