package com.evghenii.objects.creators;

import com.evghenii.abstracts.AbstractGameMap;
import com.evghenii.enums.LocationType;
import com.evghenii.objects.maps.FSGameMap;

public class MapCreator {

    private static MapCreator instance;

    public static MapCreator getInstance() {
        if (instance == null) {
            instance = new MapCreator();
        }
        return instance;
    }

    public AbstractGameMap createMap(LocationType type) {
        AbstractGameMap obj = null;

        switch (type) {
            case FS: {
                obj = new FSGameMap();
                break;
            }
            case DB: {

                break;
            }
            default:
                throw new IllegalArgumentException("Can't create map type: " + type);

        }

        return obj;
    }
}
