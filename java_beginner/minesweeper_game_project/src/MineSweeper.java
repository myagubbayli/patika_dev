import java.util.Arrays;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber, columnNumber;

    MineSweeper(int rowNumber, int columnNumber) {
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
    }
    public void Run() {
        int rowGuess = 0, columnGuess = 0;
        String[][] mineArea = RandomMine();
        String[][] woMines = MainMap();
        System.out.println("Welcome to MineSweeper Game!");

        do{
            for(int i = 0; i < this.rowNumber; i++) {
                for(int j = 0; j < this.columnNumber; j++) {
                    System.out.print(woMines[i][j] + " ");
                }
                System.out.println();
            }
            Scanner guess = new Scanner(System.in);
            System.out.print("Give row: ");
            rowGuess = guess.nextInt();
            System.out.print("Give column: ");
            columnGuess = guess.nextInt();
            if (mineArea[rowGuess][columnGuess] == "*") {
                System.out.println("Game Over. You Lost!");
                break;
            }
            System.out.println("=====================");
        } while (true);



    }

    public String[][] RandomMine() {
        int mineRow = 0, mineColumn = 0;
        int mineNumber = (this.rowNumber * this.columnNumber) / 4;
        String[][] ourMainMap = MainMap();

        for (int j = 0; j < mineNumber; j++) {
            mineRow = (int) (Math.random() * this.rowNumber);
            mineColumn = (int) (Math.random() * this.columnNumber);
            ourMainMap[mineRow][mineColumn] = "*";
        }
        for(int i = 0; i < this.rowNumber; i++) {
            for(int j = 0; j < this.columnNumber; j++) {
                System.out.print(ourMainMap[i][j] + " ");
            }
            System.out.println();
        }
        return ourMainMap;
    }

    public String[][] MainMap() {
        String[][] mineSweeper = new String[this.rowNumber][this.columnNumber];
        for(int i = 0; i < this.rowNumber; i++) {
            for(int j = 0; j < this.columnNumber; j++) {
                mineSweeper[i][j] = "-";
            }
        }
        return mineSweeper;
    }


}
