public class Desktop {
    //attributes
    double cpuSpeed;
    int ram;
    int storage;
    boolean storageType;

    //constructor
    public Desktop(double newCPUSpeed,int newRam,int newStorage,boolean newStoragetype){
        cpuSpeed = newCPUSpeed;
        ram = newRam;
        storage = newStorage;
        storageType = newStoragetype;

    }
//overriding toString method from stringPackage
    public String toString(){
        String diskType = "";
        if(storageType == true) { diskType = "SSD"; }
        else{ diskType = "HDD"; }
        String desktopString = "Desktop PC with " + cpuSpeed + "ghz CPU, " + ram + "GB RAM, " + storage + "GB "+diskType+" drive";
        return desktopString;
    }

}
