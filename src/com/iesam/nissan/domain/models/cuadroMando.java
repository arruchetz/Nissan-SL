package com.iesam.nissan.domain.models;

public class cuadroMando implements componentes{
    private Integer cod;
    private String modelo;
    private String unidades;


    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

    @Override
    public Integer getCod() {
        return null;
    }

    @Override
    public String getModelo() {
        return null;
    }

    @Override
    public String getUnidades() {
        return null;
    }
}
