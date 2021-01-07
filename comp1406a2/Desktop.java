public class Desktop extends Product{
    private double cpuSpeed;
    private int ram;
    private boolean ssd;
    private int storage;
    private String profile;

    Desktop(double p, int q, double c, int r, boolean s,int t, String o){
        super(p, q);
        cpuSpeed = c;
        ram =r;
        ssd =s;
        storage = t;
        profile = o;
    }

    public String toString(){
        String p = Double.toString(this.getPrice());
        String q = Integer.toString(this.getStockQuantity());
        String i  = Integer.toString(this.getSoldQuantity());
        String x = "";
                    if(ssd == true){
                        x = "SSD";
                    }else{
                        x = "HDD";
                    }

        return profile + " Desktop PC with " + cpuSpeed + "ghz CPU, "+ ram + "GB RAM, "+ storage + "GB " + x +" drive. "+ "(" + p + " dollars each, " + q +" in stock, " + i + " sold" +")" ;
    }


}
