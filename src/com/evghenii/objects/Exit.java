package com.evghenii.objects;

import com.evghenii.abstracts.AbstractGameObject;
import com.evghenii.enums.GameObjectType;


/**
 * объект EXIT
 */
public class Exit extends AbstractGameObject {

    public Exit(Coordinate coordinate) {
        super.setType(GameObjectType.EXIT);
        super.setCoordinate(coordinate);
        super.setIcon(getImageIcon("/com/evghenii/images/exit.gif"));
    }
}
