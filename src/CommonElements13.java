import java.util.HashSet;

public class CommonElements13 {
    //13.WAP to find the common elements between two arrays of integers.
    public static void main(String[] args) {
        int array1[] = {4, 3, 7, 9, 2, 4, 8};
        int array2[] = {5, 1, 4, 8, 3};
        //finding common elements using HasSet class
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    hashSet.add(array1[i]);

                }

            }
        }
        for (int number : hashSet) {
            System.out.print(number + ",");
        }


    }
}
