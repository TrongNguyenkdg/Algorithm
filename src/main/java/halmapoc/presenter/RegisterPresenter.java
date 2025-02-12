package halmapoc.presenter;

import halmapoc.model.AppNameModel;
import halmapoc.view.LoginView;
import halmapoc.view.MainMenuAuthView;
import halmapoc.view.RegisterView;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RegisterPresenter {
    private AppNameModel model;
    private RegisterView view;
    private Stage stage;

    public RegisterPresenter(AppNameModel appNameModel, RegisterView registerView, Stage stage) {
        this.model = appNameModel;
        this.view = registerView;
        this.stage = stage;

        addEventHandlers();
    }

    private void addEventHandlers() {
        view.getRegister().setOnMouseClicked(event -> {
            MainMenuAuthView view = new MainMenuAuthView();
            Scene scene = new Scene(view);
            scene.getStylesheets().add("/style/mainmenu.css");
            new MainMenuAuthPresenter(model, view, stage);
            stage.setScene(scene);
        });

        view.getLogin().setOnMouseClicked(_ -> {
            LoginView view = new LoginView(); //making new view
            Scene scene = new Scene(view); //making new scene
            scene.getStylesheets().add("/style/login.css"); //binding css file
            new LoginPresenter(model, view, stage); //making new presenter
            stage.setScene(scene); //setting and showing new scene
        }); //changes the scene for the 'login scene'
    }
}
