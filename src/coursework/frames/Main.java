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
import java.util.Collections;

public class Main {
    static ArrayList<String> staffList = new ArrayList<String>();
    public static void main(String[] args) {
        JFrame frame = new JFrame("CourseWork");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new CreateForm().initalizeForm());
        frame.pack();
        frame.setVisible(true);
    }

   /* public static Container createForm(){

        JPanel createFormPanel = new JPanel();
        createFormPanel.setLayout(new GridLayout(7, 2, -1, -1));

        final JLabel label4 = new JLabel();
        label4.setText("Result:");
        createFormPanel.add(label4);

        JTextField resultField = new JTextField();
        resultField.setEditable(false);
        resultField.setEnabled(false);
        createFormPanel.add(resultField);

        final JLabel chooseStaffLabel = new JLabel();
        chooseStaffLabel.setText("Choose:");
        createFormPanel.add(chooseStaffLabel);

        JComboBox roleComboBox = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
        defaultComboBoxModel1.addElement("Staff");
        defaultComboBoxModel1.addElement("Boss");
        roleComboBox.setModel(defaultComboBoxModel1);
        createFormPanel.add(roleComboBox);

        final JLabel label5 = new JLabel();
        label5.setText("First Name:");
        createFormPanel.add(label5);

        JTextField firstNameTextField = new JTextField();
        firstNameTextField.setText("");
        createFormPanel.add(firstNameTextField);

        final JLabel label1 = new JLabel();
        label1.setText("Last Name:");
        createFormPanel.add(label1);
        JTextField lastNameTextField = new JTextField();
        createFormPanel.add(lastNameTextField);
        final JLabel label2 = new JLabel();
        label2.setText("Salary:");
        createFormPanel.add(label2);
        JTextField salaryTextField = new JTextField();
        createFormPanel.add(salaryTextField);
        final JLabel label3 = new JLabel();
        label3.setText("Bonus Salary:");
        createFormPanel.add(label3);
        JTextField bonusSalary = new JTextField();
        bonusSalary.setEditable(true);
        bonusSalary.setEnabled(true);
        bonusSalary.setText("");
        createFormPanel.add(bonusSalary);
        JButton addButton = new JButton();
        addButton.setText("Add");
        createFormPanel.add(addButton);
         JButton listButton = new JButton();
        listButton.setText("List");
        createFormPanel.add(listButton);


        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Staff currentEmployee=null;

                if("Boss".equals(roleComboBox.getSelectedItem().toString())){
                    currentEmployee=new Boss(firstNameTextField.getText(),
                            lastNameTextField.getText(),
                            new BigDecimal(salaryTextField.getText()),
                            new BigDecimal(bonusSalary.getText()));
                }else if("Staff".equals(roleComboBox.getSelectedItem().toString())){
                    currentEmployee=new Staff(firstNameTextField.getText(),
                            lastNameTextField.getText(),
                            new BigDecimal(salaryTextField.getText()));
                }



                for (Component component : createFormPanel.getComponents()){
                    if ( component instanceof JTextField){
                        ((JTextField) component).setText("");
                    }
                }

                if(staffList.contains(currentEmployee)){
                    resultField.setText("Employee alredy exists");
                }else{
                    staffList.add(currentEmployee.getLastName() + " - " + currentEmployee.getClass().getSimpleName());
                    resultField.setText("Staff Added Successfully");

                }

            }
        });

        listButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Collections.sort(staffList);
                String resultListString = String.join(", ",staffList);

                for(int i=0;i<staffList.size();i++){
                    System.out.println(resultListString);
                }

                resultField.setText(resultListString);

            }
        });


        return createFormPanel;

    }*/



}

