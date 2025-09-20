//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void displayMatrix(int[][] matrices){
        for(int[] matrix : matrices){
            for(int element : matrix){
                System.out.print(element + "\t");
            }
            System.out.println();
        }

        System.out.println();
    }

    public static void multiplyMatrix(int[][] matrix1, int[][] matrix2){
        displayMatrix(matrix1);
        displayMatrix(matrix2);

        int a = matrix1[0][0];
        int b = matrix1[0][1];
        int c = matrix1[0][1];
        int d = matrix1[1][1];

        int[][] result = new int[][]{
                {a,b},
                {c,d}
        };

        for (int[] row : result){
            for(int column : row){
                System.out.print( column + "\t");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {


        System.out.println("Matrices In Java!!");

        int[][] matrix1 = new int[][]{
                {1,2},
                {3,4},
        };

        int[][] matrix2 = new int[][]{
                {5,7},
                {6,8},
        };

        multiplyMatrix(matrix1, matrix2);

    }
}