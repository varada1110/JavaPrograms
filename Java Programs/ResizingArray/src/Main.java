import java.util.Scanner;

public class Main {

    private static int[] array = new int[5];
    private static Scanner s = new Scanner(System.in);


    public static void main(String[] args) {

        System.out.println("Enter 5 integers:");
        getInput();
        printArray(array);
        resizeArray();
      //  System.out.println("Enter 7 integers:");
      //  getInput();
        array[5] = 9;
        array[6] = 7;
        printArray(array);


    }


    public static void getInput(){
        for(int i = 0; i < array.length; i++ ){
            array[i] = s.nextInt();
        }
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++ ){
            System.out.println(array[i]);
        }

    }

    public static void resizeArray(){
        int[] org = array;
        array = new int[7];
        for (int i = 0;i<org.length;i++){
            array[i] = org[i];
        }
    }
}