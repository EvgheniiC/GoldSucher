package com.evghenii.gameobjects.impl;


import com.evghenii.enums.GameObjectType;
import com.evghenii.gameobjects.abstracts.AbstractGameObject;

/**
 * класс отвечает за работу объекта NOTHING (т.е. пустоту на карте)
 */
public class Nothing extends AbstractGameObject {

    public Nothing(Coordinate coordinate) {
        super.setType(GameObjectType.NOTHING);
        super.setCoordinate(coordinate);
        super.setIcon(null);
    }
}
