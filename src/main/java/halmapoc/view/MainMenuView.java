package halmapoc.view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class MainMenuView extends BorderPane {
    private ImageView imageView;
    private Image image;
    private VBox vBox;
    private HBox hBox;

    public Button getLogin() {
        return login;
    }

    public Button getRegister() {
        return register;
    }

    public Button getGamerules() {
        return gamerules;
    }

    public Button getExit() {
        return exit;
    }

    private Button login;
    private Button register;
    private Button gamerules;
    private Button exit;
    // private Node attributes (controls)
    public MainMenuView() {
        initialiseNodes();
        layoutNodes();
    }
    private void initialiseNodes() {
        imageView = new ImageView();
        image = new Image("/logo_ribbon.png");
        vBox = new VBox();
        hBox = new HBox();
        login = new Button("Login");
        register = new Button("Register");
        gamerules = new Button("Gamerules");
        exit = new Button("Exit");
    }

    private void layoutNodes() {
        this.setId("MainMenuView");

        setTop(hBox);
        hBox.getChildren().add(imageView);
        hBox.setAlignment(Pos.CENTER);

        imageView.setId("imageView");
        imageView.setImage(image);

        vBox.setId("vbox");
        vBox.getChildren().addAll(login, register, gamerules, exit);
        setCenter(vBox);
        vBox.setAlignment(Pos.CENTER);

        login.setId("login");
        register.setId("register");
        gamerules.setId("gamerules");
        exit.setId("exit");
    }


}
