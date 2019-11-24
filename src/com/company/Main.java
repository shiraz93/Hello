package com.company;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main extends JFrame {
    private final int START_LOCATION_X = 700;
    private final int START_LOCATION_Y = 200;
    private final int SHOW_DELAY = 400; // delay for animation
    private final String TITLE_OF_PROGRAM = "Tetris";
    private int gameScore = 0;
    private final int[] SCORES = {100, 300, 700, 1500};
    private int mine[][] = new int[TetrisShape.FIELD_HEIGHT.size() + 1][TetrisShape.FIELD_WIDTH.size()];
    private Figure figure = new Figure();
    private Canvas canvas = new Canvas(mine);
    private boolean gameOver = false;


    public static void main(String[] args) {
        new Main().start();

    }

    public Main() {
        createWindow();
        addKeysListener();
    }

    /**
     * Create Window for game.
     */
    void createWindow() {
        canvas.setFigure(figure);
        setTitle(TITLE_OF_PROGRAM);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(START_LOCATION_X, START_LOCATION_Y, TetrisShape.FIELD_WIDTH.size() * TetrisShape.BLOCK_SIZE.size() + 17,
                TetrisShape.FIELD_HEIGHT.size() * TetrisShape.BLOCK_SIZE.size() + TetrisShape.FIELD_HEIGHT.size() + 22);
        canvas.setBackground(Color.black);
        setResizable(false);
        add(BorderLayout.CENTER, canvas);
        setVisible(true);
        Arrays.fill(mine[TetrisShape.FIELD_HEIGHT.size()], 1);
    }

    /**
     * Add keys event.
     */
    void addKeysListener() {
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (!gameOver) {
                    if (e.getKeyCode() == TetrisShape.DOWN.size()) {
                        figure.drop(mine);
                    }
                    if (e.getKeyCode() == TetrisShape.UP.size()) {
                        figure.rotate(mine);
                    }

                    if (e.getKeyCode() == TetrisShape.LEFT.size() || e.getKeyCode() == TetrisShape.RIGHT.size()) {
                        figure.move(e.getKeyCode(), mine);
                    }


                }
                canvas.repaint();
            }
        });
    }

    void start() {
        while (!gameOver) {
            try {
                Thread.sleep(SHOW_DELAY);
            } catch (Exception e) {
                e.printStackTrace();
            }
            canvas.repaint();
            checkFilling();
            if (figure.isTouchGround(mine)) {
                figure.leaveOnTheGround(mine);
                figure = new Figure();
                canvas.setFigure(figure);
                gameOver = figure.isCrossGround(mine); // Is there space for a new figure?
            } else
                figure.stepDown();
        }
        canvas.setGameOver(gameOver);

    }

    /**
     * Check each of rows of mine if is filling this rows fill  0 value and from this rows high block drop.
     */
    void checkFilling() { // check filling rows
        List<Integer> list = new ArrayList<>();
        int countBlockRow;
        for (int i = 0; i < TetrisShape.FIELD_HEIGHT.size(); i++) {
            countBlockRow = 0;
            for (int j = 0; j < TetrisShape.FIELD_WIDTH.size(); j++) {
                if (mine[i][j] > 0) {
                    countBlockRow++;
                }
            }
            if (countBlockRow == 10) {
                list.add(i);
            }
        }
        if (!list.isEmpty()) {
            list.forEach(p -> Arrays.fill(mine[p], 0));
            for (int i = list.get(0); i >= 0; i--) {
                for (int j = 0; j < TetrisShape.FIELD_WIDTH.size(); j++) {
                    if (mine[i][j] > 0) {
                        mine[i + list.size()][j] = mine[i][j];
                        mine[i][j] = 0;
                    }
                }
            }
            gameScore += SCORES[list.size() - 1];
            setTitle(TITLE_OF_PROGRAM + " : " + gameScore);
        }

    }
}
