package com.evghenii.gui;


import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public abstract class ConfirmCloseFrame extends BaseChildFrame {

    protected abstract boolean acceptCloseAction();

    @Override
    protected void setCloseOperation() {
        super.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        super.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {

                if (acceptCloseAction()) {
                    closeFrame();
                }
            }
        });

    }
}
