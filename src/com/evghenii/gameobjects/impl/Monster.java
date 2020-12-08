package com.evghenii.gameobjects.impl;

import com.evghenii.enums.ActionResult;
import com.evghenii.enums.GameObjectType;
import com.evghenii.enums.MovingDirection;
import com.evghenii.gameobjects.abstracts.AbstractGameObject;
import com.evghenii.gameobjects.abstracts.AbstractSoundObject;

import javax.sound.sampled.Clip;
import javax.swing.*;
import java.util.EnumMap;

/**
 * класс отвечает за работу объекта MONSTER
 */
public class Monster extends AbstractSoundObject {

    protected static EnumMap<MovingDirection, ImageIcon> monsterImages = new EnumMap<>(MovingDirection.class);// карта иконок для всех направлений монстра

    public Monster(Coordinate coordinate) {
        super.setType(GameObjectType.MONSTER);
        super.setCoordinate(coordinate);

        if (monsterImages.isEmpty()) {// для всех монстров будут одинаковые картики, поэтому нет смысла создавать для каждого объекта отдельный map
            monsterImages.put(MovingDirection.UP, getImageIcon("/com/evghenii/images/monster_up.jpg"));
            monsterImages.put(MovingDirection.DOWN, getImageIcon("/rcom/evghenii/images/monster_down.jpg"));
            monsterImages.put(MovingDirection.LEFT, getImageIcon("/com/evghenii/images/monster_left.jpg"));
            monsterImages.put(MovingDirection.RIGHT, getImageIcon("/com/evghenii/images/monster_right.jpg"));
        }

         super.changeIcon(MovingDirection.UP);
        
    }

    @Override
    public ActionResult doAction(AbstractGameObject gameObject) {
        
        if (gameObject == null){
            return ActionResult.NO_ACTION;
        }

        switch (gameObject.getType()) {

            case TREASURE:
            case MONSTER:
            case TREE: { // монстр не может наступать на сокровище, дерево и на других монстров
                return ActionResult.NO_ACTION;
            }

            case GOLDMAN: {
                return ActionResult.DIE;
            }

        }

        return super.doAction(gameObject);
    }

    @Override
    public Clip getSoundClip(ActionResult actionResult) {
        switch (actionResult) {
            case DIE:
                return super.getDieClip();

        }

        return null;
    }

    @Override
    public void changeIcon(MovingDirection direction) {
        super.setIcon(monsterImages.get(direction));
    }
}