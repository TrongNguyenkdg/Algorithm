package halmapoc.view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MainMenuAuthView extends BorderPane {
    private ImageView imageView;
    private Image image;
    private VBox vBox;
    private HBox hBox;
    private Button login;
    private Button register;
    private Button gamerules;
    private Button exit;

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

    public MainMenuAuthView() {
        initialiseNodes();
        layoutNodes();
    }
    private void initialiseNodes() {
        imageView = new ImageView();
        image = new Image("/logo_ribbon.png");
        vBox = new VBox();
        hBox = new HBox();
        login = new Button("Start");
        register = new Button("Leaderboard");
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

        login.setId("login"); //this ids need to be changed, also need to create a new .css file for them
        register.setId("register");
        gamerules.setId("gamerules");
        exit.setId("exit");
    }
}
