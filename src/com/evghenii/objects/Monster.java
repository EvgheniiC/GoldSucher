package com.evghenii.objects;

import com.evghenii.abstractsGame.AbstractGameObject;
import com.evghenii.abstractsGame.AbstractMovingObject;
import com.evghenii.enums.GameObjectType;

public class Monster extends AbstractMovingObject {

    public Monster(Coordinate coordinate) {
        super.setGameObjactType(GameObjectType.MONSTER);
        super.setCoordinate(coordinate);

        super.setIconDown(getImageIcon("/com/evghenii/images/monster_down.jpg"));
        super.setIconUp(getImageIcon("/com/evghenii/images/monster_up.jpg"));
        super.setIconLeft(getImageIcon("/com/evghenii/images/monster_left.jpg"));
        super.setIconRight(getImageIcon("/com/evghenii/images/monster_right.jpg"));

        super.setImageIcon(super.getIconLeft());
    }

    @Override
    public void getMoveRezult(AbstractGameObject ObjectInNewCoordinate) {

    }


}
