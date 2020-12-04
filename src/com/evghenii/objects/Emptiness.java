package com.evghenii.objects;

import com.evghenii.abstractsGame.AbstractGameObject;
import com.evghenii.enums.GameObjectType;

public class Emptiness extends AbstractGameObject {

    public Emptiness(Coordinate coordinate) {
        super.setImageIcon(null);
        super.setGameObjactType(GameObjectType.NOTHINC);
        super.setCoordinate(coordinate);
    }
}
