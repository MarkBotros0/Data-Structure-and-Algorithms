package neetcode;

import java.util.*;

public class _8_ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {
                {'1', '2', '.', '.', '3', '.', '.', '.', '.'},
                {'4', '.', '.', '5', '.', '.', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '.', '3'},
                {'5', '.', '.', '.', '6', '.', '.', '.', '4'},
                {'.', '.', '.', '8', '.', '3', '.', '.', '5'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '.', '.', '.', '.', '.', '2', '.', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '8'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        char[][] board1 = {
                {'.', '.', '.', '.', '5', '.', '.', '1', '.'},
                {'.', '4', '.', '3', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '3', '.', '.', '1'},
                {'8', '.', '.', '.', '.', '.', '.', '2', '.'},
                {'.', '.', '2', '.', '7', '.', '.', '.', '.'},
                {'.', '1', '5', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '2', '.', '.', '.'},
                {'.', '2', '.', '9', '.', '.', '.', '.', '.'},
                {'.', '.', '4', '.', '.', '.', '.', '.', '.'}
        };
        System.out.println(isValidSudoku(board));
        System.out.println(isValidSudoku(board1));
    }

    public static boolean isValidSudoku(char[][] board) {
        Map<Integer, Map<Character, Integer>> blocks = new HashMap<>();
        for (int i = 0; i < board.length; i++) {
            Set<Character> row = new HashSet<>();
            Set<Character> col = new HashSet<>();

            for (int j = 0; j < board.length; j++) {
                if (board[i][j] != '.') {
                    if (row.contains(board[i][j])) {
                        return false;
                    } else {
                        row.add(board[i][j]);
                    }
                }
                if (board[j][i] != '.') {
                    if (col.contains(board[j][i])) {
                        return false;
                    } else {
                        col.add(board[j][i]);
                    }
                }
            }
        }
        for (int square = 0; square < 9; square++) {
            Set<Character> squareSet = new HashSet<>();
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int row = (square / 3) * 3 + i;
                    int col = (square % 3) * 3 + j;

                    if (board[row][col] == '.') continue;

                    if (squareSet.contains(board[row][col])) {
                        return false;
                    } else {
                        squareSet.add(board[row][col]);
                    }
                }
            }
        }
        return true;
    }

    public static boolean isValidSudoku1(char[][] board) {
        Map<Integer, Set<Character>> rows = new HashMap<>();
        Map<Integer, Set<Character>> cols = new HashMap<>();
        Map<String, Set<Character>> squares = new HashMap<>();

//        for (int r = 0; r < board.length; r++) {
//            for (int c = 0; c < board.length; c++) {
//                if (board[r][c] == '.') return false;
//
//                if (rows.computeIfAbsent(r, new HashSet<>()) == null) {}
//
//                rows.put(r, board[r][c]);
//
//            }
//        }
        return true;
    }
}
