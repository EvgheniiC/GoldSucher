package com.evghenii.objects;

import com.evghenii.abstractsGame.AbstractGameObject;
import com.evghenii.abstractsGame.AbstractMovingObject;
import com.evghenii.enums.GameObjectType;
import com.evghenii.enums.MovingDirection;

public class GoldManPerson extends AbstractMovingObject {

    private int totalScore;
    private int turnsScore;

    public GoldManPerson(Coordinate coordinate) {
        super.setGameObjactType(GameObjectType.GOLDMAN);
        super.setCoordinate(coordinate);

        super.setIconDown(getImageIcon("com/evghenii/images/goldman_down.png"));
        super.setIconUp(getImageIcon("com/evghenii/images/goldman_up.png"));
        super.setIconLeft(getImageIcon("com/evghenii/images/goldman_left.png"));
        super.setIconRight(getImageIcon("com/evghenii/images/goldman_right.png"));

        super.setImageIcon(super.getIconUp());

    }

    @Override
    public void getMoveRezult(AbstractGameObject ObjectInNewCoordinate) {
        throw new UnsupportedOperationException("Not Suportet");
    }

    @Override
    public void move(MovingDirection movingDirection) {
        throw new UnsupportedOperationException("Not Suportet");
    }

    public void addTotalScore(int score) {
        this.totalScore += score;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public int getTurnsScore() {
        return turnsScore;
    }

    public void setTurnsScore(int turnsScore) {
        this.turnsScore = turnsScore;
    }

}
