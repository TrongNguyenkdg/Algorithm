package halmapoc.presenter;

import halmapoc.model.AppNameModel;
import halmapoc.view.GameRulesView;
import javafx.stage.Stage;

public class GameRulesPresenter {
    private AppNameModel model;
    private GameRulesView view;
    private Stage stage;

    public GameRulesPresenter(AppNameModel appNameModel, GameRulesView gameRulesView, Stage stage) {
        this.model = appNameModel;
        this.view = gameRulesView;
        this.stage = stage;

        addEventHandlers();
    }

    private void addEventHandlers() {

    }
}
