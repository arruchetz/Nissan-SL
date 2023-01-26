package com.iesam.nissan.domain.usecase.Componentes;

import com.iesam.nissan.data.ComponentesDataStore;
import com.iesam.nissan.domain.models.Componentes;

public class EliminarComponentesUseCase {
    private ComponentesDataStore dataStore = ComponentesDataStore.getComponentesDataStore();

    public Componentes execute(Componentes cod) {
        return dataStore.eliminar(cod);
    }
}
