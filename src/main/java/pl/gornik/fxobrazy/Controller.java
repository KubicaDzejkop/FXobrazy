package pl.gornik.fxobrazy;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    private RadioButton rioKaczor;

    @FXML
    private ToggleGroup politycy;

    @FXML
    private RadioButton rioDuda;

    @FXML
    private RadioButton rioBosak;

    @FXML
    private RadioButton rioMentzen;

    @FXML
    private RadioButton rioSzydlo;

    @FXML
    private RadioButton rioTusk;

    @FXML
    private RadioButton rioBraun;

    @FXML
    private RadioButton rioHolownia;

    @FXML
    private Button btnClose;

    @FXML
    private ImageView imgView;

    @FXML
    private Label lblInfo;

    private Image image;

    private String[] pathImage = {"/obrazy/kaczynski.jpg", "/obrazy/duda.jpg", "/obrazy/bosak.jpg",
            "/obrazy/mentzen.jpg", "/obrazy/szydlo.jpeg", "/obrazy/tusk.jpg",
            "/obrazy/braun.jpg", "/obrazy/holownia.png"
    };

    private String[] descriptions = {
            "Jarosław Aleksander Kaczyński (ur. 18 czerwca 1949 w Warszawie) – polski polityk i doktor nauk prawnych.",
            "Andrzej Sebastian Duda (ur. 16 maja 1972 w Krakowie) – polski prawnik i polityk, od 6 sierpnia 2015 prezydent Rzeczypospolitej Polskiej.",
            "Krzysztof Bosak  (ur. 13 czerwca 1982 w Zielonej Górze) – polski polityk, w latach 2005–2006 prezes Młodzieży Wszechpolskiej, poseł na Sejm V, IX i X kadencji, współzałożyciel i jeden z liderów Konfederacji Wolność i Niepodległość.",
            "Sławomir Jerzy Mentzen (ur. 20 listopada 1986 w Toruniu) – polski polityk, przedsiębiorca i doradca podatkowy, doktor nauk ekonomicznych.",
            "Beata Maria Szydło z domu Kusińska(ur. 15 kwietnia 1963 w Oświęcimiu) – polska polityk, etnograf i działaczka samorządowa, w latach 2015–2017 prezes Rady Ministrów.",
            "Donald Franciszek Tusk (ur. 22 kwietnia 1957 w Gdańsku) – polski polityk i historyk. W latach 2007–2014 i od 2023 prezes Rady Ministrów stojący na czele swojego pierwszego, drugiego i trzeciego gabinetu.",
            "Grzegorz Michał Braun (ur. 11 marca 1967 w Toruniu) – polski polityk skrajnie prawicowy, reżyser, scenarzysta, nauczyciel akademicki i publicysta oraz monarchista.",
            "Szymon Franciszek Hołownia (ur. 3 września 1976 w Białymstoku) – polski dziennikarz, pisarz, publicysta, prezenter telewizyjny, polityk i działacz społeczny, marszałek Sejmu X kadencji."
    };
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        btnClose.setOnAction(event -> Platform.exit());

        setImageAndText(0);
        rioKaczor.setOnAction(event -> setImageAndText(0));
        rioDuda.setOnAction(event -> setImageAndText(1));
        rioBosak.setOnAction(event -> setImageAndText(2));
        rioMentzen.setOnAction(event -> setImageAndText(3));
        rioSzydlo.setOnAction(event -> setImageAndText(4));
        rioTusk.setOnAction(event -> setImageAndText(5));
        rioBraun.setOnAction(event -> setImageAndText(6));
        rioHolownia.setOnAction(event -> setImageAndText(7));
    }
    public void setImageAndText(int index){
        image = new Image(String.valueOf(getClass().getResource(pathImage[index])));
        imgView.setImage(image);
        lblInfo.setText(descriptions[index]);

    }
}
