package com.evghenii.listeners.interfaces;


import com.evghenii.enums.ActionResult;
import com.evghenii.gameobjects.abstracts.AbstractGameObject;

public interface MoveResultListener {
    
     public void notifyActionResult(ActionResult actionResult, AbstractGameObject sourceObject, AbstractGameObject targetObject);

}
