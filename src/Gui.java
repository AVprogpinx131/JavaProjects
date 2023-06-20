import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class Gui implements ActionListener {
        private static JLabel firstName;
        private static JTextField firstNameText;
        private static JLabel lastName;
        private static JTextField lastNameText;
        private static JLabel age;
        private static JTextField ageText;
        private static JButton userFeedback;
        private static JLabel displayFirstName;
        private static JLabel displayLastName;
        private static JLabel displayAge;


        public static void main(String args[]) {
            JFrame frame = new JFrame("Getting data from the user");
            JPanel panel = new JPanel();
            frame.setSize(400, 400);
            frame.setResizable(false);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(panel);

            panel.setLayout(null);

            firstName = new JLabel("First Name:");
            firstName.setBounds(20, 40, 80, 25);
            panel.add(firstName);

            firstNameText = new JTextField();
            firstNameText.setBounds(100, 40, 165, 25);
            panel.add(firstNameText);

            lastName = new JLabel("Last name:");
            lastName.setBounds(20, 80, 80, 25);
            panel.add(lastName);

            lastNameText = new JTextField();
            lastNameText.setBounds(100, 80, 165, 25);
            panel.add(lastNameText);

            age = new JLabel("Your age:");
            age.setBounds(20, 120, 80, 25);
            panel.add(age);

            ageText = new JTextField();
            ageText.setBounds(100, 120, 165, 25);
            panel.add(ageText);

            userFeedback = new JButton("Click Me");
            userFeedback.setBounds(20, 180, 90, 40);
            userFeedback.setBackground(new Color(100, 105, 255));
            userFeedback.setForeground(Color.WHITE);
            userFeedback.setBorder(BorderFactory.createEmptyBorder());
            userFeedback.addActionListener(new Gui());
            panel.add(userFeedback);

            displayFirstName = new JLabel("");
            displayFirstName.setBounds(20, 240, 200, 25);
            panel.add(displayFirstName);

            displayLastName = new JLabel("");
            displayLastName.setBounds(20, 270, 200, 25);
            panel.add(displayLastName);

            displayAge = new JLabel("");
            displayAge.setBounds(20, 300, 100, 25);
            panel.add(displayAge);
            frame.setVisible(true);

        }


        @Override
        public void actionPerformed(ActionEvent e) {
            String userFirstName = firstNameText.getText();
            String userLastName = lastNameText.getText();
            String userAge = ageText.getText();

            displayFirstName.setText("Your first name is " + userFirstName);
            displayLastName.setText("Your last name is " + userLastName);
            displayAge.setText("Your age is " + userAge);
        }
    }
