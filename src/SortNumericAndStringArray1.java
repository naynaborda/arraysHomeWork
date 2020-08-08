import java.util.Arrays;

public class SortNumericAndStringArray1 {
    //1.WAP in Java  to sort a numeric array and string array.
    // Testing the git hub

    public static void main(String[] args) {
        int array[] = {19, 67, 56, 89, 70, 79, 92};
        String str[] = {"Ram", "Krishna", "Sita", "Laxman", "Bharat", "Dashrath"};
        System.out.println("Original value: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Sorted value: " + Arrays.toString(array));
        System.out.println("Original value: " + Arrays.toString(str));
        Arrays.sort(str);
        System.out.println("Sorted value: " + Arrays.toString(str));


    }
}
