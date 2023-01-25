package com.iesam.nissan.data;

import com.iesam.nissan.domain.models.componentes;

import java.util.Map;
import java.util.TreeMap;

public class ComponentesDataStore {
    private static ComponentesDataStore componentesDataStore = null;

    private Map<Integer , componentes> dataStore = new TreeMap<>();

    public void añadir(componentes componentes) {
        dataStore.put(componentes.getCod(), componentes);
    }

    public void modificar(componentes componentes) {
        dataStore.put(componentes.getCod(), componentes );
    }

    public componentes eliminar(componentes componentes ) {
        return dataStore.remove(componentes);
    }

    public void buscar(componentes componentes) {
        dataStore.put(componentes.getCod(), componentes);
    }

    public static ComponentesDataStore getComponentesDataStore() {
        if (componentesDataStore == null) {
            componentesDataStore = new ComponentesDataStore();
        }
        return componentesDataStore;
    }
}
