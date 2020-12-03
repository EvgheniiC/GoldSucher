package com.evghenii.objects;

import java.io.Serializable;
import java.util.Objects;

public class Coordinate implements Serializable {

    private int height;
    private int width;

    public Coordinate(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void setHeightAndWidth(int height, int width){
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return height == that.height &&
                width == that.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width);
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
