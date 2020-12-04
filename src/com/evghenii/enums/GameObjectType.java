package com.evghenii.enums;

import java.io.Serializable;

public enum GameObjectType implements Serializable {

    MONSTER(5),
    TREASURE(4),
    EXIT(3),
    WALL(2),
    GOLDMAN(1),
    NOTHINC(-1);

    private int indexOfPriority;

    private GameObjectType (int indexOfPriority){
        this.indexOfPriority = indexOfPriority;
    }

    public int getIndexOfPriority() {
        return indexOfPriority;
    }

    public void setIndexOfPriority(int indexOfPriority) {
        this.indexOfPriority = indexOfPriority;
    }
}
