package src.processor;

import src.view.View;
import src.models.Tile;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Controller extends KeyAdapter {
    private Model model;
    private View view;
    private static final int WINNING_TILE = 2048;


    public Controller(Model model) {
        this.model = model;
        view = new View(this, model);
    }

    void resetGame() {
        model.setScore(0);
        view.setGameLost(false);
        view.setGameWon(false);
        model.resetGameTiles();
    }

    public Tile[][] getGameTiles() {
        return model.getGameTiles();
    }

    public int getScore() {
        return model.getScore();
    }

    public View getView() {
        return view;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            resetGame();
        }
        if (!model.canMove()) {
            view.setGameLost(true);
        }
        if (!view.isGameWon() && !view.isGameLost()) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                model.left();
                break;
                case KeyEvent.VK_RIGHT:
                    model.right();
                    break;
                case KeyEvent.VK_DOWN:
                    model.down();
                    break;
                case KeyEvent.VK_UP:
                    model.up();
                    break;
                case KeyEvent.VK_Z:
                    model.rollback();
                    break;
                case KeyEvent.VK_R:
                    model.randomMove();
                    break;
                case KeyEvent.VK_A:
                    model.autoMove();
            }
        }
        if (model.getMaxTile() == WINNING_TILE) {
            view.setGameWon(true);
        }
        view.repaint();
    }
}
