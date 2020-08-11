import java.util.Scanner;

public class Grid3 {
    public static void main(String[] args) {
        //3.WAP in java to print square grid

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number of row you want: ");
        int number =scanner.nextInt();
        int array[][]=new int [number][number];

        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print( "-"+ " ");
            }
            System.out.println();

        }

    }
}
