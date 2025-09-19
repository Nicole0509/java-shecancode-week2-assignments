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

    public static void main(String[] args) {


        System.out.println("Matrices In Java!!");

        int[][] matrix1 = new int[][]{
                {1,2},
                {4,5},
        };

        int[][] matrix2 = new int[][]{
                {3,6},
                {7,8},
        };

        displayMatrix(matrix1);
        displayMatrix(matrix2);

    }
}