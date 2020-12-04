package com.evghenii.objects;

import com.evghenii.abstractsGame.AbstractGameObject;
import com.evghenii.enums.GameObjectType;

public class Exit extends AbstractGameObject {

    public Exit(Coordinate coordinate) {
        super.setImageIcon(getImageIcon("/com/evghenii/images/exit.png"));
        super.setGameObjactType(GameObjectType.EXIT);
        super.setCoordinate(coordinate);
    }


}
