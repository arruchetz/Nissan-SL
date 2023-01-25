package com.iesam.nissan.data;

import com.iesam.nissan.domain.models.Chasis;

import java.util.Map;
import java.util.TreeMap;

public class ChasisDataStore {

        private static ChasisDataStore chasisDataStore = null;

        private Map<Integer, Chasis> dataStore = new TreeMap<>();

        public void guardar(Chasis chasis) {
            dataStore.put(chasis.getCodBast(), chasis);
        }

        public Chasis eliminar(Integer codBast) {
            return dataStore.remove(codBast);
        }

        public Chasis buscar(Integer codBast) {
            return dataStore.get(codBast);
        }

        public void modificar(Chasis chasis) {
            dataStore.put(chasis.getCodBast(), chasis);
        }

        public static ChasisDataStore getChasisDataStore() {
            if (chasisDataStore == null) {
                chasisDataStore = new ChasisDataStore();
            }
            return chasisDataStore;
        }
}
