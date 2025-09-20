import java.util.Scanner;

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

        int a = matrix1[0][0] * matrix2[0][0] + matrix1[0][1] * matrix2[1][0];
        int b = matrix1[0][0] * matrix2[0][1] + matrix1[0][0] * matrix2[1][1];
        int c = matrix1[1][0] * matrix2[0][0] + matrix1[1][1] * matrix2[1][0];
        int d = matrix1[1][0] * matrix2[0][1] + matrix1[1][1] * matrix2[1][1];

        int[][] result = new int[][]{
                {a,b},
                {c,d}
        };

        //Displaying the working formula

        System.out.println("The formula for multiplying 2D matrices:\n");
        System.out.println("(" + matrix1[0][0] + " * " + matrix2[0][0] + " + " + matrix1[0][1] + " * " + matrix2[1][0] + ")\t\t("+ matrix1[0][0] + " * " + matrix2[0][1] + " + " + matrix1[0][0] + " * " + matrix2[1][1] + ")");
        System.out.println("(" + matrix1[1][0] + " * " + matrix2[0][0] + " + " + matrix1[1][1] + " * " + matrix2[1][0] + ")\t\t("+ matrix1[1][0] + " * " + matrix2[0][1] + " + " + matrix1[1][1] + " * " + matrix2[1][1] + ")\n");

        System.out.println("The result:\n");
        displayMatrix(result);
    }

    public static void main(String[] args) {


        System.out.println("Matrices In Java!!");

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns of the matrices:\n");
        System.out.println("Enter the values for matrix 1 in this order");
        System.out.print("matrix1 [0][0] :");
        int a = input.nextInt();
        System.out.print("matrix1 [0][1] :");
        int b = input.nextInt();
        System.out.print("matrix1 [1][0] :");
        int c = input.nextInt();
        System.out.print("matrix1 [1][1] :");
        int d = input.nextInt();

        int[][] matrix1 = new int[][]{
                {a,b},
                {c,d}
        };

        System.out.println("Enter the values for matrix 2 in this order");
        System.out.print("matrix2 [0][0] :");
        a = input.nextInt();
        System.out.print("matrix2 [0][1] :");
        b = input.nextInt();
        System.out.print("matrix2 [1][0] :");
        c = input.nextInt();
        System.out.print("matrix2 [1][1] :");
        d = input.nextInt();

        int[][] matrix2 = new int[][]{
                {a,b},
                {c,d}
        };

        System.out.println("The first matrix:");
        displayMatrix(matrix1);
        System.out.println("The second matrix:");
        displayMatrix(matrix2);

        multiplyMatrix(matrix1, matrix2);

    }
}