package com.iesam.nissan.domain.usecase.Chasis;

import com.iesam.nissan.data.ChasisDataStore;
import com.iesam.nissan.data.ComponentesDataStore;
import com.iesam.nissan.domain.models.Chasis;
import com.iesam.nissan.domain.models.Componentes;

public class EliminarChasisUseCase {
    private ChasisDataStore dataStore = ChasisDataStore.getChasisDataStore();

    public Chasis execute(Integer codBast) {
        return dataStore.eliminar(codBast);
    }
}
