// LoginPage.java
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class LoginPage extends JFrame implements ActionListener {
    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton, signupButton;
    JLabel statusLabel;

    public LoginPage() {
        setTitle("Login Page");
        setLayout(null);
        setSize(400, 300);

        JLabel userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 50, 80, 30);
        add(userLabel);

        usernameField = new JTextField();
        usernameField.setBounds(150, 50, 150, 30);
        add(usernameField);

        JLabel passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 100, 80, 30);
        add(passLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(150, 100, 150, 30);
        add(passwordField);

        loginButton = new JButton("Login");
        loginButton.setBounds(50, 160, 100, 30);
        loginButton.addActionListener(this);
        add(loginButton);

        signupButton = new JButton("Sign Up");
        signupButton.setBounds(200, 160, 100, 30);
        signupButton.addActionListener(e -> {
            new SignupPage(); // open signup
            dispose();
        });
        add(signupButton);

        statusLabel = new JLabel();
        statusLabel.setBounds(50, 200, 300, 30);
        add(statusLabel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String user = usernameField.getText();
        String pass = new String(passwordField.getPassword());
        if (authenticate(user, pass)) {
            statusLabel.setText("Login successful!");
        } else {
            statusLabel.setText("Invalid credentials. Try again.");
        }
    }

    private boolean authenticate(String username, String password) {
        try (Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/yourdb", "youruser", "yourpass")) {
            String sql = "SELECT * FROM users WHERE username=? AND password=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, username);
            pst.setString(2, password);
            ResultSet rs = pst.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            statusLabel.setText("Database error.");
            return false;
        }
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}

// SignupPage.java (similar structure with full name, username, password, etc.)
// Insert user into table "users" in PostgreSQL with INSERT statement.
