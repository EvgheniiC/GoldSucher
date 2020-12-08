package com.evghenii.gameobjects.impl;

import com.evghenii.enums.GameObjectType;
import com.evghenii.gameobjects.abstracts.AbstractGameObject;

public class Tree extends AbstractGameObject {
    public Tree(Coordinate coordinate) {
        super.setType(GameObjectType.TREE);
        super.setCoordinate(coordinate);
        super.saveIcon("/com/evghenii/images/tree.jpg");
    }
}

