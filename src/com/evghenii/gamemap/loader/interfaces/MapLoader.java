package com.evghenii.gamemap.loader.interfaces;

import com.evghenii.objects.MapInfo;
import com.evghenii.objects.SavedMapInfo;
import com.evghenii.objects.User;

import java.util.ArrayList;

public interface MapLoader{
    
    boolean saveMap(SavedMapInfo mapInfo);
    
    boolean loadMap(MapInfo mapInfo);

    ArrayList<SavedMapInfo> getSavedMapList(User user);
    
    boolean deleteSavedMap(MapInfo mapInfo);

}
