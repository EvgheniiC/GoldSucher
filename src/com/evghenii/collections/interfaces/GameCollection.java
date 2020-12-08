package com.evghenii.collections.interfaces;

import com.evghenii.enums.GameObjectType;
import com.evghenii.enums.MovingDirection;
import com.evghenii.gameobjects.abstracts.AbstractGameObject;
import com.evghenii.gameobjects.impl.Coordinate;
import com.evghenii.listeners.interfaces.MoveResultNotifier;
import com.evghenii.movestrategies.interfaces.MoveStrategy;

import java.util.List;

public interface GameCollection extends MoveResultNotifier {
    
    AbstractGameObject getObjectByCoordinate(Coordinate coordinate);
    
    AbstractGameObject getObjectByCoordinate(int x, int y);
    
    void addGameObject(AbstractGameObject gameObject);
    
    List<AbstractGameObject> getAllGameObjects();
    
    List<AbstractGameObject> getGameObjects(GameObjectType type);
    
    void moveObject(MovingDirection direction, GameObjectType gameObjectType);
    
    void moveObject(MoveStrategy moveStrategy, GameObjectType gameObjectType);
    
    void clear();

}
