package com.iesam.nissan.domain.models;

public class chasis {
    private Integer codBast;
    private String modelo;
    private String marca;

    private componentes componentes;

    public Integer getCodBast() {
        return codBast;
    }

    public void setCodBast(Integer codBast) {
        this.codBast = codBast;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public componentes getComponentes() {
        return componentes;
    }

    public void setComponentes(componentes componentes) {
        this.componentes = componentes;
    }
}
