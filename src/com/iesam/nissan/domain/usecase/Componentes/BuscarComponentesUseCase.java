package com.iesam.nissan.domain.usecase.Componentes;

import com.iesam.nissan.data.ComponentesDataStore;
import com.iesam.nissan.domain.models.Componentes;


public class BuscarComponentesUseCase {
    private ComponentesDataStore dataStore = ComponentesDataStore.getComponentesDataStore();

    public Componentes execute(Integer cod) {
        return dataStore.buscar(cod);
    }
}
