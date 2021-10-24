package Behavior.Chain;

import javax.swing.*;

public class WindowLogger extends LoggerHandler{

    public WindowLogger(LoggerHandler nextLogger) {
        super(nextLogger);
    }

    @Override
    public void printLog(String massage) {
        JOptionPane.showMessageDialog(new JFrame(), massage);
    }
}
