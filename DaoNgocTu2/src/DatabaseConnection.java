import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseConnection {

    // Phương thức tạo và trả về kết nối
    public static Connection getConnection() throws SQLException {
        String server = "LAPTOP-8DRKN78O\\SQLEXPRESS";  // Tên server của SQL Server
        String user = "sa";  // Tên người dùng
        String password = "123456789";  // Mật khẩu
        String db = "BaiThiTuTo";  // Tên cơ sở dữ liệu
        int port = 1433;  // Cổng kết nối

        // Tạo nguồn dữ liệu
        SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser(user);
        ds.setPassword(password);
        ds.setDatabaseName(db);
        ds.setServerName(server);
        ds.setPortNumber(port);
        ds.setTrustServerCertificate(true);  // Tin tưởng chứng chỉ máy chủ (bỏ qua SSL)

        // Trả về kết nối
        return ds.getConnection();
    }

    public static void main(String[] args) {
        // Sử dụng try-with-resources để tự động đóng kết nối
        try (Connection connection = getConnection()) {
            if (connection != null) {
                System.out.println("Kết nối thành công!");
            }
        } catch (SQLException ex) {
            System.err.println("Lỗi kết nối: " + ex.getMessage());
        }
    }
}
