package Controller;

import DBconnect.Connect;
import Models.Model_User;
import java.sql.*;

public class UserDAO {

    // Phương thức đăng nhập
    public Model_User login(String username, String password) {
        Model_User user = null;
        try (Connection conn = new Connect().getConnection()) {
            // Câu lệnh SQL kiểm tra username và password
            String query = "SELECT * FROM login WHERE username = ? AND password = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, username);
            stmt.setString(2, password);

            ResultSet rs = stmt.executeQuery();

            // Nếu tìm thấy người dùng, lấy thông tin người dùng
            if (rs.next()) {
                String userId = rs.getString("user_id");

                // Gọi phương thức getUserById() để lấy thông tin đầy đủ
                user = getUserById(userId);
            } else {
                System.out.println("Thông tin đăng nhập không hợp lệ.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    // Phương thức lấy thông tin người dùng theo ID (đã có sẵn)
    public Model_User getUserById(String userId) {
        Model_User user = null;
        try (Connection conn = new Connect().getConnection()) {
            String query = "SELECT * FROM user WHERE user_id = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, userId);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                user = new Model_User(
                        rs.getString("user_id"),
                        rs.getString("Ten"),
                        rs.getString("Gioi tinh"),
                        rs.getDate("Ngay sinh"),
                        rs.getString("Dia chi"),
                        rs.getString("Sdt"),
                        rs.getString("CMND"),
                        rs.getString("avatar"),
                        rs.getString("chucvu"),
                        rs.getInt("so_du")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }
}

