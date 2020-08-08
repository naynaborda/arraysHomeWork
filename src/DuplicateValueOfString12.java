public class DuplicateValueOfString12 {
    // 12.WAP to find the duplicate values of an array of String values.
    public static void main(String[] args) {
        String array[] = {"pink","red","yellow","green","pink","Black","yellow"};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j] && (i != j)) {
                    System.out.println("Duplicate Values is:" + array[j]);
                }
            }

        }


    }
}
