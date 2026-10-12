package Ejercicio32_cuentasSociales;

public class CuentaCreador extends CuentaSocial {
    private double ingresosPublicidad;
    private int visualizaciones;

    public CuentaCreador(String username, String email, int seguidores, double ingresosPublicidad, int visualizaciones) {
        super(username, email, seguidores);
        this.ingresosPublicidad = ingresosPublicidad;
        this.visualizaciones = visualizaciones;
    }

    @Override
    public double calcularAlcance() {
        return seguidores + visualizaciones * 0.25;
    }

    public double getIngresosPublicidad() {
        return ingresosPublicidad;
    }
}
