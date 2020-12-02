
package com.evghenii.gui;

public class FrameMainMenu extends javax.swing.JFrame {

    private FrameGame frameGame = new FrameGame();
    private FrameStat frameStat = new FrameStat();
    private FrameSavedGames frameLoadGame = new FrameSavedGames();
    

    public FrameMainMenu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnlMainMenu = new javax.swing.JPanel();
        jbtnNewGame = new javax.swing.JButton();
        jbtnLoadGame = new javax.swing.JButton();
        jbtnStatistics = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();

        FormListener formListener = new FormListener();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Игра");
        setName("FrameMainMenu"); // NOI18N
        setResizable(false);

        jpnlMainMenu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jbtnNewGame.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jbtnNewGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/javabegin/training/game/images/new.png"))); // NOI18N
        jbtnNewGame.setText("Новая игра");
        jbtnNewGame.setToolTipText("Создать новую игру");
        jbtnNewGame.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnNewGame.setIconTextGap(10);
        jbtnNewGame.addActionListener(formListener);

        jbtnLoadGame.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jbtnLoadGame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/javabegin/training/game/images/load.png"))); // NOI18N
        jbtnLoadGame.setText("Загрузить игру");
        jbtnLoadGame.setToolTipText("Загрузить сохраненную игру ");
        jbtnLoadGame.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnLoadGame.setIconTextGap(10);
        jbtnLoadGame.addActionListener(formListener);

        jbtnStatistics.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jbtnStatistics.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/javabegin/training/game/images/stat.png"))); // NOI18N
        jbtnStatistics.setText("Статистика");
        jbtnStatistics.setToolTipText("Посмотреть статистику по игрокам");
        jbtnStatistics.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnStatistics.setIconTextGap(10);
        jbtnStatistics.addActionListener(formListener);

        jbtnExit.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jbtnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/javabegin/training/game/images/exit.png"))); // NOI18N
        jbtnExit.setText("Выход");
        jbtnExit.setToolTipText("Выйти из игры");
        jbtnExit.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbtnExit.setIconTextGap(10);
        jbtnExit.addActionListener(formListener);

        javax.swing.GroupLayout jpnlMainMenuLayout = new javax.swing.GroupLayout(jpnlMainMenu);
        jpnlMainMenu.setLayout(jpnlMainMenuLayout);
        jpnlMainMenuLayout.setHorizontalGroup(
            jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlMainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbtnLoadGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnStatistics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnNewGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnlMainMenuLayout.setVerticalGroup(
            jpnlMainMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnlMainMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnNewGame, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnLoadGame, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnStatistics, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jpnlMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnlMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-267)/2, (screenSize.height-310)/2, 267, 310);
    }

    // Code for dispatching events from components to event handlers.

    private class FormListener implements java.awt.event.ActionListener {
        FormListener() {}
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            if (evt.getSource() == jbtnNewGame) {
                FrameMainMenu.this.jbtnNewGameActionPerformed(evt);
            }
            else if (evt.getSource() == jbtnStatistics) {
                FrameMainMenu.this.jbtnStatisticsActionPerformed(evt);
            }
            else if (evt.getSource() == jbtnExit) {
                FrameMainMenu.this.jbtnExitActionPerformed(evt);
            }
            else if (evt.getSource() == jbtnLoadGame) {
                FrameMainMenu.this.jbtnLoadGameActionPerformed(evt);
            }
        }
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNewGameActionPerformed
        frameGame.showFrame(this);
    }//GEN-LAST:event_jbtnNewGameActionPerformed

    private void jbtnStatisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnStatisticsActionPerformed
        frameStat.showFrame(this);
    }//GEN-LAST:event_jbtnStatisticsActionPerformed

    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        quit();
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnLoadGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLoadGameActionPerformed
        frameLoadGame.showFrame(this);
    }//GEN-LAST:event_jbtnLoadGameActionPerformed


    private void quit() {
        System.exit(0);// не рекомендуется так делать, т.к. могут быть другие процессы

    }

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameMainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameMainMenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JButton jbtnExit;
    javax.swing.JButton jbtnLoadGame;
    javax.swing.JButton jbtnNewGame;
    javax.swing.JButton jbtnStatistics;
    javax.swing.JPanel jpnlMainMenu;
    // End of variables declaration//GEN-END:variables

    
    
}
