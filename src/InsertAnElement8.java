public class InsertAnElement8 {
    //8.WAP to insert an element (specific position) into an array
    public static void main(String[] args) {
        int array[] = {10, 20, 30, 40, 50};

        int pos = 3;
        int element = 100;
        for (int i = array.length - 1; i > pos - 1; i--) {//i=4,4>2 ,i=3,3>2,i=2,2>2(false)
            array[i] = array[i - 1];//4=3,3=2
        }
        //insert element at 3rd position
        array[pos - 1] = element;//(3-1)=2=100 that is index of position 2
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
