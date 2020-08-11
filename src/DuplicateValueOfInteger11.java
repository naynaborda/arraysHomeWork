public class DuplicateValueOfInteger11 {
    //11.WAP to find the duplicate values of an array of integer values.

    public static void main(String[] args) {
        int array[] = {12, 24, 36, 48, 60, 24, 12, 72,12};

        for (int i = 0; i < array.length - 1; i++) {//0<7,1<7,2<7,3<7,4<7
            for (int j = i + 1; j < array.length; j++) {//j=1 1<7,j=2 2<7,j=3 3<7,j=4 4<7,j=5 5<7
                if (array[i] == array[j] && (i != j)) {//12==24, 12==36,12==48,12==60,12==24,12==12
                    System.out.println("Duplicate Values is:" + array[j]);
                }
            }

        }

    }
}

