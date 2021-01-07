package assign3;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.layout.Pane;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.scene.control.Button;

public class ElectronicStoreApp extends Application {
    private ElectronicStore model;
    private ElectronicStoreView view;

    public void start(Stage primaryStage){

        model = ElectronicStore.createStore();
        view = new ElectronicStoreView(model);

        //plug in event handler
       view.getB().setOnAction(new EventHandler<ActionEvent>() {
           public void handle(ActionEvent actionEvent) { handleBPress(); } });
       view.getC().setOnAction(new EventHandler<ActionEvent>() {
           public void handle(ActionEvent actionEvent) {handleCPress(); }});
       view.getD().setOnAction(new EventHandler<ActionEvent>() {
           public void handle(ActionEvent actionEvent) {handleDPress(); }});
       view.getE().setOnAction(new EventHandler<ActionEvent>() {
           public void handle(ActionEvent actionEvent) {handleEPress(); }});

       view.getStockList().setOnMousePressed(new EventHandler<MouseEvent>() {
           @Override
           public void handle(MouseEvent mouseEvent) {
               handleStockList();;

           }
       });
       view.getCartList().setOnMousePressed(new EventHandler<MouseEvent>() {
           @Override
           public void handle(MouseEvent mouseEvent) {
               handleCartList();;

           }
       });




        primaryStage.setTitle("Electronic Store Application - " + model.getName());
        primaryStage.setScene(new Scene(view, 800, 400));
        primaryStage.show();
    }

    private void handleBPress(){
        model = ElectronicStore.createStore();
        view.resetStore(model);
        view.update();
        }

    private void handleCPress() {
        int index = view.getStockList().getSelectionModel().getSelectedIndex();
        if (index >= 0) {
            model.addProductToCart(index);
            view.update();
        }
    }

    private void handleDPress () {
        int index = view.getCartList().getSelectionModel().getSelectedIndex();
        if (index >= 0) {
            model.removeProductCart(index);
            view.update();
        }
    }


    private void handleEPress () {
        //sell items
        model.sellProducts();
        //# sales ++
        model.incrementNumSales();

        model.resetCart();
        view.update();
    }
    private void handleStockList () {
        view.getC().setDisable(view.getStockList().getSelectionModel().getSelectedIndex() < 0);

    }
    private void handleCartList() {
        view.getD().setDisable(view.getCartList().getSelectionModel().getSelectedIndex() < 0);

    }



    public static void main(String[] args) { launch(args); }

}
