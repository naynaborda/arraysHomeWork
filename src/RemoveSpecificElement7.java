public class RemoveSpecificElement7 {
    //7.WAP to remove a specific element  from an array
    public static void main(String[] args) {
        int array[] = {10, 40, 30, 80, 60, 20};
        int remove = 40;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (remove == array[i]) {
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
                count = count + 1;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element removed successfully");
            for (int i = 0; i < array.length - 1; i++) {
                System.out.print(array[i] + " ");
            }
        }

    }
}
