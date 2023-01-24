package com.iesam.nissan.presentation;

import com.iesam.nissan.domain.models.cuadroMando;
import com.iesam.nissan.domain.models.motor;
import com.iesam.nissan.domain.models.ruedas;

public class Main {
    public static void main(String[] args) {

        //Crear Rueda
        ruedas ruedas = new ruedas();
        ruedas.setCod(1);
        ruedas.setMarca("Michelin");
        ruedas.setModelo("Alpin 6");
        ruedas.setDiametro("185");

        ruedas.setCod(2);
        ruedas.setMarca("Firestone");
        ruedas.setModelo("WinterHawk");
        ruedas.setDiametro("205");

        //Crear Motor
        motor motor = new motor();
        motor.setCod(1);
        motor.setCilindrada("X6000");
        motor.setModelo("2.0");
        motor.setCaballos("120cv");

        motor.setCod(2);
        motor.setCilindrada("X9000");
        motor.setModelo("2.4");
        motor.setCaballos("160cv");

        //Crear Cuadro de Mando
        cuadroMando cuadromando = new cuadroMando();
        cuadromando.setCod(1);
        cuadromando.setModelo("LM2000");

        cuadromando.setCod(2);
        cuadromando.setModelo("LM6000");
    }
}