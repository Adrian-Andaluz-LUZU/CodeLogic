package codelogic.model;

import java.util.List;

public class Pregunta {
    private int id;
    private String texto;
    private List<String> opciones;
    private String respuestaCorrecta;

    public Pregunta() {
    }

    public Pregunta(int id, String texto, List<String> opciones, String respuestaCorrecta) {
        this.id = id;
        this.texto = texto;
        this.opciones = opciones;
        this.respuestaCorrecta = respuestaCorrecta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public List<String> getOpciones() {
        return opciones;
    }

    public void setOpciones(List<String> opciones) {
        this.opciones = opciones;
    }

    public String getRespuestaCorrecta() {
        return respuestaCorrecta;
    }

    public void setRespuestaCorrecta(String respuestaCorrecta) {
        this.respuestaCorrecta = respuestaCorrecta;
    }
}
