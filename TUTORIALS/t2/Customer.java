public class Customer {
    String name;
    int age;
    float money;
    boolean admitted;


    public Customer(String initName) {
        name = initName;
        age = 0;
        money = 0.0f;
        admitted = false;
    }

    public Customer(String initName, int initAge) {
        name = initName;
        age = initAge;
        money = 0.0f;
        admitted = false;
    }

    public Customer(String initName, int initAge, float initMoney) {
        name = initName;
        age = initAge;
        money = initMoney;
        admitted = false;
    }

    public Customer() {
        name = "null";
        age = 0;
        money = 0.0f;
        admitted = false;
    }

    public float computeFee() {
        if (age >= 18 && age < 65) {
            return 12.75f;
        } else if (age <= 3) {
            return 0;
        } else if (age >= 65) {
            return 6.375f;
        } else {
            return 8.50f;
        }
    }

    public boolean spend(float amount) {
        if (money >= amount && amount >= 0) {
            money = money - amount;
            return true;
        }
        return false;
    }

    public boolean hasMoreMoneyThan(Customer c) {
        if (this.money > c.money) {
            return true;
        }
        return false;
    }

    public void payAdmission() {
        if (spend(computeFee())) {
            admitted = true;
        }
    }

    public String toString() {
        if (admitted == true) {
            return "Customer " + name + ":  " + age + "years old with $" + money + " who has been admitted";
        }
        return "Customer " + name + ":  " + age + "years old with $" + money + " who has not been admitted";
    }
}
