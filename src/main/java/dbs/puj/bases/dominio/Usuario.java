package dbs.puj.bases.dominio;

public class Usuario {
    private String usuario = "";
    private String constrasena = "";

    public Usuario(String usuario, String constrasena) {
        this.usuario = usuario;
        this.constrasena = constrasena;
    }

    public Usuario() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getConstrasena() {
        return constrasena;
    }

    public void setConstrasena(String constrasena) {
        this.constrasena = constrasena;
    }
}
