package assign3;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.Scene;

public class ElectronicStoreView extends Pane {
   private ElectronicStore model; //model which view is attached

   private Label l7;
   private Button b; //interface components
   private Button c;
   private Button d;
   private Button e;
   private TextField newItemField2;
   private TextField newItemField;
   private TextField newItemField1;
   private ListView<String> stockList;
   private ListView<String> mostPopularList;
   private ListView<String> cartList;

    public ElectronicStoreView(ElectronicStore es) {
        model = es;

        Label l1 = new Label("Store Summary:");
        l1.relocate(70, 50);
        Label l2 = new Label("#Sales:");
        l2.relocate(50, 73);
        Label l3 = new Label("Revenue:");
        l3.relocate(40, 100);
        Label l4 = new Label("$/Sale:");
        l4.relocate(50, 130);
        Label l5 = new Label("Most Popular Items:");
        l5.relocate(50, 180);
        Label l6 = new Label("Store Stock:");
        l6.relocate(300, 50);
        l7 = new Label("Current Cart:");
        l7.relocate(600, 50);


        b = new Button("Reset Store");
        b.setDisable(false);
        b.relocate(25, 335);
        b.setPrefSize(125, 50);
        c = new Button("Add to Cart");
        c.setDisable(true);
        c.relocate(250, 335);
        c.setPrefSize(125, 50);
        d = new Button("Remove from Cart");
        d.setDisable(true);
        d.relocate(500, 335);
        d.setPrefSize(125, 50);
        e = new Button("Complete Sale");
        e.setDisable(true);
        e.relocate(630, 335);
        e.setPrefSize(125, 50);



        // these are the fields for the main application window
        newItemField2 = new TextField();
        newItemField2.relocate(90, 72);
        newItemField2.setPrefSize(90, 25);
        newItemField2.setText("0");
        newItemField = new TextField();
        newItemField.relocate(90, 128);
        newItemField.setPrefSize(90, 25);
        newItemField.setText("N/A");
        newItemField1 = new TextField();
        newItemField1.relocate(90, 100);
        newItemField1.setPrefSize(90, 25);
        newItemField1.setText(Double.toString(model.getRevenue()));

        stockList = new ListView<String>();
        ObservableList<String> list = FXCollections.observableArrayList(model.getStockString());
        stockList.setItems(list);
        stockList.relocate(200, 68);
        stockList.setPrefSize(270, 250);

        mostPopularList = new ListView<String>();
        ObservableList<String> list1 = FXCollections.observableArrayList(model.getMostPopular());
        mostPopularList.setItems(list1);
        mostPopularList.relocate(20, 200);
        mostPopularList.setPrefSize(160, 120);

        cartList = new ListView<String>();
        ObservableList<String> list2 = FXCollections.observableArrayList();
        cartList.setItems(list2);
        cartList.relocate(500, 68);
        cartList.setPrefSize(270, 250);

        // adds all the labels
        getChildren().addAll(l1, l2, l3, l4, l5, l6, l7);

        getChildren().add(b);
        getChildren().add(c);
        getChildren().add(d);
        getChildren().add(e);
        getChildren().add(newItemField);
        getChildren().add(newItemField1);
        getChildren().add(newItemField2);


        getChildren().add(stockList);
        getChildren().add(mostPopularList);
        getChildren().add(cartList);
    }

   public Button getB(){return b;} //getters for components
   public Button getC(){return c;}
   public Button getD(){return d;}
   public Button getE(){return e;}
   public TextField getNewItemField2(){return newItemField2;}
   public TextField getNewItemField(){return newItemField;}
   public TextField getNewItemField1(){return newItemField1;}


   public ListView<String> getStockList() { return stockList; }
   public ListView<String> getMostPopularList() { return mostPopularList; }
   public ListView<String> getCartList() { return cartList; }

    public void resetStore(ElectronicStore es){
        this.model=es;
        newItemField.setText("N/A");
    }

    public void update(){
        // Create and return a new array with the
        // exact size of the number of items in it
        stockList.setItems(FXCollections.observableArrayList(model.getStockString()));
        mostPopularList.setItems(FXCollections.observableArrayList(model.getMostPopular()));
        cartList.setItems(FXCollections.observableArrayList(model.getCartString()));

        // updates labels
        newItemField2.setText(Integer.toString(model.getNumSales()));
        newItemField1.setText(Double.toString(model.getRevenue()));
        if(model.getNumSales() > 0 ) {
            newItemField.setText(Double.toString(model.getRevenue() / model.getNumSales()));
        }
        l7.setText("Current Cart: (" + model.getCartMoney() + ")");

        c.setDisable(stockList.getSelectionModel().getSelectedIndex() < 0);
        d.setDisable(cartList.getSelectionModel().getSelectedIndex() < 0);
        e.setDisable(model.getCartCurProd() <= 0);

        model.printStock();
    }

}
