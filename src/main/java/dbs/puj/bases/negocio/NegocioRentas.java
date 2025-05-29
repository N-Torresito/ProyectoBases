package dbs.puj.bases.negocio;

import dbs.puj.bases.dominio.Usuario;
import dbs.puj.bases.integracion.IntegradorJDBC;

public class NegocioRentas {

    public boolean ingresar(Usuario usuario){
        return IntegradorJDBC.verificarUsuario(usuario);
    }

}
