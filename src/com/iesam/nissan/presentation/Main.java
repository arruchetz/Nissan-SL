package com.iesam.nissan.presentation;

import com.iesam.nissan.domain.models.chasis;
import com.iesam.nissan.domain.models.cuadroMando;
import com.iesam.nissan.domain.models.motor;
import com.iesam.nissan.domain.models.ruedas;

public class Main {
    public static void main(String[] args) {

        //Crear Rueda1
        ruedas ruedas1 = new ruedas();
        ruedas1.setCod(1);
        ruedas1.setMarca("Michelin");
        ruedas1.setModelo("Alpin 6");
        ruedas1.setDiametro("185");
        ruedas1.setUnidades("2");

        //Crear Rueda2
        ruedas ruedas2 = new ruedas();
        ruedas2.setCod(2);
        ruedas2.setMarca("Firestone");
        ruedas2.setModelo("WinterHawk");
        ruedas2.setDiametro("205");
        ruedas2.setUnidades("3");

        //Crear Motor1
        motor motor1 = new motor();
        motor1.setCod(1);
        motor1.setCilindrada("X6000");
        motor1.setModelo("2.0");
        motor1.setCaballos("120cv");
        motor1.setUnidades("19");

        //Crear Motor2
        motor motor2 = new motor();
        motor2.setCod(2);
        motor2.setCilindrada("X9000");
        motor2.setModelo("2.4");
        motor2.setCaballos("160cv");
        motor2.setUnidades("10");

        //Crear Cuadro de Mando1
        cuadroMando cuadromando1 = new cuadroMando();
        cuadromando1.setCod(1);
        cuadromando1.setModelo("LM2000");
        cuadromando1.setUnidades("4");

        //Crear Cuadro de Mando2
        cuadroMando cuadromando2 = new cuadroMando();
        cuadromando2.setCod(2);
        cuadromando2.setModelo("LM6000");
        cuadromando2.setUnidades("2");

        //Crear ChasisA
        chasis chasisA = new chasis();
        chasisA.setCodBast(1);
        chasisA.setMarca("Toyota");
        chasisA.setModelo("Supra");
        chasisA.setComponentes(ruedas1);
        chasisA.setComponentes(motor2);
        chasisA.setComponentes(cuadromando1);

        //Crear ChasisB
        chasis chasisB = new chasis();
        chasisB.setCodBast(10);
        chasisB.setMarca("Nissan");
        chasisB.setModelo("R-GTR 34");
        chasisB.setComponentes(ruedas2);
        chasisB.setComponentes(motor2);
        chasisB.setComponentes(cuadromando2);

        //Crear ChasisC
        chasis chasisC = new chasis();
        chasisC.setCodBast(100);
        chasisC.setMarca("Nissan");
        chasisC.setModelo("200xs");
        chasisC.setComponentes(ruedas1);
        chasisC.setComponentes(motor1);
        chasisC.setComponentes(cuadromando1);

        //Crear ChasisD
        chasis chasisD = new chasis();
        chasisD.setCodBast(1000);
        chasisD.setMarca("Nissan");
        chasisD.setModelo("Primera");
        chasisD.setComponentes(ruedas1);
        chasisD.setComponentes(motor1);
        chasisD.setComponentes(cuadromando2);

        ChasisPrinter chasisPrinter = new ChasisPrinter();
        //Imprimir el chasis A
        chasisPrinter.imprimir(chasisA);
        //Imprimir el chasis B
        chasisPrinter.imprimir(chasisB);
        //Imprimir el chasis C
        chasisPrinter.imprimir(chasisC);
        //Imprimir el chasis D
        chasisPrinter.imprimir(chasisD);
    }
}