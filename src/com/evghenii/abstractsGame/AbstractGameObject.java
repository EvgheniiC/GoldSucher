package com.evghenii.abstractsGame;

import com.evghenii.enums.GameObjectType;
import com.evghenii.gameInterface.StaticObject;
import com.evghenii.objects.Coordinate;

import javax.swing.*;

public abstract class AbstractGameObject implements StaticObject {

    private Coordinate coordinate;

    private GameObjectType gameObjactType;

    private ImageIcon imageIcon = getImageIcon("com/evghenii/images/noicon.png");// image by default

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
}
