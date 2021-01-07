public class Laptop extends Product{
    private double cpuSpeed;
    private int ram;
    private boolean ssd;
    private int storage;
    private double screenSize;

    Laptop(double p, int q, double c, int r, boolean s, int t, double z ){
        super(p,q);
        cpuSpeed = c;
        ram = r;
        ssd = s;
        storage = t;
        screenSize = z;
    }

    public String toString(){
        String p = Double.toString(this.getPrice());
        String q = Integer.toString(this.getStockQuantity());
        String i  = Integer.toString(this.getSoldQuantity());
        String x = " ";
        if(ssd == true){
            x = "SSD";
        }else{
            x = "HDD";
        }

        return screenSize + " inch Laptop PC with " + cpuSpeed + "ghz CPU, "+ ram +"GB RAM, "+ storage + "GB " + x + " drive. "+ "(" + p +" dollars each, " + q + " in stock, " + i +" sold)" ;
    }

}
