package com.evghenii.objects;

import com.evghenii.abstractsGame.AbstractGameObject;
import com.evghenii.abstractsGame.AbstractMovingObject;
import com.evghenii.enums.GameObjectType;

public class Monster extends AbstractMovingObject {

    public Monster(Coordinate coordinate) {
        super.setGameObjactType(GameObjectType.MONSTER);
        super.setCoordinate(coordinate);

        super.setIconDown(getImageIcon("com/evghenii/images/monster_down.png"));
        super.setIconUp(getImageIcon("com/evghenii/images/monster_up.png"));
        super.setIconLeft(getImageIcon("com/evghenii/images/monster_left.png"));
        super.setIconRight(getImageIcon("com/evghenii/images/monster_right.png"));

        super.setImageIcon(super.getIconLeft());
    }

    @Override
    public void getMoveRezult(AbstractGameObject ObjectInNewCoordinate) {

    }


}
