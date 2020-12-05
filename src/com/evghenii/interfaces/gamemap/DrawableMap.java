package com.evghenii.interfaces.gamemap;

import com.evghenii.abstracts.AbstractGameMap;

import java.awt.*;

public interface DrawableMap {
    
    Component getMapComponent();

    AbstractGameMap getGameMap();
    
    boolean drawMap();    

}
