package com.evghenii.objects;

import com.evghenii.abstractsGame.AbstractGameObject;
import com.evghenii.enums.GameObjectType;

public class Wall extends AbstractGameObject {

    public Wall(Coordinate coordinate) {
        super.setImageIcon(getImageIcon("com/evghenii/images/wall.png"));
        super.setGameObjactType(GameObjectType.WALL);
        super.setCoordinate(coordinate);
    }

}
