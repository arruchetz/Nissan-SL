package com.iesam.nissan.data;

import com.iesam.nissan.domain.models.chasis;

import java.util.Map;
import java.util.TreeMap;

public class chasisDataStore {

    private static chasisDataStore instance = null;

    private Map<String, chasis> dataStore = new TreeMap<>();

    public void añadir(chasis chasis) {
        dataStore.put(chasis.getCodBast(), chasis);
    }

    public void modificar(chasis chasis) {
        dataStore.remove(chasis);
    }

    public chasis eliminar(chasis chasis ) {
        return dataStore.get(chasis);
    }

    public void obtener(chasis chasis) {
        dataStore.put(chasis.getCodBast(), chasis);
    }

    public static chasisDataStore getInstance() {
        if (instance == null) {
            instance = new chasisDataStore();
        }
        return instance;
    }
}
