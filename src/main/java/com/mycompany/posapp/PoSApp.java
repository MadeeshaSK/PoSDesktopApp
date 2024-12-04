package com.mycompany.posapp;

import javax.swing.SwingUtilities;
import view.CustomerView;

public class PoSApp {

    public static void main(String[] args) {
        // Print Hello World to console
        System.out.println("Hello World!");

        // Use SwingUtilities.invokeLater to ensure the JFrame is created on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Create and display the CustomerView JFrame
                new CustomerView().setVisible(true);
            }
        });
    }
}

