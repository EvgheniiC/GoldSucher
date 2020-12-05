package com.evghenii.abstracts;

import com.evghenii.enums.MovingDirection;
import com.evghenii.interfaces.gameobjects.MovingObject;
import com.evghenii.objects.Coordinate;

import javax.swing.*;

/**
 * класс, который отвечает за любой движущийся объект. наследуется от класса
 * AbstractGameObject с добавлением функций движения
 */
public abstract class AbstractMovingObject extends AbstractGameObject implements MovingObject {

    private ImageIcon iconLeft;
    private ImageIcon iconUp;
    private ImageIcon iconDown;
    private ImageIcon iconRight;

    public void setIconLeft(ImageIcon iconLeft) {
        this.iconLeft = iconLeft;
    }

    public void setIconUp(ImageIcon iconUp) {
        this.iconUp = iconUp;
    }

    public void setIconDown(ImageIcon iconDown) {
        this.iconDown = iconDown;
    }

    public void setIconRight(ImageIcon iconRight) {
        this.iconRight = iconRight;
    }

    @Override
    public ImageIcon getIconLeft() {
        return iconLeft;
    }

    @Override
    public ImageIcon getIconUp() {
        return iconUp;
    }

    @Override
    public ImageIcon getIconDown() {
        return iconDown;
    }

    @Override
    public ImageIcon getIconRight() {
        return iconRight;
    }

    @Override
    public void move(MovingDirection direction) {
        // берем текущие координаты объекта, которые нужно передвинуть (индексы начинаются с нуля)
        int x = this.getCoordinate().getX();
        int y = this.getCoordinate().getY();


        Coordinate newCoordinate = new Coordinate(x, y);


        switch (direction) {// определяем, в каком направлении нужно двигаться по массиву
            case UP: {
                super.setIcon(getIconUp());
                newCoordinate.setXY(x, y - 1);
                break;
            }
            case DOWN: {
                super.setIcon(getIconDown());
                newCoordinate.setXY(x, y + 1);
                break;
            }
            case LEFT: {
                super.setIcon(getIconLeft());
                newCoordinate.setXY(x - 1, y);
                break;
            }
            case RIGHT: {
                super.setIcon(getIconRight());
                newCoordinate.setXY(x + 1, y);
                break;
            }
        }

        setCoordinate(newCoordinate);


    }
}
