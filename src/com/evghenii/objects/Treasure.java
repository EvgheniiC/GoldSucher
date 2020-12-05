package com.evghenii.objects;

import com.evghenii.abstracts.AbstractGameObject;
import com.evghenii.enums.GameObjectType;


/**
 * класс отвечает за работу объекта TREASURE
 */
public class Treasure extends AbstractGameObject {

    public Treasure(Coordinate coordinate) {
        super.setType(GameObjectType.TREASURE);
        super.setCoordinate(coordinate);
        super.setIcon(getImageIcon("/com/evghenii/images/gold.png"));
    }
    
    
    private int score = 5;// каждое сокровище будет давать 5 очков игроку

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
