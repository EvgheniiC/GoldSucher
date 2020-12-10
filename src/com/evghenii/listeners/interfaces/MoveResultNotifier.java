package com.evghenii.listeners.interfaces;

import com.evghenii.enums.ActionResult;
import com.evghenii.gameobjects.abstracts.AbstractGameObject;

import java.util.List;

public interface MoveResultNotifier {
    
    List<MoveResultListener> getMoveListeners();

    void addMoveListener(MoveResultListener listener);

    public void removeMoveListener(MoveResultListener listener);

    public void removeAllMoveListeners();

    public void notifyMoveListeners(ActionResult actionResult, AbstractGameObject movingObject, AbstractGameObject targetObject);

}
