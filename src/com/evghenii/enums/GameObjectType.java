package com.evghenii.enums;

// перечисления, которые задают доступные типы объектов игры

import java.io.Serializable;

// перечисления используются когда нужно описать ограниченное количество типов какого либо объекта
/**
 * типы объектов, которые участвуют в игре (которые будут рисоваться на карте)
 */
public enum GameObjectType implements Serializable{

    TREE(6),
    MONSTER(5),
    TREASURE(4),
    EXIT(3),
    WALL(2),
    GOLDMAN(1),    
    NOTHING(-1);

    private GameObjectType(int indexPriority) {
        this.indexPriority = indexPriority;
    }
    
    private int indexPriority;// индекс для приоритета показа на карте, если несколько объектов окажется в одном квадрате

    public int getIndexPriority() {
        return indexPriority;
    }
    
}
