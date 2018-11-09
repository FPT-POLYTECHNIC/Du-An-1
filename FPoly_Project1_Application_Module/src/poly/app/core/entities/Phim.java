package poly.app.core.entities;
// Generated Nov 9, 2018 10:03:06 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Phim generated by hbm2java
 */
public class Phim  implements java.io.Serializable {


     private String id;
     private LoaiPhim loaiPhim;
     private String ten;
     private int thoiLuong;
     private int gioiHanTuoi;
     private Date ngayCongChieu;
     private String ngonNgu;
     private String dienVien;
     private String quocGia;
     private String nhaSanXuat;
     private String tomTat;
     private String trangThai;
     private Boolean daXoa;
     private Set<SuatChieu> suatChieus = new HashSet<SuatChieu>(0);

    public Phim() {
    }

	
    public Phim(String id, LoaiPhim loaiPhim, String ten, int thoiLuong, int gioiHanTuoi, Date ngayCongChieu, String ngonNgu, String quocGia, String nhaSanXuat, String trangThai) {
        this.id = id;
        this.loaiPhim = loaiPhim;
        this.ten = ten;
        this.thoiLuong = thoiLuong;
        this.gioiHanTuoi = gioiHanTuoi;
        this.ngayCongChieu = ngayCongChieu;
        this.ngonNgu = ngonNgu;
        this.quocGia = quocGia;
        this.nhaSanXuat = nhaSanXuat;
        this.trangThai = trangThai;
    }
    public Phim(String id, LoaiPhim loaiPhim, String ten, int thoiLuong, int gioiHanTuoi, Date ngayCongChieu, String ngonNgu, String dienVien, String quocGia, String nhaSanXuat, String tomTat, String trangThai, Boolean daXoa, Set<SuatChieu> suatChieus) {
       this.id = id;
       this.loaiPhim = loaiPhim;
       this.ten = ten;
       this.thoiLuong = thoiLuong;
       this.gioiHanTuoi = gioiHanTuoi;
       this.ngayCongChieu = ngayCongChieu;
       this.ngonNgu = ngonNgu;
       this.dienVien = dienVien;
       this.quocGia = quocGia;
       this.nhaSanXuat = nhaSanXuat;
       this.tomTat = tomTat;
       this.trangThai = trangThai;
       this.daXoa = daXoa;
       this.suatChieus = suatChieus;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public LoaiPhim getLoaiPhim() {
        return this.loaiPhim;
    }
    
    public void setLoaiPhim(LoaiPhim loaiPhim) {
        this.loaiPhim = loaiPhim;
    }
    public String getTen() {
        return this.ten;
    }
    
    public void setTen(String ten) {
        this.ten = ten;
    }
    public int getThoiLuong() {
        return this.thoiLuong;
    }
    
    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }
    public int getGioiHanTuoi() {
        return this.gioiHanTuoi;
    }
    
    public void setGioiHanTuoi(int gioiHanTuoi) {
        this.gioiHanTuoi = gioiHanTuoi;
    }
    public Date getNgayCongChieu() {
        return this.ngayCongChieu;
    }
    
    public void setNgayCongChieu(Date ngayCongChieu) {
        this.ngayCongChieu = ngayCongChieu;
    }
    public String getNgonNgu() {
        return this.ngonNgu;
    }
    
    public void setNgonNgu(String ngonNgu) {
        this.ngonNgu = ngonNgu;
    }
    public String getDienVien() {
        return this.dienVien;
    }
    
    public void setDienVien(String dienVien) {
        this.dienVien = dienVien;
    }
    public String getQuocGia() {
        return this.quocGia;
    }
    
    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }
    public String getNhaSanXuat() {
        return this.nhaSanXuat;
    }
    
    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }
    public String getTomTat() {
        return this.tomTat;
    }
    
    public void setTomTat(String tomTat) {
        this.tomTat = tomTat;
    }
    public String getTrangThai() {
        return this.trangThai;
    }
    
    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }
    public Boolean getDaXoa() {
        return this.daXoa;
    }
    
    public void setDaXoa(Boolean daXoa) {
        this.daXoa = daXoa;
    }
    public Set<SuatChieu> getSuatChieus() {
        return this.suatChieus;
    }
    
    public void setSuatChieus(Set<SuatChieu> suatChieus) {
        this.suatChieus = suatChieus;
    }




}


