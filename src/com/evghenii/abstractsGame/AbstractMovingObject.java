package com.evghenii.abstractsGame;

import com.evghenii.enums.MovingDirection;
import com.evghenii.gameInterfaces.MovingObjects;
import com.evghenii.objects.Coordinate;

import javax.swing.*;

public abstract class AbstractMovingObject extends AbstractGameObject implements MovingObjects {

    private ImageIcon iconLeft;
    private ImageIcon iconReght;
    private ImageIcon iconUp;
    private ImageIcon iconDown;
    private AbstractGameObject gameObject;

    public abstract void getMoveRezult(AbstractGameObject ObjectInNewCoordinate);

    @Override
    public void move(MovingDirection movingDirection) {

        final int width = this.getCoordinate().getHeight();
        final int height = this.getCoordinate().getWidth();

        Coordinate newCoordinate = new Coordinate(width,height);

        switch (movingDirection){
            case LEFT: {
                super.setImageIcon(getIconLeft());
                newCoordinate.setHeightAndWidth(width-1,height);
                break;
            }
            case UP: {
                super.setImageIcon(getIconUp());
                newCoordinate.setHeightAndWidth(width,height+1);
                break;
            }
            case RIGHT: {
                super.setImageIcon(getIconReght());
                newCoordinate.setHeightAndWidth(width+1,height);
                break;
            }
            case DOWN: {
                super.setImageIcon(getIconDown());
                newCoordinate.setHeightAndWidth(width,height-1);
                break;
            }
        }
        setCoordinate(newCoordinate);
    }

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
