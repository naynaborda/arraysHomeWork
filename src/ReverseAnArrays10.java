import java.util.Scanner;

public class ReverseAnArrays10 {
    //10.WAP to reverse an array of integer values.
    public static void main(String[] args) {
        //Create scanner object for taking input from console.
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        //Capturing the number of elements in to number
        int number =scanner.nextInt();
        int array[]=new int[number];
        //Read the elements in to array
        System.out.print("Enter the elements number: " );
        for(int i=0;i<number;i++){
            array[i]=scanner.nextInt();
        }
        System.out.println("Printing the reverse elements in the array");
        for(int i=array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }


    }
}
