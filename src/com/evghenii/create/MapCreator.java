package com.evghenii.create;

import com.evghenii.abstractsGame.AbstractMapObject;
import com.evghenii.enums.LocationType;
import com.evghenii.maps.FileSystemGameMap;

public class MapCreator {

    private static MapCreator instance;

    public static MapCreator getInstance() {
        if (instance == null) {
            instance = new MapCreator();
        }
        return instance;
    }

    public AbstractMapObject createMap(LocationType type) {
        AbstractMapObject obj = null;

        switch (type) {
            case FS: {
                obj = new FileSystemGameMap();
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
