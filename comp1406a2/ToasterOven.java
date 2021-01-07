public class ToasterOven extends Product{
    private int wattage;
    private String color;
    private String brand;
    private int width;
    private boolean convection;

    ToasterOven(double p, int q, int w, String c, String b, int i, boolean o){
        super(p,q);
        wattage = w;
        color = c;
        brand = b;
        width = i;
        convection = o;
    }
    public String toString(){
        String p = Double.toString(this.getPrice());
        String q = Integer.toString(this.getStockQuantity());
        String i  = Integer.toString(this.getSoldQuantity());
        String z = " ";
        if(convection == true){
            z = "with convection";
        }else{
            z= "";
        }
        return width + " inch " + brand + " Toaster "+ z + " (" + color +", "+ wattage + " watts"+")"+ "   "+"("+ p +" dollars each, "+ q+ " in stock, " + i +" sold" +")";
    }
}
