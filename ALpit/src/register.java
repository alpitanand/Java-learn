/**
 * Created by Alpit on 28-11-2016.
 */

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class register
{
public static void read()
{
    Stage window = new Stage();
    Scene scene;
window.initModality(Modality.APPLICATION_MODAL);
window.setTitle("Store your information");
    GridPane al = new GridPane();
    al.setPadding(new Insets(10,10,10,10));
    al.setHgap(10);
    al.setVgap(8);

    Label user = new Label("Enter your username");
       GridPane.setConstraints(user,0,0);

    TextField text = new TextField();
    GridPane.setConstraints(text,1,0);
    al.getChildren().addAll(user);

}


}
