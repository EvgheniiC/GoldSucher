package com.evghenii.objects;

import com.evghenii.abstracts.AbstractGameObject;
import com.evghenii.enums.GameObjectType;


/**
 * класс отвечает за работу объекта WALL
 */
public class Wall extends AbstractGameObject {

    public Wall(Coordinate coordinate) {
        super.setType(GameObjectType.WALL);
        super.setCoordinate(coordinate);
        
        super.setIcon(getImageIcon("/com/evghenii/images/wall.png"));

    }
}
