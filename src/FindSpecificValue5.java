import java.util.Scanner;

public class FindSpecificValue5 {
    //5.WAP to test if an arrays contains a specific value.
    public static void main(String[] args) {
        int arrays[] = {10, 20, 30, 40, 50};
        boolean isPresent = false;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number to check if contains a specific number: ");
        int number = scanner.nextInt();
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == number) {
                isPresent = true;
            }
        }
        if (isPresent == true) {
            System.out.println("Arrays contain specific number");
        } else {
            System.out.println("Arrays don't contain specific number");
        }

    }
}
