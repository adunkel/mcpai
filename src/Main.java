import com.jfoenix.svg.SVGGlyphLoader;
import controllers.MainController;
import io.datafx.controller.flow.Flow;
import io.datafx.controller.flow.container.DefaultFlowContainer;
import io.datafx.controller.flow.context.FXMLViewFlowContext;
import io.datafx.controller.flow.context.ViewFlowContext;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    /* -- settings -------------------------------------------- */

    private static final double MAIN_WIDTH = 1066;
    private static final double MAIN_HEIGHT = 600;
    private static final String WINDOW_TITLE = "mcpai";
    private static final String PARENT_FXML_FILE_PATH = "resources/fxml/View.fxml";

    /* -- start ----------------------------------------------- */

    @FXMLViewFlowContext
    private static final ViewFlowContext flowContext = new ViewFlowContext();

    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent parentNode = getDefaultRoot();
        primaryStage.setTitle(WINDOW_TITLE);
        primaryStage.setScene(new Scene(parentNode, MAIN_WIDTH, MAIN_HEIGHT));
        primaryStage.show();

        new Thread(()->{ try {
            SVGGlyphLoader.loadGlyphsFont(getClass().getResourceAsStream(
                  "/resources/fonts/icomoon.svg"),
                  "icomoon.svg");
            } catch (Exception e) { e.printStackTrace(); }
        }).start();

        Flow flow = new Flow(MainController.class);
        DefaultFlowContainer container = new DefaultFlowContainer();
        flowContext.register("Stage", primaryStage);
    }

    private Parent getDefaultRoot() {
        return getRoot(PARENT_FXML_FILE_PATH);
    }

    private Parent getRoot(String fxmlFilePath) {
        try {
            return FXMLLoader.load(getClass().getResource(fxmlFilePath));
        } catch (IOException e) { e.printStackTrace(); }
        return null;
    }
}
