package View;

import Controller.UserDAO;
import Models.Model_User;
import javax.swing.*;

public class FrameLogin extends JFrame {
    public FrameLogin() {
        // Giao diện cơ bản...
        JLabel usernameLabel = new JLabel("Tên đăng nhập:");
        JTextField usernameField = new JTextField(20);

        JLabel passwordLabel = new JLabel("Mật khẩu:");
        JPasswordField passwordField = new JPasswordField(20);

        JButton loginButton = new JButton("Đăng nhập");

        loginButton.addActionListener(e -> {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            UserDAO userDAO = new UserDAO();
            Model_User user = userDAO.login(username, password);

            if (user != null) {
                JOptionPane.showMessageDialog(this, "Đăng nhập thành công! Xin chào, " + user.getTen());
                new FrameMainMenu().setVisible(true);  // Mở giao diện chính
                dispose();  // Đóng cửa sổ đăng nhập
            } else {
                JOptionPane.showMessageDialog(this, "Sai thông tin đăng nhập!");
            }
        });


        JPanel panel = new JPanel();
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);

        add(panel);
        pack();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FrameLogin().setVisible(true));
    }
}

