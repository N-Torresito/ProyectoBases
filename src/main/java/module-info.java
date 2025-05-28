module dbs.puj.bases {
    requires javafx.controls;
    requires javafx.fxml;


    opens dbs.puj.bases to javafx.fxml;
    exports dbs.puj.bases;
}