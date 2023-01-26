package com.iesam.nissan.data;

import com.iesam.nissan.domain.models.Componentes;

import java.util.Map;
import java.util.TreeMap;

public class ComponentesDataStore {
    private static ComponentesDataStore componentesDataStore = null;

    private Map<String, Componentes> dataStore = new TreeMap<>();

    public void guardar(Componentes cod) {
        dataStore.put(cod.getCod(), cod);
    }

    public Componentes eliminar(Componentes cod) {
        return dataStore.remove(cod.getCod());
    }

    public Componentes buscar(Integer cod) {
        return dataStore.get(cod);
    }

    public Componentes modificar(Componentes cod) {
        return dataStore.put(cod.getCod(), cod);

    }

    public static ComponentesDataStore getComponentesDataStore() {
        if (componentesDataStore == null) {
            componentesDataStore = new ComponentesDataStore();
        }
        return componentesDataStore;
    }
}

