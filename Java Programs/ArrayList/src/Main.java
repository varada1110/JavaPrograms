import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);

    private static Array_List groceryList = new Array_List();
    public static void main(String[] args) {
        boolean quit = false;

        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice: " );
            choice = s.nextInt();
            s.nextLine();

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }



    public static void printInstructions(){
        System.out.println(" 0 . Print all instructions \n");
        System.out.println(" 1 . Print all items of grocery list \n");
        System.out.println(" 2 . Add new item \n");
        System.out.println(" 3 . Modify an item \n");
        System.out.println(" 4 . Remove an item \n");
        System.out.println(" 5 . Search an item \n");

    }

    private static void printGroceryList(){
        groceryList.getAllItem();
    }

    public static void addItem(){
        System.out.println("enter a grocery item:");

        String itemName = s.nextLine();
        groceryList.addItem(itemName);
    }

    public static void modifyItem(){
        System.out.println("Enter position of item :");
        int position = s.nextInt();
        s.nextLine();
        System.out.println("Enter item name :");
        String item = s.nextLine();
        groceryList.replaceItem(position,item);
    }

    public static void removeItem(){

        int position = s.nextInt();
        groceryList.removeItem(position);
    }

    public static void searchForItem(){
        String item = s.nextLine();
        groceryList.findItem(item);
    }
}