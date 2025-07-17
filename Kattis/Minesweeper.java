// Minesweeper -- Runtime error

import java.util.Scanner;

public class Minesweeper {
    public static void main(String[] args) {
        Scanner inputt = new Scanner(System.in);

        // Geting input; n = row, m = column, k = number of pairs the hack printed
        String[] mapString = inputt.nextLine().split(" ");
        int row = Integer.parseInt(mapString[0]);
        int column = Integer.parseInt(mapString[1]);
        int pairNum = Integer.parseInt(mapString[2]);
        
        // create board
        char[][] board = new char[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                board[i][j] = '.';
            }
        }
        
        for (int i = 0; i < pairNum; i++){
            String[] mineLine = inputt.nextLine().split(" ");
            int x = Integer.parseInt(mineLine[0]) - 1;
            int y = Integer.parseInt(mineLine[1]) - 1;
            board[x][y] = '*';
        }
        
        for (char[] each : board){
            System.out.println(each);
        }
      
        inputt.close();
    }
}
