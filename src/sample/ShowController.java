package sample;

import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

 public class ShowController implements Initializable {
    public Label chineseScore;
    public Label englishScore;
    public Label geoScore;
    public Label huaxueScore;
    public Label mathScore;
    public Label score;

    static int score1;
    static int score2;
    static int score3;
    static int score4;
    static int score5;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        chineseScore.setText(String.valueOf(score1));
        mathScore.setText(String.valueOf(score2));
        englishScore.setText(String.valueOf(score3));
        geoScore.setText(String.valueOf(score4));
        huaxueScore.setText(String.valueOf(score5));
        int ans = score1+score5+score4+score3+score2;
        score.setText(String.valueOf(ans));
    }
}
