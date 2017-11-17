import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

import javafx.stage.Stage;


/**
 *
 * @author Alpit
 */
public class array extends Application{

    Stage window;
    Scene scene;
    public static void main(String[] args)
    {
        launch(args);
    }



    @Override
    public void start(Stage primaryStage) throws Exception
    {
        window= primaryStage;
        window.setTitle("Alpit");



        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        Label label = new Label("Username");
        GridPane.setConstraints(label,0,0);

        TextField User = new TextField();
        User.setPromptText("Username :");

        GridPane.setConstraints(User,1,0);

        Label label1 = new Label("Password :");
        GridPane.setConstraints(label1,0,1);

        TextField pass = new TextField();
        pass.setPromptText("Password");
        GridPane.setConstraints(pass,1,1);

        Button Login= new Button("Login");
        GridPane.setConstraints(Login,1,2);

         Button Register = new Button("Register");
       Register.setOnAction(e -> register.read());

        GridPane.setConstraints(Register,1,3);
        grid.getChildren().addAll(User,label,label1,pass,Login,Register);


        Scene scean = new Scene(grid, 300, 200);
        window.setScene(scean);
        window.show();





    }

}
