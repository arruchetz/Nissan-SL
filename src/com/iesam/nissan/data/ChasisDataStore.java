package com.iesam.nissan.data;

import com.iesam.nissan.domain.models.chasis;

import java.util.Map;
import java.util.TreeMap;

public class ChasisDataStore {

    private static ChasisDataStore chasisDataStore = null;

    private Map<Integer, chasis> dataStore = new TreeMap<>();

    public void añadir(chasis chasis) {
        dataStore.put(chasis.getCodBast(), chasis);
    }

    public void modificar(chasis chasis) {
        dataStore.put(chasis.getCodBast(), chasis );
    }

    public chasis eliminar(chasis chasis ) {
        return dataStore.remove(chasis);
    }

    public void buscar(chasis chasis) {
        dataStore.put(chasis.getCodBast(), chasis);
    }

    public static ChasisDataStore getChasisDataStore() {
        if (chasisDataStore == null) {
            chasisDataStore = new ChasisDataStore();
        }
        return chasisDataStore;
    }
}
