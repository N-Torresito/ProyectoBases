package dbs.puj.bases.integracion;

import dbs.puj.bases.dominio.Usuario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class IntegradorJDBC {


    public static boolean verificarUsuario(Usuario usuario){
        String sql = "SELECT * FROM usuario WHERE login = ? AND PWD = ?";

        try (Connection conex = DriverManager.getConnection("${URL}", "${USERNAME}", "${PASSWORD}");
            PreparedStatement ps = conex.prepareStatement(sql)){

            ps.setString(1, usuario.getUsuario());
            ps.setString(2, usuario.getConstrasena());

            if (ps.executeQuery().next()){
                return true;
            } else {
                return false;
            }

        }catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
