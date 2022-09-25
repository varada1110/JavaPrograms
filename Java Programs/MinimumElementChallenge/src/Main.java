import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter no of integers\r");
        int count = scanner.nextInt();
        int[] array = readIntegers(count);
        System.out.println(findMin(array));
    }

    public static int[] readIntegers(int count){
        System.out.println("Enter " + count + " integers \r");
        int[] array = new int[count];
        for(int i = 0; i<array.length;i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array){

        int min = array[0];
        for(int i = 1; i<array.length;i++){
            if(min>array[i]){
                min = array[i];

            }

        }

    return min;
    }

}