package cz.uhk.fim.rrsreader.app;

import cz.uhk.fim.rrsreader.gui.MainFrame;

import javax.swing.*;

public class App {
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
}
