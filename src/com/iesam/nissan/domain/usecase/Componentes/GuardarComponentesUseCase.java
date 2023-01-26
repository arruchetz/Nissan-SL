package com.iesam.nissan.domain.usecase.Componentes;

import com.iesam.nissan.data.ComponentesDataStore;
import com.iesam.nissan.domain.models.Componentes;

public class GuardarComponentesUseCase {
    private ComponentesDataStore dataStore = ComponentesDataStore.getComponentesDataStore();

    public void execute(Componentes componentes) {
        dataStore.guardar(componentes);
    }
}
