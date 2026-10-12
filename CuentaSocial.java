package Ejercicio32_cuentasSociales;

public class CuentaSocial {
    private String username;
    private String email;
    protected int seguidores;
    private int publicaciones;

    public CuentaSocial(String username, String email, int seguidores) {
        this.username = username;
        this.email = email;
        this.seguidores = seguidores;
    }

    public void publicar(String contenido) {
        publicaciones++;
        System.out.println("@" + username + " publicó: \"" + contenido + "\" (publicación N° " + publicaciones + ")");
    }

    public void seguir(CuentaSocial otra) {
        otra.seguidores++;
        System.out.println("@" + username + " ahora sigue a @" + otra.username);
    }

    public double calcularAlcance() {
        return seguidores;
    }

    public String getUsername() {
        return username;
    }

    public int getSeguidores() {
        return seguidores;
    }
}
