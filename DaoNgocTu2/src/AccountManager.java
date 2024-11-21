
import java.sql.Connection; // Sử dụng đúng lớp java.sql.Connection
import java.sql.PreparedStatement; // Sử dụng đúng PreparedStatement
import java.sql.ResultSet; // Sử dụng đúng ResultSet
import java.sql.SQLException; // Sử dụng đúng SQLException
import java.sql.Statement; // Sử dụng đúng Statement để thực thi các câu lệnh SQL
import java.util.ArrayList;

public class AccountManager {

    public ArrayList<Account> getAccounts() {
        ArrayList<Account> accounts = new ArrayList<>();
        String query = "SELECT TenTaiKhoan, MatKhau FROM QuanLyTaiKhoan"; // Chú ý tên bảng là QuanLyTaiKhoan

        try (Connection conn = DatabaseConnection.getConnection(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                String username = rs.getString("TenTaiKhoan");
                String password = rs.getString("MatKhau");
                accounts.add(new Account(username, password));
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return accounts;
    }

    // Thêm tài khoản
    public boolean addAccount(String username, String password) {
        String query = "INSERT INTO QuanLyTaiKhoan (TenTaiKhoan, MatKhau) VALUES (?, ?)"; // Cập nhật bảng và cột

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, username);
            stmt.setString(2, password);

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    // Cập nhật tài khoản
    public boolean updateAccount(String username, String newPassword) {
        String query = "UPDATE QuanLyTaiKhoan SET MatKhau = ? WHERE TenTaiKhoan = ?"; // Cập nhật bảng và cột

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, newPassword);
            stmt.setString(2, username);

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    // Xóa tài khoản
    public boolean deleteAccount(String username) {
        String query = "DELETE FROM QuanLyTaiKhoan WHERE TenTaiKhoan = ?"; // Cập nhật bảng và cột

        try (Connection conn = DatabaseConnection.getConnection(); PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, username);

            int rowsAffected = stmt.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
