import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class EmployeeForm extends JFrame implements ActionListener {
    private JTextField idField, nameField, salaryField;
    private JButton insertButton, viewButton, deleteButton;
    private ArrayList<String> employeeRecords;

    public EmployeeForm() {
        setTitle("Employee Management System");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel idLabel = new JLabel("Employee ID:");
        idField = new JTextField(10);

        JLabel nameLabel = new JLabel("Name:");
        nameField = new JTextField(10);

        JLabel salaryLabel = new JLabel("Salary:");
        salaryField = new JTextField(10);

        insertButton = new JButton("Insert");
        viewButton = new JButton("View");
        deleteButton = new JButton("Delete");

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));
        panel.add(idLabel);
        panel.add(idField);
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(salaryLabel);
        panel.add(salaryField);
        panel.add(insertButton);
        panel.add(viewButton);
        panel.add(deleteButton);

        insertButton.addActionListener(this);
        viewButton.addActionListener(this);
        deleteButton.addActionListener(this);

        add(panel);
        setVisible(true);

        employeeRecords = new ArrayList<>();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == insertButton) {
            String id = idField.getText();
            String name = nameField.getText();
            String salary = salaryField.getText();
            String record = "ID: " + id + ", Name: " + name + ", Salary: " + salary;
            employeeRecords.add(record);
            JOptionPane.showMessageDialog(this, "Record inserted successfully!");
            clearFields();
        } else if (e.getSource() == viewButton) {
            StringBuilder records = new StringBuilder();
            for (String record : employeeRecords) {
                records.append(record).append("\n");
            }
            JOptionPane.showMessageDialog(this, "Employee Records:\n" + records.toString());
        } else if (e.getSource() == deleteButton) {
            if (employeeRecords.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No records to delete!");
            } else {
                int index = employeeRecords.size() - 1;
                String removedRecord = employeeRecords.remove(index);
                JOptionPane.showMessageDialog(this, "Record deleted:\n" + removedRecord);
            }
        }
    }

    private void clearFields() {
        idField.setText("");
        nameField.setText("");
        salaryField.setText("");
    }

    public static void main(String[] args) {
        new EmployeeForm();
    }
}
