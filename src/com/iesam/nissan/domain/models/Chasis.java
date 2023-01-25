package com.iesam.nissan.domain.models;

public class Chasis {
    private Integer codBast;
    private String modelo;
    private String marca;

    private Componentes componentes;

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

    public Componentes getComponentes() {
        return componentes;
    }

    public void setComponentes(Componentes componentes) {
        this.componentes = componentes;
    }
}
