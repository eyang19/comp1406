public class Mall {
    public static final int MAX_STORES = 100;
    private String name;
    private Store[] stores;
    private int storeCount;
    public Mall(String n) {
        name = n;
        stores = new Store[MAX_STORES];
        storeCount = 0;
    }
    public void addStore(Store s) {
        if (storeCount < MAX_STORES) {
            stores[storeCount++] = s;
        }
    }
    public boolean shoppedAtSameStore(Customer c1, Customer c2){
        for(int i = 0; i < storeCount; i++){
            Customer[] temp = stores[i].getCustomers();
            boolean didC1 = false;
            boolean didC2 = false;
            for(int j = 0; j < temp.length; j++){
                if(temp[j] == c1){
                    didC1 = true;
                }
                if(temp[j] == c2){
                    didC2 = true;
                }
            }
            if(didC1 && didC2){
                return true;
            }
        }
        return false;
    }
}
