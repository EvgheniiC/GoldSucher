package com.evghenii.mapInterface;

import java.awt.*;
// рисуем карту - т е отображаем
public interface DrawableMap {

    Component getMap();// любой компонент

    boolean drawMap();
}
