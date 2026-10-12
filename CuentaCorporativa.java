package Ejercicio32_cuentasSociales;

public class CuentaCorporativa extends CuentaSocial {
    private int limiteAdministradores;
    private String sitioWeb;

    public CuentaCorporativa(String username, String email, int seguidores, int limiteAdministradores, String sitioWeb) {
        super(username, email, seguidores);
        this.limiteAdministradores = limiteAdministradores;
        this.sitioWeb = sitioWeb;
    }

    @Override
    public double calcularAlcance() {
        return seguidores * 1.5 + limiteAdministradores * 100;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }
}
