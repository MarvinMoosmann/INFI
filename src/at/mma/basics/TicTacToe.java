package at.mma.basics;

import java.util.Scanner;

public class TicTacToe {
    private static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };
    private static char currentPlayer = 'X';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            printBoard();
            getPlayerMove();
        } while (!isGameFinished());

        printBoard();
        scanner.close();
    }

    private static void printBoard() {
        System.out.println("  0 1 2");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if (j < 2) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < 2) {
                System.out.println("  -----");
            }
        }
        System.out.println();
    }

    private static void getPlayerMove() {
        Scanner scanner = new Scanner(System.in);
        int row, col;

        do {
            System.out.print("Spieler " + currentPlayer + ", gib deine Zugkoordinaten ein (Zeile und Spalte): ");
            row = scanner.nextInt();
            col = scanner.nextInt();
        } while (!isValidMove(row, col));

        board[row][col] = currentPlayer;
        switchPlayer();
    }

    private static boolean isValidMove(int row, int col) {
        if (row < 0 || row >= 3 || col < 0 || col >= 3 || board[row][col] != ' ') {
            System.out.println("Ungültige Eingabe. Bitte versuche es erneut.");
            return false;
        }
        return true;
    }

    private static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    private static boolean isGameFinished() {
        if (isWinner('X')) {
            printBoard();
            System.out.println("Spieler X hat gewonnen!");
            return true;
        } else if (isWinner('O')) {
            printBoard();
            System.out.println("Spieler O hat gewonnen!");
            return true;
        } else if (isBoardFull()) {
            printBoard();
            System.out.println("Unentschieden! Das Spielfeld ist voll.");
            return true;
        }
        return false;
    }

    private static boolean isWinner(char player) {
        // Überprüfe Reihen, Spalten und Diagonalen
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                    (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    private static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}