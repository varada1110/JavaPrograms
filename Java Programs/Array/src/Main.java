import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] intArray = new int[10];
        printArray(intArray);

        int number = lengthOfArray();
        int[] IntegerArray = getIntegers(number);
        for(int i=0;i<IntegerArray.length;i++){

            System.out.println("Element at " + i + " position is " + IntegerArray[i]);
        }
    }

    public static void printArray(int[] array){
        for(int i = 0; i<array.length; i++){
            array[i] = i*10;

            System.out.println("Element at " + i + " position is " + array[i]);
        }

    }

    public static int lengthOfArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array");
        int number = scanner.nextInt();
        return number;
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer elements \r" );
        int[] array = new int[number];

        for(int i = 0; i<array.length; i++){
            array[i] = scanner.nextInt();

        }
        return array;
    }


}