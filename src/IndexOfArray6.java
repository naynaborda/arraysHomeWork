import java.util.Scanner;

public class IndexOfArray6 {
    public static void main(String[] args) {
        //6.WAP to find the index of an array element.
        int array[] = {5, 4, 6, 1, 3, 2, 7, 8, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any one of the element from the array: ");
        int number = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println(i);
            }
        }

    }


}






