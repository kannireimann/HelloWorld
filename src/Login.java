import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 * Created by Kanni on 28.10.2016.
 */
public class Login extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox vbox = new VBox();
        Scene login = new Scene(vbox, 300, 150);
        primaryStage.setScene(login);
        primaryStage.show();

        Label username = new Label("Username");
        TextField usernameField = new TextField();
        Label password = new Label("Password");
        TextField passwordField = new TextField();
        Button submit = new Button("Login");

        vbox.getChildren().addAll(username, usernameField, password, passwordField, submit);

        submit.setOnAction(event -> {
            String parool = passwordField.getText();
            if (parool.equals("qwerty123456")){
                System.out.println("Correct password");
            } else {
                System.out.println("Incorrect password");
            }
        });

    }
}
