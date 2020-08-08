import java.util.Scanner;

public class MatrixTranspose1 {
    //17.WAP  to declare multidimensional array and transpose the matrix.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrix[][] = new int[10][10];
        System.out.print("Enter the matrix rows : ");
        int numOFRows = scanner.nextInt();
        System.out.print("Enter the number of column:");
        int numOfColumn = scanner.nextInt();
        System.out.print("Enter matrix elements...");
        for (int i = 0; i < numOFRows; i++) {
            for (int j = 0; j < numOfColumn; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int transpose[][] = new int[10][10];
        for (int i = 0; i < numOfColumn; i++) {
            for (int j = 0; j < numOFRows; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transpose of the given number is : ");
        for (int i = 0; i < numOFRows; i++) {
            for (int j = 0; j < numOfColumn; j++) {
                System.out.print("\t" + transpose[i][j]);
            }
            System.out.println();
        }


    }
}
