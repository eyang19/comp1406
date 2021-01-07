import java.util.Scanner;
public class ElectronicStore {

    final int MAX_PRODUCTS = 10;
    String name;
    double revenue;
    Product[] products;

    public ElectronicStore(String n){
        name = n;
        revenue = 0.0;
        products = new Product[MAX_PRODUCTS];
    }

    public String getName(){ return name; }
    public double getRevenue(){ return revenue; }

    public boolean addProduct(Product p){
        for(int i=0; i<MAX_PRODUCTS; i++){
            if(products[i] == null){
                products[i] = p;
                return true;
            }
        }
        return false;
    }

    public void sellProducts(){
        Scanner scan = new Scanner(System.in);
        int item = scan.nextInt();
        int amount = scan.nextInt();
        this.sellProducts(item, amount);
    }

    public void sellProducts(int item, int amount) {
        if (amount > 0) {
            if (item < 10 && item >= 0) {
                if (products[item] != null) {
                    revenue += products[item].sellUnits(amount);
                }
            }
        }
    }

    public void printStock(){
        for(int i=0; i<MAX_PRODUCTS; i++) {
            if (products[i] != null) {
                System.out.println(i +". " + products[i]);
            }
        }
    }



}
