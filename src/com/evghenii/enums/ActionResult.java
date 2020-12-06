package com.evghenii.enums;

/**
 * типы действий, которые могут произойти после движения игрока по карте
 */
public enum ActionResult {

    HIDE_IN_TREE,// спрятаться в дереве
    NO_ACTION,// ничего не происходит
    DIE,// игрок умирает
    WIN,// игрок выиграл
    MOVE,// движение игрока
    COLLECT_TREASURE// собрал золото
}
