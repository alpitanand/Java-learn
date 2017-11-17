/**
 * Created by Alpit on 28-11-2016.
 */

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.Objects;

public class Register
{
    String name1,word1;
    public static void read()
    {
        Register reg = new Register();
        int n=0;
        Stage window = new Stage();
        Scene scene;
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle("Store your information");
        GridPane al = new GridPane();
        al.setPadding(new Insets(10,10,10,10));
        al.setHgap(10);
        al.setVgap(8);

        Label user = new Label("Enter your username :");
        GridPane.setConstraints(user,0,0);

        TextField text = new TextField();
        GridPane.setConstraints(text,1,0);

        Label pass = new Label("Enter your desired password :");
        GridPane.setConstraints(pass,0,1);

        TextField text1 = new TextField();
        GridPane.setConstraints(text1,1,1);

        ArrayList<String> name = new ArrayList<String>();
        ArrayList<String> word = new ArrayList<String>();






        Button save = new Button("Save");
        save.setOnAction(e ->
        {
            try {
                 OutputStream details = new FileOutputStream(  "alpit.txt" ) ;



                     reg.name1=user.getText();
                     reg.word1=pass.getText();

                     name.add(reg.name1);
                     word.add(reg.word1);



                 }


                  catch (FileNotFoundException e1)
            {

            }
                catch (NumberFormatException e1) {

                 System.out.print("Can print only no");
            }
                 catch (IOException e1)
            {
                e1.printStackTrace();
            }


        } );
        GridPane.setConstraints(save,2,1);

        al.getChildren().addAll(user,text,text1,pass,save);
        scene = new Scene(al,400,300);
        window.setScene(scene);
        window.showAndWait();
Check.pass(name,word);
    }


}