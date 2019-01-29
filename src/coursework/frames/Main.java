package coursework.frames;

import coursework.models.Boss;
import coursework.models.Staff;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CourseWork");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton addButton = new JButton("Add");
        frame.add(addButton);
        addButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                initalizeFormFrame();
            }
        });
        frame.pack();
        frame.setVisible(true);
    }

    public static void initalizeFormFrame(){
        JFrame createFrame = new JFrame("Create Staff");
        createFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createFrame.setContentPane(new CreateForm().getPanel());
        createFrame.pack();
        createFrame.setVisible(true);
    }

}

