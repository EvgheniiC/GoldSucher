package com.evghenii.abstractsGame;

import com.evghenii.enums.MovingDirection;
import com.evghenii.gameInterface.MovingObjects;

import javax.swing.*;

public abstract class AbstractMovingObject extends AbstractGameObject implements MovingObjects {

    private ImageIcon geticonLeft;
    private ImageIcon geticonReght;
    private ImageIcon geticonUp;
    private ImageIcon geticonDown;

    public abstract void getMoveRezult(AbstractGameObject ObjectInNewCoordinate);

    @Override
    public void move(MovingDirection movingDirection) {

    }

    public ImageIcon getGeticonLeft() {
        return geticonLeft;
    }

    public void setGeticonLeft(ImageIcon geticonLeft) {
        this.geticonLeft = geticonLeft;
    }

    public ImageIcon getGeticonReght() {
        return geticonReght;
    }

    public void setGeticonReght(ImageIcon geticonReght) {
        this.geticonReght = geticonReght;
    }

    public ImageIcon getGeticonUp() {
        return geticonUp;
    }

    public void setGeticonUp(ImageIcon geticonUp) {
        this.geticonUp = geticonUp;
    }

    public ImageIcon getGeticonDown() {
        return geticonDown;
    }

    public void setGeticonDown(ImageIcon geticonDown) {
        this.geticonDown = geticonDown;
    }
}
