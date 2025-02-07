package DBconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    private Connection con;

    public Connect() {
        connect();
    }

    private void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/library?characterEncoding=utf8";
            String user = "root";
            String password = "";
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Kết nối CSDL thành công.");
        } catch (Exception e) {
            System.err.println("Lỗi khi kết nối CSDL: " + e.getMessage());
        }
    }

    public Connection getConnection() {
        return con;
    }

    public void closeConnection() {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
                System.out.println("Đã đóng kết nối CSDL.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
