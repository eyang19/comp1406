public class ElectronicStore {
    String name;
    Desktop desktopArray[];
    Laptop laptopArray[];
    Fridge fridgeArray[];

    public ElectronicStore(String newName) {
        name = newName;

        Desktop d1 = new Desktop(3.5, 8, 500, false);
        Desktop d2 = new Desktop(3.0, 16, 250, true);
        Desktop d3 = new Desktop(4.3, 32, 500, true);
        Laptop l1 = new Laptop(3.1, 32, 500, true, 15);
        Laptop l2 = new Laptop(2.5, 8, 250, false, 13);
        Laptop l3 = new Laptop(3.0, 16, 250, true, 15);
        Fridge f1 = new Fridge(16.5, true, "Black");
        Fridge f2 = new Fridge(12.0, false, "White");
        Fridge f3 = new Fridge(23.0, true, "Stainless Steel");

        desktopArray = new Desktop[]{d1, d2, d3};
        laptopArray = new Laptop[]{l1, l2, l3};
        fridgeArray = new Fridge[]{f1, f2, f3};
    }

    public void printStock() {
        for (int i = 0; i < 3; i++) {
            System.out.println(desktopArray[i]);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(laptopArray[i]);
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(fridgeArray[i]);
        }
    }

    public boolean searchStock(String searchItem) {
        boolean found = false;
        String searchString;
        searchItem = searchItem.toLowerCase();
        for (int i = 0; i < 3; i++) {
            searchString = desktopArray[i].toString().toLowerCase();
            found = searchString.contains(searchItem);
            if(found == true){
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            searchString = laptopArray[i].toString().toLowerCase();
            found = searchString.contains(searchItem);
            if(found == true){
                return true;
            }
        }
        for (int i = 0; i < 3; i++) {
            searchString = fridgeArray[i].toString().toLowerCase();
            found = searchString.contains(searchItem);
            if(found == true){
                return true;
            }
        }
        return found;
    }




}
