public class Fridge {
    //attributes
    double fridgeSize;
    boolean fridgeType;
    String colour;

    //constructor
    public Fridge(double newfridgeSize, boolean newFridgetype, String newColour) {
        fridgeSize = newfridgeSize;
        fridgeType = newFridgetype;
        colour = newColour;


    }
    public String toString() {
        String freezerType = " ";
        if (fridgeType == true) {
            freezerType = "with Freezer";
        } else {
            freezerType = " ";
        }
        String fridgeString = fridgeSize + " cu. ft. Fridge " + freezerType +" " +"("+ colour+")";
        return fridgeString;
    }
    }
