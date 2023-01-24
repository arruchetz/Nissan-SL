package com.iesam.nissan.domain.models;

public class cuadroMando implements componentes{
    private Integer cod;
    private String modelo;


    public void setCod(Integer cod) {
        this.cod = cod;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String getCod() {
        return null;
    }

    @Override
    public String getModelo() {
        return null;
    }
}
