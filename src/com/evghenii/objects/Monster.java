package com.evghenii.objects;

import com.evghenii.abstracts.AbstractGameObject;
import com.evghenii.abstracts.AbstractMovingObject;
import com.evghenii.enums.GameObjectType;
import com.evghenii.enums.MovingDirection;

/**
 * класс отвечает за работу объекта MONSTER
 */
public class Monster extends AbstractMovingObject {

    public Monster(Coordinate coordinate) {
        super.setType(GameObjectType.MONSTER);
        super.setCoordinate(coordinate);

        super.setIconRight(getImageIcon("/com/evghenii/images/monster_right.jpg"));
        super.setIconLeft(getImageIcon("/com/evghenii/images/monster_left.jpg"));
        super.setIconUp(getImageIcon("/com/evghenii/images/monster_up.jpg"));
        super.setIconDown(getImageIcon("/com/evghenii/images/monster_down.jpg"));

        super.setIcon(getIconLeft());// по-умолчанию будет использоваться эта иконка
    }

    @Override
    public void move(MovingDirection direction) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void getMoveResult(AbstractGameObject objectInNewCoordinate) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
