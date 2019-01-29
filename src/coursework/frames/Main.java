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
  static  ArrayList<Staff> staff = new ArrayList<Staff>(Arrays.asList(new Staff("Georgi","Iliev",new BigDecimal(1038324)), new Boss("Test","Test",
            new BigDecimal(1093018),new BigDecimal(123412))));

    public static void main(String[] args) {
        JFrame frame = new JFrame("CourseWork");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton addButton = new JButton("Add");
        JButton listButton = new JButton("List");

        FlowLayout layout = new FlowLayout();
        frame.setLayout(layout);


        frame.add(addButton);
        frame.add(listButton);

        addButton.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                initalizeFormFrame();
            }
        });

        frame.pack();
        frame.setVisible(true);

        System.out.println(staff.size());
    }

    public static void initalizeFormFrame(){
        String[] roles = {"Boss", "Staff"};
        JComboBox  rolesBox = new JComboBox(roles);
        JButton  addStaff = new JButton("Add to Staff");
        JFrame form  = new JFrame("Staff Form");
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        addStaff.setBounds(10,10,10,10);
        form.add(rolesBox);
        form.add(addStaff);
        form.pack();
        form.setVisible(true);
        addStaff.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                switch (rolesBox.getSelectedItem().toString()){
                    case "Boss" :
                        System.out.println("will Create new Boss");
                        break;

                    case "Staff":
                        System.out.println("will Create new Staff");
                        break;
                }
            }
        });
    }

}

