package com.company;

public enum TetrisShape {
    // size of one block
    BLOCK_SIZE(25),
    ARC_RADIUS(6),
    //count of block each horizontal line
    FIELD_WIDTH(10),
    //count of block each vertical line
    FIELD_HEIGHT(18),
    // determined experimentally
    FIELD_DX(7),
    FIELD_DY(26),
    // key codes
    LEFT(37),
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
