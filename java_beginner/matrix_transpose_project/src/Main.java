public class Main {
    public static void main(String[] args) {
        int[][] matrixOne = {{2, 3, 4}, {5, 6, 4}};

        System.out.println("Matrix: ");
        for(int i = 0; i < matrixOne.length; i++) {
            for(int j = 0; j < matrixOne[0].length; j++) {
                System.out.print(matrixOne[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Transpose: ");
        for(int i = 0; i < matrixOne[0].length; i++) {
            for(int j = 0; j < matrixOne.length; j++) {
                System.out.print(matrixOne[j][i] + "\t");
            }
            System.out.println();
        }
    }
}