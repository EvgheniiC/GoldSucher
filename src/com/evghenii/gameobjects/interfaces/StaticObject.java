package com.evghenii.gameobjects.interfaces;

import com.evghenii.enums.GameObjectType;
import com.evghenii.gameobjects.impl.Coordinate;

import javax.swing.*;

public interface StaticObject {
 
    // объект должен иметь иконку
    ImageIcon getIcon();

    // координаты
    Coordinate getCoordinate();

    // тип объекта
    GameObjectType getType();
    
            
}
