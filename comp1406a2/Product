public abstract class Product {
     private double price;
     private int stockQuantity;
     private int soldQuantity;

     public Product(double p, int q){
         price = p;
         stockQuantity = q;
         soldQuantity = 0;
     }

     public double sellUnits(int amount){
         if(stockQuantity >= amount){
             stockQuantity -= amount;
             soldQuantity += amount;
             return (amount * price);
         }else{ return 0.0; }
     }

     protected double getPrice(){
         return price;
     }
     protected int getStockQuantity(){ return stockQuantity;}
     protected int getSoldQuantity(){ return soldQuantity; }


}
