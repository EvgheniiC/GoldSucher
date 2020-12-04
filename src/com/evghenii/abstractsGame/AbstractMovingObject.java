package com.evghenii.abstractsGame;

import com.evghenii.enums.MovingDirection;
import com.evghenii.gameInterfaces.MovingObjects;

import javax.swing.*;

public abstract class AbstractMovingObject extends AbstractGameObject implements MovingObjects {

    private ImageIcon iconLeft;
    private ImageIcon iconReght;
    private ImageIcon iconUp;
    private ImageIcon iconDown;

    public abstract void getMoveRezult(AbstractGameObject ObjectInNewCoordinate);

    @Override
    public void move(MovingDirection movingDirection) {}

    public ImageIcon getIconLeft() {
        return iconLeft;
    }

    public void setIconLeft(ImageIcon iconLeft) {
        this.iconLeft = iconLeft;
    }

    public ImageIcon getIconReght() {
        return iconReght;
    }

    public void setIconRight(ImageIcon iconReght) {
        this.iconReght = iconReght;
    }

    public ImageIcon getIconUp() {
        return iconUp;
    }

    public void setIconUp(ImageIcon iconUp) {
        this.iconUp = iconUp;
    }

    public ImageIcon getIconDown() {
        return iconDown;
    }

    public void setIconDown(ImageIcon iconDown) {
        this.iconDown = iconDown;
    }

    @Override
    public ImageIcon getIconRight() {
        return null;
    }
}
