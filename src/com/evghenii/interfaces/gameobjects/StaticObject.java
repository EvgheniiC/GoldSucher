package com.evghenii.interfaces.gameobjects;

import com.evghenii.enums.GameObjectType;
import com.evghenii.objects.Coordinate;

import javax.swing.*;

public interface StaticObject {

    // объект должен иметь иконку
    ImageIcon getIcon();

    // координаты
    Coordinate getCoordinate();

    // тип объекта
    GameObjectType getType();


}
