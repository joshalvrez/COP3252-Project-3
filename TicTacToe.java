import java.util.Scanner;
import java.lang.Integer;

public class TicTacToe {    // TicTacToe Class will handle all inputs from command line
    static String[][] board;
    Scanner sc = new Scanner(System.in);    // handles inputs for each turn

    public static void newGame() {
        board = new String[3][3]; // multi-dimensional array; 3 rows, 3 columns
        resetBoard();
        printBoard();
    }

    public static void resetBoard() {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
                board[i][j] = " ";
        }
    }

    public static void printBoard() {
        System.out.print("Game Board:                Positions:\n\n");
        System.out.print(" " + board[0][0] + " | " + board[0][1]  + " | "  + board[0][2]  + " " + "                1 | 2 | 3 \n");
        System.out.print("-----------                -----------\n\n");
        System.out.print(" " + board[1][0]  + " | " + board[1][1]  + " | "  + board[1][2]  + " " + "                4 | 5 | 6 \n");
        System.out.print("-----------                -----------\n\n");
        System.out.print(" " + board[2][0]  + " | " + board[2][1]  + " | "  + board[2][2]  + " " + "                7 | 8 | 9 \n\n");
    }
    public static void main(String[] args) {    
        // Check to see how many command line arguments were passed in
        if (args.length == 0) {
            newGame();
        }
        if (args.length == 1) {
            newGame();
        }
        if (args.length == 2) {
            newGame();
        }
    }
}