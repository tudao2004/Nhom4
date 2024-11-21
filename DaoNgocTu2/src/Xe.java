public class Xe {
    // Các thuộc tính
    private String maSoXe;   // Mã số xe (ID của xe)
    private String tenXe;     // Tên xe (model hoặc loại xe)
    private String hangSanXuat;  // Hãng sản xuất
    private String mauSac;    // Màu sắc của xe
    private int namSanXuat;   // Năm sản xuất
    private int soBanhXe;     // Số bánh xe
    private double giaXe;     // Giá trị của xe
    private String loaiNhienLieu; // Loại nhiên liệu (xăng, diesel, điện,...)

    // Constructor
    public Xe(String maSoXe, String tenXe, String hangSanXuat, String mauSac, int namSanXuat, int soBanhXe, double giaXe, String loaiNhienLieu) {
        this.maSoXe = maSoXe;
        this.tenXe = tenXe;
        this.hangSanXuat = hangSanXuat;
        this.mauSac = mauSac;
        this.namSanXuat = namSanXuat;
        this.soBanhXe = soBanhXe;
        this.giaXe = giaXe;
        this.loaiNhienLieu = loaiNhienLieu;
    }

    // Getter và Setter
    public String getMaSoXe() {
        return maSoXe;
    }

    public void setMaSoXe(String maSoXe) {
        this.maSoXe = maSoXe;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public int getSoBanhXe() {
        return soBanhXe;
    }

    public void setSoBanhXe(int soBanhXe) {
        this.soBanhXe = soBanhXe;
    }

    public double getGiaXe() {
        return giaXe;
    }

    public void setGiaXe(double giaXe) {
        this.giaXe = giaXe;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    // Phương thức toString để hiển thị thông tin về xe
    @Override
    public String toString() {
        return "Xe{" +
                "Mã số xe='" + maSoXe + '\'' +
                ", Tên xe='" + tenXe + '\'' +
                ", Hãng sản xuất='" + hangSanXuat + '\'' +
                ", Màu sắc='" + mauSac + '\'' +
                ", Năm sản xuất=" + namSanXuat +
                ", Số bánh xe=" + soBanhXe +
                ", Giá xe=" + giaXe +
                ", Loại nhiên liệu='" + loaiNhienLieu + '\'' +
                '}';
    }

    // Phương thức để khởi động xe (ví dụ)
    public void khoiDongXe() {
        System.out.println("Xe " + tenXe + " đang khởi động.");
    }

    // Phương thức để dừng xe (ví dụ)
    public void dungXe() {
        System.out.println("Xe " + tenXe + " đã dừng.");
    }
}
