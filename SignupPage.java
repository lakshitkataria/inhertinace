import javax.swing.*;

public class SignupPage extends JFrame {
    public SignupPage() {
        setTitle("Sign Up");
        setLayout(null);
        setSize(400, 400);

        // Example signup fields
        JLabel nameLabel = new JLabel("Full Name:");
        nameLabel.setBounds(50, 50, 80, 30);
        add(nameLabel);

        JTextField nameField = new JTextField();
        nameField.setBounds(150, 50, 150, 30);
        add(nameField);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(50, 100, 80, 30);
        add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setBounds(150, 100, 150, 30);
        add(emailField);

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(50, 150, 80, 30);
        add(usernameLabel);

        JTextField usernameField = new JTextField();
        usernameField.setBounds(150, 150, 150, 30);
        add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(50, 200, 80, 30);
        add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(150, 200, 150, 30);
        add(passwordField);

        JButton registerButton = new JButton("Register");
        registerButton.setBounds(150, 250, 100, 30);
        // You would add registration logic here, e.g. database save
        add(registerButton);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}

