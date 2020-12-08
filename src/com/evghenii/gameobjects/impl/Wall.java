package com.evghenii.gameobjects.impl;

import com.evghenii.enums.GameObjectType;
import com.evghenii.gameobjects.abstracts.AbstractGameObject;

/**
 * класс отвечает за работу объекта WALL
 */
public class Wall extends AbstractGameObject {

    public Wall(Coordinate coordinate) {
        super.setType(GameObjectType.WALL);
        super.setCoordinate(coordinate);
        super.saveIcon("/com/evghenii/images/wall.png");
    }
}
