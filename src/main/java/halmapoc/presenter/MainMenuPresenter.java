package halmapoc.presenter;

import halmapoc.model.AppNameModel;
import halmapoc.view.GameRulesView;
import halmapoc.view.LoginView;
import halmapoc.view.MainMenuView;
import halmapoc.view.RegisterView;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainMenuPresenter {
    private AppNameModel model;
    private MainMenuView view;
    private Stage stage;

    public MainMenuPresenter(AppNameModel model, MainMenuView view, Stage stage) {
        this.model = model;
        this.view = view;
        this.stage = stage;

        addEventHandlers();
        updateView();
    }
    private void addEventHandlers() {
        view.getLogin().setOnMouseClicked(_ -> {
            LoginView view = new LoginView(); //making new view
            Scene scene = new Scene(view); //making new scene
            scene.getStylesheets().add("/style/login.css"); //binding css file
            new LoginPresenter(model, view, stage); //making new presenter
            stage.setScene(scene); //setting and showing new scene
        }); //changes the scene for the 'login scene'

        view.getRegister().setOnMouseClicked(_ -> {
            RegisterView view = new RegisterView();
            Scene scene = new Scene(view);
            scene.getStylesheets().add("/style/login.css");
            new RegisterPresenter(model, view, stage);
            stage.setScene(scene);
        });

        view.getGamerules().setOnMouseClicked(_ -> {
            GameRulesView view = new GameRulesView(); //making new view
            Scene scene = new Scene(view); //making new scene
            scene.getStylesheets().add("/style/gamerules.css"); //binding css file
            new GameRulesPresenter(model, view, stage); //making new presenter
            stage.setScene(scene); //setting and showing new scene
        });

        view.getExit().setOnMouseClicked(_ -> {
            System.exit(0);
        });
    }
    private void updateView() {
        // fills the view with model data
    }
}
