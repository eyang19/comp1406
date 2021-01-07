public class Fridge extends Product {
    private int wattage;
    private String color;
    private String brand;
    private double cubicFeet;
    private boolean hasFreezer;

    Fridge(double p, int q, int w, String c, String b, double f, boolean h){
        super(p,q);
        wattage = w;
        color = c;
        brand = b;
        cubicFeet = f;
        hasFreezer = h;
    }

    public String toString(){
        String p = Double.toString(this.getPrice());
        String q = Integer.toString(this.getStockQuantity());
        String i  = Integer.toString(this.getSoldQuantity());
        return cubicFeet +" cu. ft. "+ brand+ " Fridge " + "("+ color + ", " +wattage + " watts) (" +p+" dollars each, " + q+" in stock, " + i +" sold"+")";
    }
}
