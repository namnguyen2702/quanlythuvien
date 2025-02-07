package Controller;

import View.FrameLogin;
import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new FrameLogin().setVisible(true);  // Khởi động giao diện đăng nhập
        });
    }
}
