public class Store {
    private static final int MAX_CUSTOMERS = 500;
    private static int LATEST_ID = 100000;
    private String name;
    private Customer[] customers;
    private int customerCount;

    public Store(String n) {
        name = n;
        customers = new Customer[MAX_CUSTOMERS];
        customerCount = 0;

    }

    public void addCustomer(Customer c) {
        c.setId(LATEST_ID++) ;
        if (customerCount < MAX_CUSTOMERS)
            customers[customerCount++] = c;

    }

    public void listCustomers() {
        for (int i = 0; i < customerCount; i++)
            System.out.println(customers[i]);
    }

    public int averageCustomerAge() {
        int total = 0;
        for (int i = 0; i < customerCount; i++) {
                total += customers[i].getAge();
            }
        return total/customerCount;
    }
    public Customer richestCustomer(){
        Customer richest = customers[0];
        for(int i = 0; i < customerCount; i++){
            if(customers[i].hasMoreMoneyThan(richest)){
                richest = customers[i];
            }
        }
        return richest;
    }
   /* public float rob(Customer c){
        for(int i = 0; i<customerCount; i++){
            customers[i].money = 0;
            c.money = customers[i].money;
        }
        return c.money;
    }*/
   public Customer[] getCustomers() {
       return customers;
   }
    public int getCustomerCount() {
        return customerCount;
    }

}
