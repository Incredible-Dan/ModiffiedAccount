package com.DisplayingTextWithDialogBox;
import javax.swing.JOptionPane;
public class EnteringTextInDialog {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        String message = String.format(" %s, Welcome to Java Programming!", name);
        JOptionPane.showMessageDialog(null, message);
    }
}
