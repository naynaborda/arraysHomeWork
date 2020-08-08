import java.util.Scanner;

public class SumValueOfArrays2 {
    public static void main(String[] args) {
        //2.WAP to sum values of an array.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for size of array: ");
        int number = scanner.nextInt();
        int array[] = new int[number];
        System.out.print("Enter values: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        //calculate sum of all array element
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];

        }

        System.out.println("Sum Value of arrays is: " + sum);

    }
}



