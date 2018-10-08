package cz.uhk.fim.rrsreader.gui;

import com.sun.org.apache.xml.internal.security.Init;

import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame() {init();}

    private void init(){
        setTitle("RSS Reader");
        setSize(800,600);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);


    }
}
