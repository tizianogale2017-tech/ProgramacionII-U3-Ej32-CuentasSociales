package Ejercicio32_cuentasSociales;

public class Main {
    public static void main(String[] args) {
        CuentaCreador creador = new CuentaCreador("gamer_ana", "ana@mail.com", 12000, 85000.0, 300000);
        CuentaCorporativa empresa = new CuentaCorporativa("tienda_oficial", "ventas@tienda.com", 8000, 5, "https://tienda.com");

        creador.publicar("Nuevo video de gameplay");
        empresa.publicar("Oferta de primavera");
        creador.seguir(empresa);

        CuentaSocial[] cuentas = {creador, empresa};
        for (CuentaSocial c : cuentas) {
            System.out.println("@" + c.getUsername() + " - seguidores: " + c.getSeguidores() + " - alcance estimado: " + c.calcularAlcance());
        }
    }
}
