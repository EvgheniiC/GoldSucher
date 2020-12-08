package com.evghenii.gameobjects.impl;


import com.evghenii.enums.GameObjectType;
import com.evghenii.gameobjects.abstracts.AbstractGameObject;

/**
 * объект EXIT
 */
public class Exit extends AbstractGameObject {

    public Exit(Coordinate coordinate) {
        super.setType(GameObjectType.EXIT);
        super.setCoordinate(coordinate);
        super.saveIcon("/com/evghenii/images/exit.gif");
    }
}
