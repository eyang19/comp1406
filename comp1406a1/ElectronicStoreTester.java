import java.util.Scanner;
public class ElectronicStoreTester {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        //instantiating the variable myStore with a new ElectronicStore called The Store
        ElectronicStore myStore = new ElectronicStore("The Store");

        //physically prints stock
        System.out.println("The store stock includes: ");
        myStore.printStock();
        System.out.println("");


        //searching inventory for user's item
        boolean quit = false;
        boolean uiFound;
        while(quit == false) {
            System.out.print(" Enter a term to search for: ");
            String userInput = in.nextLine();

            if (userInput.toLowerCase().equals("quit")) {
                quit = true;
                continue;
            }

            uiFound = myStore.searchStock(userInput);
            if (uiFound == true) {
                System.out.println(" A matching item is contained in the store's stock. ");
            } else {
                System.out.println(" No items in the store's stock match that term.");
            }
        }

    }

}
