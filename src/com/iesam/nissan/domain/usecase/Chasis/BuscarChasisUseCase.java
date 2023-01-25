package com.iesam.nissan.domain.usecase.Chasis;

import com.iesam.nissan.data.ChasisDataStore;
import com.iesam.nissan.domain.models.Chasis;

public class BuscarChasisUseCase {

        private ChasisDataStore dataStore = ChasisDataStore.getChasisDataStore();

        public Chasis execute(Integer codBast) {
            return dataStore.buscar(codBast);
        }
}

