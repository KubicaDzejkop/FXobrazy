module pl.gornik.fxobrazy {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.gornik.fxobrazy to javafx.fxml;
    exports pl.gornik.fxobrazy;
}