package com.evghenii.gamemap.impl;

import com.evghenii.collections.interfaces.GameCollection;
import com.evghenii.enums.GameObjectType;
import com.evghenii.gamemap.abstracts.AbstractGameMap;
import com.evghenii.gamemap.interfaces.TimeMap;
import com.evghenii.gameobjects.abstracts.AbstractGameObject;
import com.evghenii.movestrategies.impl.AgressiveMoving;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JTableGameMap extends AbstractGameMap implements TimeMap {

    private transient JTable jTableMap = new JTable();
    private transient String[] columnNames;
    // объекты для отображения на карте будут храниться в двумерном массиве типа AbstractGameObject
    // каждый элемент массива будет обозначаться согласно текстовому представлению объекта как описано в GameObjectType
    private transient AbstractGameObject[][] mapObjects;
    private transient TimeMover timeMover = new TimeMover();

    public JTableGameMap(GameCollection gameCollection) {
        super(gameCollection);


        try {
            prepareTable();
            updateObjectsArray();
        } catch (Exception ex) {
            Logger.getLogger(JTableGameMap.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

    private void updateObjectsArray() {

        mapObjects = new AbstractGameObject[mapInfo.getHeight()][mapInfo.getWidth()];

        for (AbstractGameObject gameObj : getGameCollection().getAllGameObjects()) {
            int y = gameObj.getCoordinate().getY();
            int x = gameObj.getCoordinate().getX();
            if (mapObjects[y][x] != null) { // если в этих координатах уже есть какой то объект
                mapObjects[y][x] = getGameCollection().getObjectByCoordinate(x, y);
            } else {
                mapObjects[y][x] = gameObj;
            }
        }
    }

    @Override
    public boolean updateMap() {

        if (mapObjects == null || mapObjects.length == 0) {
            updateObjectsArray();
        }

        if (jTableMap.getModel().getRowCount() == 0) {
            updateModel();
        }

        return true;
    }

    @Override
    public Component getMapComponent() {
        return jTableMap;
    }

    @Override
    public void start() {
        timeMover.start();
    }

    @Override
    public void stop() {
        timeMover.stop();
    }

    @Override
    public void updateMapObjects(AbstractGameObject obj1, AbstractGameObject obj2) {

        if (obj1 != null) {
            int y1 = obj1.getCoordinate().getY();
            int x1 = obj1.getCoordinate().getX();

            ((AbstractTableModel) jTableMap.getModel()).setValueAt(getGameCollection().getObjectByCoordinate(x1, y1), y1, x1);
        }

        if (obj2 != null) {
            int y2 = obj2.getCoordinate().getY();
            int x2 = obj2.getCoordinate().getX();

            ((AbstractTableModel) jTableMap.getModel()).setValueAt(getGameCollection().getObjectByCoordinate(x2, y2), y2, x2);
        }

    }

    private boolean updateModel() {

        try {


            // присваиваем пустоту всем заголовкам столбцов, чтобы у таблицы не было заголовоков, а то некрасиво смотрится
            columnNames = new String[mapInfo.getWidth()];

            for (int i = 0; i < columnNames.length; i++) {
                columnNames[i] = "";
            }


            // игровое поле будет отображаться в super без заголовков столбцов
            jTableMap.setModel(new DefaultTableModel(mapObjects, columnNames));


            // вместо текста в ячейках таблицы устанавливаем отображение картинки
            for (int i = 0; i < jTableMap.getColumnCount(); i++) {
                jTableMap.getColumnModel().getColumn(i).setCellRenderer(new ImageRenderer());
                TableColumn a = jTableMap.getColumnModel().getColumn(i);
                a.setPreferredWidth(26);
            }


        } catch (Exception ex) {
            Logger.getLogger(JTableGameMap.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }

    private void prepareTable() {
        jTableMap.setEnabled(false);
        jTableMap.setSize(new java.awt.Dimension(300, 300));
        jTableMap.setRowHeight(26);
        jTableMap.setRowSelectionAllowed(false);
        jTableMap.setShowHorizontalLines(false);
        jTableMap.setShowVerticalLines(false);
        jTableMap.setTableHeader(null);
        jTableMap.setUpdateSelectionOnSort(false);
        jTableMap.setVerifyInputWhenFocusTarget(false);
    }

    private class TimeMover implements ActionListener {

        private Timer timer;
        private final static int MOVING_PAUSE = 500;
        private final static int INIT_PAUSE = 1000;

        private TimeMover() {
            timer = new Timer(MOVING_PAUSE, this);
            timer.setInitialDelay(INIT_PAUSE);
        }

        public void start() {
            timer.start();
        }

        public void stop() {
            timer.stop();
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            getGameCollection().moveObject(new AgressiveMoving(), GameObjectType.MONSTER);
        }
    }
}
