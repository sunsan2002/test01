package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("学生成绩计算系统");
//        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/sample/Main.fxml"));
        primaryStage.setScene(new Scene(root, 740, 809));
//        Scene scene = new Scene(fxmlLoader.load());
//        primaryStage.setScene(scene);
        /*使窗口最大化*/
//        primaryStage.setMaximized(true);
        /*去除窗口顶部*/
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
