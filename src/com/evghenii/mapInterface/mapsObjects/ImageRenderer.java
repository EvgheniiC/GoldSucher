package com.evghenii.mapInterface.mapsObjects;

import com.evghenii.abstractsGame.AbstractGameObject;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;


public class ImageRenderer extends DefaultTableCellRenderer {

    private JLabel label = new JLabel();
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected,
            boolean hasFocus, int row, int column) {

        label.setText(null);
        label.setIcon(((AbstractGameObject) value).getImageIcon());
        
        return label;
    }
}