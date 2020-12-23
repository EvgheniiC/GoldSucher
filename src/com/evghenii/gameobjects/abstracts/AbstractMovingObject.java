package com.evghenii.gameobjects.abstracts;

import com.evghenii.enums.ActionResult;
import com.evghenii.enums.MovingDirection;
import com.evghenii.gameobjects.impl.Coordinate;
import com.evghenii.gameobjects.interfaces.MovingObject;

import java.util.EnumMap;
import javax.swing.ImageIcon;


/**
 * класс, который отвечает за любой движущийся объект. наследуется от класса
 * AbstractGameObject с добавлением функций движения
 */
public abstract class AbstractMovingObject extends AbstractGameObject implements MovingObject {

    private int step = 1;// по-умолчанию у всех объектов шаг равен 1
    
    protected EnumMap<MovingDirection, ImageIcon> movingImages = new EnumMap<>(MovingDirection.class);// карта иконок для всех направлений

    @Override
    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    protected void actionBeforeMove(MovingDirection direction) {

        // при движении объект должен сменить иконку и произвести звук
        changeIcon(direction);
//        playSound(); на будушее

    }

    @Override
    public ActionResult moveToObject(MovingDirection direction, AbstractGameObject gameObject) {
        actionBeforeMove(direction);
        return doAction(gameObject);
    }

    public ActionResult doAction(AbstractGameObject gameObject) {

        if (gameObject == null) { // край карты
            return ActionResult.NO_ACTION;
        }

        switch (gameObject.getType()) {

            case NOTHING: {
                return ActionResult.MOVE;
            }

            case WALL: {// по-умолчанию объект не может ходить через стену
                return ActionResult.NO_ACTION;
            }
        }

        return ActionResult.NO_ACTION;
    }

   
    
    public Coordinate getDirectionCoordinate(MovingDirection direction) {

        // берем текущие координаты объекта, которые нужно передвинуть (индексы начинаются с нуля)
        int x = this.getCoordinate().getX();
        int y = this.getCoordinate().getY();


        Coordinate newCoordinate = new Coordinate(x, y);


        switch (direction) {// определяем, в каком направлении нужно двигаться
            case UP: {
                newCoordinate.setY(y - this.getStep());
                break;
            }
            case DOWN: {
                newCoordinate.setY(y + this.getStep());
                break;
            }
            case LEFT: {
                newCoordinate.setX(x - this.getStep());
                break;
            }
            case RIGHT: {
                newCoordinate.setX(x + this.getStep());
                break;
            }
        }

        return newCoordinate;


    }
    

    public void changeIcon(MovingDirection direction) {
        super.setIcon(movingImages.get(direction));        
    }
    
  
}
