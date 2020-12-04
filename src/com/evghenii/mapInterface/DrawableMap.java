package com.evghenii.mapInterface;

import com.evghenii.abstractsGame.AbstractMapObject;

import java.awt.*;
// рисуем карту - т е отображаем
public interface DrawableMap {

    Component getMapComponent();

    AbstractMapObject getGameMap();

    boolean drawMap();
}
