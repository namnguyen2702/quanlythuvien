package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FrameManageBooks extends JFrame {
    public FrameManageBooks() {
        setTitle("Quản lý sách");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Thêm bảng hiển thị danh sách sách
        String[] columns = {"Mã sách", "Tên sách", "Tác giả", "Thể loại", "Giá"};
        Object[][] data = {
                {"001", "Lập trình Java", "Nguyễn Văn A", "Công nghệ thông tin", 100000},
                {"002", "SQL cơ bản", "Trần Thị B", "Công nghệ thông tin", 90000},
        };
        JTable booksTable = new JTable(data, columns);

        // Thêm nút thêm, sửa, xóa sách
        JButton addBookButton = new JButton("Thêm sách");
        JButton editBookButton = new JButton("Sửa thông tin sách");
        JButton deleteBookButton = new JButton("Xóa sách");

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addBookButton);
        buttonPanel.add(editBookButton);
        buttonPanel.add(deleteBookButton);

        add(new JScrollPane(booksTable), BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }
}
