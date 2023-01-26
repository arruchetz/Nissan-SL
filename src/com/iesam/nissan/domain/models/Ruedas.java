package com.iesam.nissan.domain.models;

public class Ruedas implements Componentes {

    private Integer cod;
    private String marca;
    private String modelo;
    private String diametro;
    private String unidades;


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }


    public String getDiametro() {
        return diametro;
    }

    public void setDiametro(String diametro) {
        this.diametro = diametro;
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
    public String getCod() {
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
