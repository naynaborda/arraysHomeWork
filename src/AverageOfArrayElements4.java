import java.util.Scanner;

public class AverageOfArrayElements4 {
    public static void main(String[] args) {
        //4.WAP to calculate the average value of array elements
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for size of array: ");
        int number = scanner.nextInt();
        int array[] = new int[number];
        System.out.print("Enter the elements number: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        //calculate sum of arrays element
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        //calculate average of array element
        int average = sum / array.length;
        System.out.println("Average value of array is : " + average);


    }
}
