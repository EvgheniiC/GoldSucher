package com.evghenii.gameobjects.interfaces;

import com.evghenii.enums.ActionResult;
import com.evghenii.enums.MovingDirection;
import com.evghenii.gameobjects.abstracts.AbstractGameObject;

/**
 *
 * поведение для всех движущихся объектов: 
 */
public interface MovingObject extends StaticObject{
    
    ActionResult moveToObject(MovingDirection direction, AbstractGameObject gameObject);
    
    int getStep();
       
}
