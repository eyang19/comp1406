public class Laptop {
    //attributes
    double cpuSpeed;
    int ram;
    int storage;
    boolean storageType;
    int screenSize;
    //constructors
    public Laptop(double newCPUSpeed, int newRam, int newStorage, boolean newStoragetype, int newScreensize ){
        cpuSpeed = newCPUSpeed;
        ram = newRam;
        storage = newStorage;
        storageType = newStoragetype;
        screenSize = newScreensize;

    }
    //methods
    //overiding toString method from external package
    public String toString(){
        String diskType = " ";
        if(storageType == true){
            diskType = "SSD";
        }else{diskType = "HDD";}
        String laptopString = screenSize +"''" + " Laptop PC with " + cpuSpeed + "ghz CPU, "+ ram + "GB RAM, " + storage + "GB " + diskType + " drive";
        return laptopString;
    }


}
