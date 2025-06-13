package org.example;

import javax.swing.SwingUtilities;
import Paginas.Login;


public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Login();
        });
    }
}
