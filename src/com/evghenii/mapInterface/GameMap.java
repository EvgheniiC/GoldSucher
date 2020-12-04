package com.evghenii.mapInterface;

//create card
public interface GameMap {

    int getTimeLimit();

    int getHeight();

    int getWidth();

    boolean loadMap(Object o);

    boolean saveMap(Object o);


}
