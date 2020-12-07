package com.evghenii.gamemap.abstracts;

import com.evghenii.collections.interfaces.GameCollection;
import com.evghenii.gamemap.interfaces.TimeMap;
import com.evghenii.gameobjects.abstracts.AbstractGameObject;
import com.evghenii.objects.MapInfo;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class AbstractGameMap implements TimeMap, Serializable { // Serializable нужен для сериализации (сохранения) объекта карты, чтобы можно было сохранять игру и восстанавливать

    private static final long serialVersionUID = 1L;
    protected GameCollection gameCollection;
    protected MapInfo mapInfo = new MapInfo();

    public AbstractGameMap(GameCollection gameCollection) {
        this.gameCollection = gameCollection;
    }

    @Override
    public MapInfo getMapInfo() {
        return mapInfo;
    }

    public void setMapInfo(MapInfo mapInfo) {
        this.mapInfo = mapInfo;
    }

   

    public AbstractGameObject getPriorityObject(AbstractGameObject firstObject, AbstractGameObject secondObject) {
        // приоритет объекта зависит от номера индекса объекта enum
        return (firstObject.getType().getIndexPriority() > secondObject.getType().getIndexPriority()) ? firstObject : secondObject; // сокращенная запись условия if: если первый объект имеет больший приоритет - вернуть его, иначе вернуть второй объект
    }

  

    @Override
    public GameCollection getGameCollection() {
        if (gameCollection == null) {
            try {
                throw new Exception("Game collection not initialized!");
            } catch (Exception ex) {
                Logger.getLogger(AbstractGameMap.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return gameCollection;
    }

    public void setGameCollection(GameCollection gameCollection) {
        this.gameCollection = gameCollection;
    }

  
    
}
