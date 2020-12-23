package com.evghenii.gameobjects.abstracts;

import com.evghenii.enums.GameObjectType;
import com.evghenii.gameobjects.impl.Coordinate;
import com.evghenii.gameobjects.interfaces.StaticObject;

import java.io.Serializable;
import java.util.EnumMap;
import java.util.Objects;
import javax.swing.ImageIcon;

/**
 * класс, который отвечает за любой объект, созданный в игре. задает все общие
 * характеристики объектов в игре
 */
public abstract class AbstractGameObject implements StaticObject, Serializable {

    protected static EnumMap<GameObjectType, ImageIcon> staticImages = new EnumMap<>(GameObjectType.class);// карта иконок для всех направлений
    private GameObjectType type;// все объекты будут иметь тип
    private Coordinate coordinate;// все объекты будут иметь координаты положения
    private ImageIcon icon = getImageIcon("/com/evghenii/noicon.png");// изображение по-умолчанию

    public AbstractGameObject(GameObjectType type, Coordinate coordinate, String icon) {
        this.type = type;
        this.coordinate = coordinate;
        this.icon = new ImageIcon(icon);
    }

    protected AbstractGameObject() {// частый вопрос - нужен ли public конструктор в абстрактном классе
    }

    public void setIcon(ImageIcon currentIcon) {
        this.icon = currentIcon;
    }

    @Override
    public ImageIcon getIcon() {
        return icon;
    }

    protected ImageIcon getImageIcon(String path) {
        return new ImageIcon(getClass().getResource(path));
    }

    @Override
    public GameObjectType getType() {
        return type;
    }

    public void setType(GameObjectType type) {
        this.type = type;
    }

    @Override
    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 43 * hash + Objects.hashCode(this.type);
        hash = 43 * hash + Objects.hashCode(this.coordinate);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AbstractGameObject other = (AbstractGameObject) obj;
        if (this.type != other.type) {
            return false;
        }
        if (!Objects.equals(this.coordinate, other.coordinate)) {
            return false;
        }
        return true;
    }

    protected void saveIcon(String path) {
        if (staticImages.get(type) == null) {
            staticImages.put(type, getImageIcon(path));
        }
        setIcon(staticImages.get(type));
    }
}
