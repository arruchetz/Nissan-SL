package com.iesam.nissan.presentation;

import com.iesam.nissan.domain.models.*;
import com.iesam.nissan.domain.usecase.Chasis.BuscarChasisUseCase;
import com.iesam.nissan.domain.usecase.Chasis.EliminarChasisUseCase;
import com.iesam.nissan.domain.usecase.Chasis.GuardarChasisUseCase;
import com.iesam.nissan.domain.usecase.Componentes.BuscarComponentesUseCase;
import com.iesam.nissan.domain.usecase.Componentes.EliminarComponentesUseCase;
import com.iesam.nissan.domain.usecase.Componentes.GuardarComponentesUseCase;

public class Main {
    public static void main(String[] args) {

        //Crear Rueda1
        Ruedas ruedas1 = new Ruedas();
        ruedas1.setCod(1);
        ruedas1.setMarca("Michelin");
        ruedas1.setModelo("Alpin 6");
        ruedas1.setDiametro("185");
        ruedas1.setUnidades("2");

        //Crear Rueda2
        Ruedas ruedas2 = new Ruedas();
        ruedas2.setCod(2);
        ruedas2.setMarca("Firestone");
        ruedas2.setModelo("WinterHawk");
        ruedas2.setDiametro("205");
        ruedas2.setUnidades("3");

        //Crear Motor1
        Motor motor1 = new Motor();
        motor1.setCod(1);
        motor1.setCilindrada("X6000");
        motor1.setModelo("2.0");
        motor1.setCaballos("120cv");
        motor1.setUnidades("19");

        //Crear Motor2
        Motor motor2 = new Motor();
        motor2.setCod(2);
        motor2.setCilindrada("X9000");
        motor2.setModelo("2.4");
        motor2.setCaballos("160cv");
        motor2.setUnidades("10");

        //Crear Cuadro de Mando1
        CuadroMando cuadromando1 = new CuadroMando();
        cuadromando1.setCod(1);
        cuadromando1.setModelo("LM2000");
        cuadromando1.setUnidades("4");

        //Crear Cuadro de Mando2
        CuadroMando cuadromando2 = new CuadroMando();
        cuadromando2.setCod(2);
        cuadromando2.setModelo("LM6000");
        cuadromando2.setUnidades("2");

        //Crear ChasisA
        Chasis chasisA = new Chasis();
        chasisA.setCodBast(11);
        chasisA.setMarca("Toyota");
        chasisA.setModelo("Supra");
        chasisA.setComponentes(ruedas1);
        chasisA.setComponentes(motor2);
        chasisA.setComponentes(cuadromando1);

        //Crear ChasisB
        Chasis chasisB = new Chasis();
        chasisB.setCodBast(110);
        chasisB.setMarca("Nissan");
        chasisB.setModelo("R-GTR 34");
        chasisB.setComponentes(ruedas2);
        chasisB.setComponentes(motor2);
        chasisB.setComponentes(cuadromando2);

        //Crear ChasisC
        Chasis chasisC = new Chasis();
        chasisC.setCodBast(1100);
        chasisC.setMarca("Nissan");
        chasisC.setModelo("200xs");
        chasisC.setComponentes(ruedas1);
        chasisC.setComponentes(motor1);
        chasisC.setComponentes(cuadromando1);

        //Crear ChasisD
        Chasis chasisD = new Chasis();
        chasisD.setCodBast(11000);
        chasisD.setMarca("Nissan");
        chasisD.setModelo("Primera");
        chasisD.setComponentes(ruedas1);
        chasisD.setComponentes(motor1);
        chasisD.setComponentes(cuadromando2);

        //Guardar chasis
        GuardarChasisUseCase guardarChasisUseCase = new GuardarChasisUseCase();
        guardarChasisUseCase.execute(chasisA );

        //Eliminar chasis
        EliminarChasisUseCase eliminarChasisUseCase = new EliminarChasisUseCase();
        eliminarChasisUseCase.execute(chasisB.getCodBast());

        //Buscar chasis
        BuscarChasisUseCase buscarChasisUseCase = new BuscarChasisUseCase();
        buscarChasisUseCase.execute(chasisC.getCodBast());


        //Guardar componentes
        GuardarComponentesUseCase guardarComponentesUseCase = new GuardarComponentesUseCase();
        guardarComponentesUseCase.execute(chasisA.getComponentes());

        //Eliminar componentes
        EliminarComponentesUseCase eliminarComponentesUseCase = new EliminarComponentesUseCase();
        eliminarComponentesUseCase.execute(chasisB.getComponentes());

        //Buscar componentes
        BuscarComponentesUseCase buscarComponentesUseCase = new BuscarComponentesUseCase();
        buscarComponentesUseCase.execute(chasisA.getCodBast());

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