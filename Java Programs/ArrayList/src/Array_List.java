import java.util.ArrayList;
public class Array_List {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addItem(String item){

        groceryList.add(item);
    }

    public int size(){
        return groceryList.size();
    }

    public void getAllItem(){

        System.out.println("Grocery list contains " + size() + " elements :");
        for(int i = 0;i<groceryList.size();i++){
            System.out.println(groceryList.get(i));
        }

    }

    public void replaceItem(String item){
        int position = findItem(item);
        if(position >= 0){
            replaceItem(position,item);

        }
    }

    private void replaceItem(int position,String item){

        groceryList.set(position,item);
        System.out.println("Item is replaced");
    }

    public void removeItem(String item){
        int position = findItem(item);
        if(position >= 0){
            removeItem(position);

        }
    }

    private void removeItem(int position){
        groceryList.remove(position);
        System.out.println("Item at " + position + " position is removed");
    }

    public int findItem(String searchItem){
        return groceryList.indexOf(searchItem);

    }
}

