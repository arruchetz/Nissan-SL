package com.iesam.nissan.domain.models;

public class motor implements componentes {

    private Integer cod;
    private String cilindrada;
    private String modelo;
    private String caballos;
    private String unidades;


    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getCaballos() {
        return caballos;
    }

    public void setCaballos(String caballos) {
        this.caballos = caballos;
    }


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
