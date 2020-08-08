import java.util.Scanner;

public class MaximumAndMinimumValue9 {
    //9.WAP to find maximum and minimum value of an array.
    public static void main(String[] args) {

        //Create scanner object for taking input from console.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        //Capturing the number of elements in to number
        int number = scanner.nextInt();
        int array[] = new int[number];
        //Read the elements in to array
        System.out.print("Enter the elements number: ");
        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }
        //to find minimum and maximum value
        int max = array[0];
        for (int a : array) {
            if (a > max) {
                max = a;
            }
        }
        int min = array[0];
        for (int a : array) {
            if (a < min) {
                min = a;
            }
        }
        System.out.println(("Maximum Value of array is " + max));
        System.out.println("Minimum Value of array is " + min);

    }
}

