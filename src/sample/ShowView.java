package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShowView {
    public static Stage informationStage;
    public static void start(Stage primaryStage) throws IOException {
        informationStage= primaryStage;
        Parent root = FXMLLoader.load(ShowView.class.getResource("show.fxml"));
        primaryStage.setTitle("学生成绩");
        primaryStage.setScene(new Scene(root, 600, 572));
        primaryStage.show();
        List<Integer> socres=new ArrayList<>();
//        socres.add()
    }
}
