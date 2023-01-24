package com.iesam.nissan.domain.models;

public class ruedas implements componentes{

    private Integer cod;
    private String marca;
    private String modelo;
    private String diametro;



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

    @Override
    public String getCod() {
        return null;
    }

    @Override
    public String getModelo() {
        return null;
    }
}
