import java.util.Scanner;

public class AddTwoMatricesOfSameSize16 {
    //16.WAP in java to add two matrices of the same size
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows:");
        int numOfRows = scanner.nextInt();
        System.out.print("Enter number of column:");
        int numOfColumn = scanner.nextInt();
        int first[][] = new int[numOfRows][numOfColumn];
        int second[][] = new int[numOfRows][numOfColumn];
        int sum[][] = new int[numOfRows][numOfColumn];
        System.out.println("Enter the element of first matrix:");
        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < numOfColumn; j++) {
                first[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the element of second matrix:");
        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < numOfColumn; j++) {
                second[i][j] = scanner.nextInt();
            }
        }
        System.out.println("New matrix after addition:");
        for (int i = 0; i < numOfRows; i++) {
            for (int j = 0; j < numOfColumn; j++) {
                sum[i][j] = first[i][j] + second[i][j];
                System.out.print(sum[i][j] + "\t ");
            }
            System.out.println();
        }


    }
}
