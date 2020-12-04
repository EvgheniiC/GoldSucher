package com.evghenii.abstractsGame;

import com.evghenii.enums.GameObjectType;
import com.evghenii.mapInterface.GameMap;
import com.evghenii.objects.Coordinate;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.HashMap;

public abstract class AbstractMapObject implements GameMap, Serializable {

    private static final long serialVersionUID = 1L;
    private int width;
    private int height;
    private int limit;
    private String name;

    private boolean isExitExist;
    private boolean isGoldManExist;

    private HashMap<Coordinate, AbstractGameObject> gameObjects = new HashMap<>();
    private EnumMap<GameObjectType, ArrayList<AbstractGameObject>> typeObject = new EnumMap<>(GameObjectType.class);


    @Override
    public int getTimeLimit() {
        return limit;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public AbstractGameObject getPriorityObject(AbstractGameObject first, AbstractGameObject second) {
        return (first.getType().getIndexOfPriority() > second.getType().getIndexOfPriority() ? first : second);
    }

    public boolean isValidMap() {
        return isExitExist && isGoldManExist;
    }

    public ArrayList<AbstractGameObject> getList(GameObjectType type) {
        return typeObject.get(type);
    }

    public AbstractGameObject getObjectByCoordinat(Coordinate coordinate) {
        return gameObjects.get(coordinate);
    }

    public AbstractGameObject getObjectByCoordinat(int x, int y) {
        return gameObjects.get(new Coordinate(x, y));
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getLimit() {
        return limit;
    }

    public boolean isExitExist() {
        return isExitExist;
    }

    public void setExitExist(boolean exitExist) {
        isExitExist = exitExist;
    }

    public boolean isGoldManExist() {
        return isGoldManExist;
    }

    public void setGoldManExist(boolean goldManExist) {
        isGoldManExist = goldManExist;
    }

    public HashMap<Coordinate, AbstractGameObject> getGameObjects() {
        return gameObjects;
    }

    public void setGameObjects(HashMap<Coordinate, AbstractGameObject> gameObjects) {
        this.gameObjects = gameObjects;
    }

    public EnumMap<GameObjectType, ArrayList<AbstractGameObject>> getTypeObject() {
        return typeObject;
    }

    public void setTypeObject(EnumMap<GameObjectType, ArrayList<AbstractGameObject>> typeObject) {
        this.typeObject = typeObject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGameObject(AbstractGameObject gameObject) {

        ArrayList<AbstractGameObject> list = typeObject.get(gameObject.getType());

        if (list == null){
            list = new ArrayList<>();
        } else {
            list.add(gameObject);
        }

        gameObjects.put(gameObject.getCoordinate(),gameObject);
        typeObject.put(gameObject.getType(),list);
    }


    public ArrayList<AbstractGameObject> getGameObjects(GameObjectType type) {
        return typeObject.get(type);
    }

    public Collection<AbstractGameObject> getAllGameObjects() {
        return gameObjects.values();
    }
}
