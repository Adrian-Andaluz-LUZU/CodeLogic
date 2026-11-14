package codelogic.model;

public class Resultado {
    private String valorIngresado;
    private String mensaje;
    private boolean esCorrecto;

    public Resultado() {
    }

    public Resultado(String valorIngresado, String mensaje, boolean esCorrecto) {
        this.valorIngresado = valorIngresado;
        this.mensaje = mensaje;
        this.esCorrecto = esCorrecto;
    }

    public String getValorIngresado() {
        return valorIngresado;
    }

    public void setValorIngresado(String valorIngresado) {
        this.valorIngresado = valorIngresado;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isEsCorrecto() {
        return esCorrecto;
    }

    public void setEsCorrecto(boolean esCorrecto) {
        this.esCorrecto = esCorrecto;
    }
}