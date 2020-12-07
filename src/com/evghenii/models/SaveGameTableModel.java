package com.evghenii.models;


import com.evghenii.objects.MapInfo;
import com.evghenii.objects.SavedMapInfo;

import javax.swing.table.AbstractTableModel;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class SaveGameTableModel extends AbstractTableModel {

    private final ArrayList<SavedMapInfo> list;

    public SaveGameTableModel(ArrayList<SavedMapInfo> list) {
        this.list = list;
    }
    
    public MapInfo getMapInfo(int index){
        return list.get(index);
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    private DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object value = null;
        switch (columnIndex) {
            case 0:
                value = rowIndex + 1;
                break;
            case 1:
                value = list.get(rowIndex).getUser().getUsername();
                break;
            case 2:
                Date date = new Date(list.get(rowIndex).getSaveDate());
                value = dateFormat.format(date);
                break;
            case 3:
                value = list.get(rowIndex).getTotalScore();
                break;
            case 4:
                value = list.get(rowIndex).getTurnsCount();
                break;


            default:
                throw new IndexOutOfBoundsException("Column index out of bounds: " + // NOI18N
                        columnIndex);
        }
        return value;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        Class<?> clazz;
        switch (columnIndex) {
            case 0:
            case 3:
            case 4:
                clazz = Integer.class;
                break;
            case 1:
            case 2:
                clazz = String.class;
                break;
           

            default:
                throw new IndexOutOfBoundsException("Column index out of bounds: " + columnIndex);
        }
        return clazz;
    }

    @Override
    public String getColumnName(int column) {
        String columnName;
        switch (column) {
            case 0:
                columnName = "№";
                break;
            case 1:
                columnName = "Имя игрока";
                break;
            case 2:
                columnName = "Дата игры";
                break;
            case 3:
                columnName = "Кол-во очков";
                break;
            case 4:
                columnName = "Кол-во ходов";
                break;
            default:
                throw new IndexOutOfBoundsException("Column index out of bounds: " + column);
        }
        return columnName;
    }
    
    public void deleteMapInfo(int index){
        list.remove(index);
    }

    public void refresh() {
        fireTableDataChanged();
    }
}