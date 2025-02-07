package Models;

import java.sql.Date;

public class Model_User {
    private String userId;
    private String ten;
    private String gioiTinh;
    private Date ngaySinh;
    private String diaChi;
    private String dienThoai;
    private String cmnd;
    private String avatar;
    private String chucVu;
    private int soDu;

    public Model_User(String userId, String ten, String gioiTinh, Date ngaySinh, String diaChi, String dienThoai, String cmnd, String avatar, String chucVu, int soDu) {
        this.userId = userId;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.dienThoai = dienThoai;
        this.cmnd = cmnd;
        this.avatar = avatar;
        this.chucVu = chucVu;
        this.soDu = soDu;
    }

    // Getter và Setter...
    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }
    public String getTen() { return ten; }
    public void setTen(String ten) { this.ten = ten; }
    public String getGioiTinh() { return gioiTinh; }
    public void setGioiTinh(String gioiTinh) { this.gioiTinh = gioiTinh; }
    public Date getNgaySinh() { return ngaySinh; }
    public void setNgaySinh(Date ngaySinh) { this.ngaySinh = ngaySinh; }
    public String getDiaChi() { return diaChi; }
    public void setDiaChi(String diaChi) { this.diaChi = diaChi; }
    public String getDienThoai() { return dienThoai; }
    public void setDienThoai(String dienThoai) { this.dienThoai = dienThoai; }
    public String getCmnd() { return cmnd; }
    public void setCmnd(String cmnd) { this.cmnd = cmnd; }
    public String getAvatar() { return avatar; }
    public void setAvatar(String avatar) { this.avatar = avatar; }
    public String getChucVu() { return chucVu; }
    public void setChucVu(String chucVu) { this.chucVu = chucVu; }
    public int getSoDu() { return soDu; }
    public void setSoDu(int soDu) { this.soDu = soDu; }
}
