package codewars.connectfour;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConnectFour {

    public static String whoIsWinner(List<String> piecesPositionList) {

        char[][] board = new char[6][7];
        int[] columnNumber = new int[7];

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                board[row][col] = ' ';
            }
        }

        for (String move : piecesPositionList) {

            String[] padded = move.split("_");

            // splitting inputs into chars
            char column = padded[0].charAt(0);
            char color = padded[1].charAt(0);

            int colIndex = column - 'A';
            int rowIndex = columnNumber[colIndex]++;

            board[rowIndex][colIndex] = color;

            if (checkWin(board, rowIndex, colIndex)) {
                if (color == 'R'){
                    return "Red";
                } else if (color == 'Y') {
                    return "Yellow";
                }
            }
        }

        return "Draw";
    }


    public static boolean checkWin(char[][] board, int row, int col) {
        char color = board[row][col];

        // checking column
        for (int c = 0; c <= col -3; c++) {
            if (board[row][c] == color &&
                    board[row][c + 1] == color &&
                    board[row][c + 2] == color &&
                    board[row][c + 3] == color) {
                return true;
            }
        }

        // checking row
        for (int r = 0; r <= row - 3; r++) {
            if (board[r][col] == color &&
                    board[r + 1][col] == color &&
                    board[r + 2][col] == color &&
                    board[r + 3][col] == color) {
                return true;
            }
        }

        // checking diagonal up
        for (int r = 0; r <= row - 3; r++) {
            for (int c = 0; c <= col - 3; c++) {
                if (board[r][c] == color &&
                        board[r + 1][c + 1] == color &&
                        board[r + 2][c + 2] == color &&
                        board[r + 3][c + 3] == color) {
                    return true;
                }
            }
        }

        // checking diagonal down
        for (int r = 0; r <= row - 3; r++) {
            for (int c = col; c <= col - 6; c++) {
                if (board[r][c] == color &&
                        board[r + 1][c - 1] == color &&
                        board[r + 2][c - 2] == color &&
                        board[r + 3][c - 3] == color) {
                    return true;
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>(Arrays.asList(
                "C_Yellow",
                "E_Red",
                "G_Yellow",
                "B_Red",
                "D_Yellow",
                "B_Red",
                "B_Yellow",
                "G_Red",
                "C_Yellow",
                "C_Red",
                "D_Yellow",
                "F_Red",
                "E_Yellow",
                "A_Red",
                "A_Yellow",
                "G_Red",
                "A_Yellow",
                "F_Red",
                "F_Yellow",
                "D_Red",
                "B_Yellow",
                "E_Red",
                "D_Yellow",
                "A_Red",
                "G_Yellow",
                "D_Red",
                "D_Yellow",
                "C_Red"
        ));

        System.out.println(whoIsWinner(myList));

    }
}
