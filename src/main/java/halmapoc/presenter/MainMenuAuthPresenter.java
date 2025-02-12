package halmapoc.presenter;

import halmapoc.model.AppNameModel;
import halmapoc.view.GameRulesView;
import halmapoc.view.MainMenuAuthView;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainMenuAuthPresenter {
    private AppNameModel model;
    private MainMenuAuthView view;
    private Stage stage;

    public MainMenuAuthPresenter(AppNameModel appNameModel, MainMenuAuthView mainMenuAuthView, Stage stage) {
        this.model = appNameModel;
        this.view = mainMenuAuthView;
        this.stage = stage;

        addEventHandlers();
    }

    private void addEventHandlers() {
        view.getGamerules().setOnMouseClicked(_ -> {
            GameRulesView view = new GameRulesView(); //making new view
            Scene scene = new Scene(view); //making new scene
            scene.getStylesheets().add("/style/gamerules.css"); //binding css file
            new GameRulesPresenter(model, view, stage); //making new presenter
            stage.setScene(scene); //setting and showing new scene
        }); //changes the scene for the 'login scene'
    }
}
