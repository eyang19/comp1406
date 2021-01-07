package assign3;
//Base class for all products the store will sell
public class Product{
 private double price;
 private int stockQuantity;
 private int cartQuantity;
 private int soldQuantity;

 public Product(double initPrice, int initQuantity){
   price = initPrice;
   stockQuantity = initQuantity;
   soldQuantity = 0;
 }

    public int getStockQuantity(){
    return stockQuantity;
    }
    public int getCartQuantity(){
    return cartQuantity;
    }
    public int getSoldQuantity(){
    return soldQuantity;
    }
    public double getPrice(){
    return price;
    }

    public void setStockQuantity(int s){
        stockQuantity = s;
    }
    public void setCartQuantity(int c){
        cartQuantity = c;
    }

 public void setSoldQuantity(int newsoldQuantity){
     this.soldQuantity = newsoldQuantity;
 }

 //Returns the total revenue (price * amount) if there are at least amount items in stock
 //Return 0 otherwise (i.e., there is no sale completed)
 public double sellUnits(int amount){
   if(amount > 0){
     cartQuantity -= amount;
     soldQuantity += amount;
     return price * amount;
   }
   return 0.0;
 }
}
