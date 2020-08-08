import java.lang.reflect.Array;
import java.util.Arrays;

public class FindTheSecondLargestElemet15 {
    //15.WAP to find the second largest element in an array
    public static void main(String[] args) {
        int array[] = {60, 80, 9, 5, 55, 2, 8, -1, 3, 55};
        int number = array.length;

        //sort the array
        //Arrays.sort(array);

        //System.out.println("Second Largest Element in array is = "+array[number-2]);
        //if  the same number repeated in array then this logic will not work.

        //so here is second option
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        //for Traversing an array
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                secondLargest = largest;
                largest = array[i];

            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }
        System.out.println("Second Largest Element in array is " + secondLargest);


    }

}
