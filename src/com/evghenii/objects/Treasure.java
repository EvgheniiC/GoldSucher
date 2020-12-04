package com.evghenii.objects;

import com.evghenii.abstractsGame.AbstractGameObject;
import com.evghenii.enums.GameObjectType;

public class Treasure extends AbstractGameObject {

    private int score = 5;

    public Treasure(Coordinate coordinate) {
        super.setImageIcon(getImageIcon("/com/evghenii/images/gold.png"));
        super.setGameObjactType(GameObjectType.TREASURE);
        super.setCoordinate(coordinate);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
