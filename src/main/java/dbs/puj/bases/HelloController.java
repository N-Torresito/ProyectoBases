package dbs.puj.bases;

import dbs.puj.bases.dominio.Usuario;
import dbs.puj.bases.negocio.NegocioRentas;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label txtAnuncios;
    @FXML
    private Button btnIngresar;
    @FXML
    private TextField txtContrasenaIngresar;
    @FXML
    private TextField txtUsuarioIngresar;

    NegocioRentas negocio = new NegocioRentas();

    @FXML
    public void onClickIngresar(ActionEvent actionEvent) {
        if (negocio.ingresar(new Usuario(
                txtUsuarioIngresar.getText(),
                txtContrasenaIngresar.getText()
            )))
        {
            txtAnuncios.setText("Se ha ingresado correctamente");
        } else {
            txtAnuncios.setText("DATOS INCORRECTOS");
        }
    }



}
