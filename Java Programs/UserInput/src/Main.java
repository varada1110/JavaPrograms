import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 numbers :");
        boolean hasNextInt = scanner.hasNextInt();
        int sum = 0;
        if (hasNextInt){

            for(int i = 1;i<=10;i++){
                int num = scanner.nextInt();
                scanner.nextLine();
                sum = sum + num;
            }
            System.out.println("Sum of entered numbers = "+sum);

        }
        else {
            System.out.println("Invalid Value");
        }

        scanner.close();
    }

}