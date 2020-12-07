package com.evghenii.gamemap.interfaces;

import com.evghenii.collections.interfaces.GameCollection;
import com.evghenii.objects.MapInfo;

public interface MainMap {

    MapInfo getMapInfo();
    
    GameCollection getGameCollection();// все карты должн хранить коллекцию объектов
   
}
