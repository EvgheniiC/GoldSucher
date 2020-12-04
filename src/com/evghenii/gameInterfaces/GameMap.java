package com.evghenii.gameInterfaces;

public interface GameMap {

    boolean drawMap();

    int getTimeLimit();

    int getHeight();

    int getWidht();

    boolean loadMap(Object o);

    boolean saveMap(Object o);


}
