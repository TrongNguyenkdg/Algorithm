package halmapoc.presenter;

import halmapoc.model.AppNameModel;
import halmapoc.view.LoginView;
import halmapoc.view.MainMenuAuthView;
import halmapoc.view.RegisterView;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginPresenter {
    private AppNameModel model;
    private LoginView view;
    private Stage stage;

    public LoginPresenter(AppNameModel appNameModel, LoginView loginView, Stage stage) {
        this.model = appNameModel;
        this.view = loginView;
        this.stage = stage;

        addEventHandlers();
    }

    private void addEventHandlers() {
        view.getLogin().setOnMouseClicked(event -> {
            MainMenuAuthView view = new MainMenuAuthView();
            Scene scene = new Scene(view);
            scene.getStylesheets().add("/style/mainmenu.css");
            new MainMenuAuthPresenter(model, view, stage);
            stage.setScene(scene);
        });

        view.getRegister().setOnMouseClicked(event -> {
            RegisterView view = new RegisterView();
            Scene scene = new Scene(view);
            scene.getStylesheets().add("/style/login.css");
            new RegisterPresenter(model, view, stage);
            stage.setScene(scene);
        });
    }
}
