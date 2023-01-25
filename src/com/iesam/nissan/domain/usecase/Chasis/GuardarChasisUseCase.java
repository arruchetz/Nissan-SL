package com.iesam.nissan.domain.usecase.Chasis;

import com.iesam.nissan.data.ChasisDataStore;
import com.iesam.nissan.domain.models.Chasis;

public class GuardarChasisUseCase {

    private ChasisDataStore dataStore = ChasisDataStore.getChasisDataStore();

    public void execute(Chasis chasis) {
        dataStore.guardar(chasis);
    }
}
