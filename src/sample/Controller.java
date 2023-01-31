package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {
    public TextField chinese;
    public TextField math;
    public TextField English;
    public TextField geogro;
    public TextField huaxue;


    public void btn(ActionEvent actionEvent) throws IOException {
        ShowController.score1= Integer.parseInt(chinese.getText());
        ShowController.score2= Integer.parseInt(math.getText());
        ShowController.score3= Integer.parseInt(English.getText());
        ShowController.score4= Integer.parseInt(geogro.getText());
        ShowController.score5= Integer.parseInt(huaxue.getText());
        ShowView.start(new Stage());
    }
}
