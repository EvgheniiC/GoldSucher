package com.evghenii.gameInterfaces;

import com.evghenii.enums.GameObjectType;
import com.evghenii.objects.Coordinate;

import javax.swing.*;

public interface StaticObject {

    Coordinate getCoordinate();

    ImageIcon getImageIcon();

    GameObjectType getType();
}
