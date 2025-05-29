module dbs.puj.bases {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens dbs.puj.bases to javafx.fxml;
    exports dbs.puj.bases;
}