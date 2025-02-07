package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FrameMainMenu extends JFrame {
    public FrameMainMenu() {
        setTitle("Quản lý thư viện");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Tạo các nút chức năng
        JButton manageBooksButton = new JButton("Quản lý sách");
        JButton manageUsersButton = new JButton("Quản lý người dùng");
        JButton viewLogsButton = new JButton("Xem nhật ký hoạt động");
        JButton logoutButton = new JButton("Đăng xuất");

        // Thêm sự kiện cho các nút
        manageBooksButton.addActionListener(this::onManageBooks);
//        manageUsersButton.addActionListener(this::onManageUsers);
//        viewLogsButton.addActionListener(this::onViewLogs);
        logoutButton.addActionListener(e -> onLogout());

        // Sắp xếp các nút trên giao diện
        JPanel panel = new JPanel(new GridLayout(4, 1, 10, 10));
        panel.add(manageBooksButton);
        panel.add(manageUsersButton);
        panel.add(viewLogsButton);
        panel.add(logoutButton);

        add(panel, BorderLayout.CENTER);
    }

    private void onManageBooks(ActionEvent e) {
        // Mở giao diện quản lý sách
        new FrameManageBooks().setVisible(true);
        dispose();  // Đóng cửa sổ hiện tại
    }

//    private void onManageUsers(ActionEvent e) {
//        // Mở giao diện quản lý người dùng
//        new FrameManageUsers().setVisible(true);
//        dispose();
//    }
//
//    private void onViewLogs(ActionEvent e) {
//        // Mở giao diện nhật ký hoạt động
//        new FrameViewLogs().setVisible(true);
//        dispose();
//    }

    private void onLogout() {
        // Đăng xuất và trở về màn hình đăng nhập
        new FrameLogin().setVisible(true);
        dispose();
    }
}
