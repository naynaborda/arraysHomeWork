public class RemoveDuplicateElement14 {
    //14.WAP to remove duplicate elements from an array.


    public static void removeDuplicate(int array[]) {
        // int array[] = {1, 2, 3,2, 7, 9, 12,7,65,32};
        int l = array.length;

        for (int i = 0; i < l; i++)
            System.out.print(array[i] + " ");
        System.out.println();
        for (int i = 0; i < l - 1; i++) {
            for (int j = i + 1; j < l; j++) {
                if (array[i] == array[j]) {
                    array[j] = array[l - 1];
                    l--;
                }

            }
        }
        System.out.println("New array without repetition: ");
        for (int i = 0; i < l; i++) {
            System.out.print(array[i] + " ");
        }


    }

    public static void main(String[] args) {
        removeDuplicate(new int[]{1, 2, 3, 2, 7, 9, 12, 7, 65, 32});

    }

}

