package com.evghenii.gameInterface;

import com.evghenii.abstractsGame.AbstractGameObject;
import com.evghenii.enums.MovingDirection;

import javax.swing.*;

public interface MovingObjects extends StaticObject {

    void move(MovingDirection movingDirection);

    void getMoveRezult(AbstractGameObject ObjectInNewCoordinate);

/*    void goBack();

    void goForward();

    void goLeft();

    void goRight();*/

    ImageIcon getIconLeft();

    ImageIcon getIconRight();

    ImageIcon getIconUp();

    ImageIcon getIconDown();

}
