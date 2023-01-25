package com.iesam.nissan.presentation;

import com.iesam.nissan.domain.models.chasis;

public class ChasisPrinter {
    public void imprimir(chasis chasis) {
        System.out.println("Código Bastidor Chasis:" + chasis.getCodBast());
        System.out.println("Modelo chasis:" + chasis.getModelo());
        System.out.println("Marca chasis:" + chasis.getMarca());
        System.out.println("---------------------------------------");
    }
}
