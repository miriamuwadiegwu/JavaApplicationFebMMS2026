import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class AppointmentForm extends JFrame {

    JTextField nameField, phoneField, dobField, appointmentField;
    JComboBox<String> genderBox;
    JButton saveButton;

    public AppointmentForm() {
        setTitle("Appointment Form");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2, 10, 10));

        // 1. Full Name
        add(new JLabel("Full Name:"));
        nameField = new JTextField();
        add(nameField);

        // 2. Gender
        add(new JLabel("Gender:"));
        String[] genders = {"Male", "Female", "Other"};
        genderBox = new JComboBox<>(genders);
        add(genderBox);

        // 3. Phone Number
        add(new JLabel("Phone Number:"));
        phoneField = new JTextField();
        add(phoneField);

        // 4. Date of Birth
        add(new JLabel("Date of Birth (DD/MM/YYYY):"));
        dobField = new JTextField();
        add(dobField);

        // 5. Appointment Date
        add(new JLabel("Appointment Date (DD/MM/YYYY):"));
        appointmentField = new JTextField();
        add(appointmentField);

        // Save Button
        add(new JLabel(""));
        saveButton = new JButton("Save Appointment");
        add(saveButton);

        // When Save is clicked
        saveButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveToFile();
            }
        });

        setVisible(true);
    }

    void saveToFile() {
        String name = nameField.getText();
        String gender = (String) genderBox.getSelectedItem();
        String phone = phoneField.getText();
        String dob = dobField.getText();
        String appointment = appointmentField.getText();

        // Check if any field is empty
        if (name.isEmpty() || phone.isEmpty() || dob.isEmpty() || appointment.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all fields!");
            return;
        }

        try {
            // This creates appointments.txt in the same folder
            FileWriter writer = new FileWriter("appointments.txt", true);
            writer.write("Full Name: " + name + "\n");
            writer.write("Gender: " + gender + "\n");
            writer.write("Phone Number: " + phone + "\n");
            writer.write("Date of Birth: " + dob + "\n");
            writer.write("Appointment Date: " + appointment + "\n");
            writer.write("-----------------------------------\n");
            writer.close();

            JOptionPane.showMessageDialog(this, "Saved to appointments.txt successfully!");

            // Clear fields after saving
            nameField.setText("");
            phoneField.setText("");
            dobField.setText("");
            appointmentField.setText("");

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error saving file!");
        }
    }

    public static void main(String[] args) {
        new AppointmentForm();
    }
}