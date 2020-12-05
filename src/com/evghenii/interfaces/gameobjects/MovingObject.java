package com.evghenii.interfaces.gameobjects;

import com.evghenii.abstracts.AbstractGameObject;
import com.evghenii.enums.MovingDirection;

import javax.swing.*;

/**
 * поведение для всех движущихся объектов:
 */
public interface MovingObject extends StaticObject {

    void move(MovingDirection direction);

    void getMoveResult(AbstractGameObject objectInNewCoordinate);

    // иконки при движении в разные стороны
    ImageIcon getIconLeft();

    ImageIcon getIconUp();

    ImageIcon getIconDown();

    ImageIcon getIconRight();


}
