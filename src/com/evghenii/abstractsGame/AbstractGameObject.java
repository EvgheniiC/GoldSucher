package com.evghenii.abstractsGame;

import com.evghenii.enums.GameObjectType;
import com.evghenii.gameInterfaces.StaticObject;
import com.evghenii.objects.Coordinate;

import javax.swing.*;
import java.util.Objects;

public abstract class AbstractGameObject implements StaticObject {

    private Coordinate coordinate;

    private GameObjectType gameObjactType;

    private ImageIcon imageIcon = getImageIcon("/com/evghenii/images/noicon.png");// image by default

    protected AbstractGameObject() {
    }

    @Override
    public ImageIcon getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    protected ImageIcon getImageIcon(String url) {
        return new ImageIcon(getClass().getResource(url));
    }

    @Override
    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public GameObjectType getType() {
        return gameObjactType;
    }

    public void setGameObjactType(GameObjectType gameObjactType) {
        this.gameObjactType = gameObjactType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractGameObject that = (AbstractGameObject) o;
        return Objects.equals(coordinate, that.coordinate) &&
                gameObjactType == that.gameObjactType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinate, gameObjactType);
    }

    @Override
    public String toString() {
        return "AbstractGameObject{" +
                "coordinate=" + coordinate +
                ", gameObjactType=" + gameObjactType +
                '}';
    }
}
