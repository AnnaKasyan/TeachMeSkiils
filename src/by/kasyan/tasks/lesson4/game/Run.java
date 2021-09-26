package by.kasyan.tasks.lesson4.game;

public class Run {
    public static void main(String[] args) {

        TicTacToe game = new TicTacToe();

        game.initialize();
        game.printBoard();
        game.play();
    }
}
