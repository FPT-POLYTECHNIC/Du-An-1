package e;
// Generated Dec 4, 2018 2:43:49 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SuatChieu generated by hbm2java
 */
public class SuatChieu  implements java.io.Serializable {


     private String id;
     private DinhDangPhim dinhDangPhim;
     private Phim phim;
     private PhongChieu phongChieu;
     private Date gioBatDau;
     private Date gioKetThuc;
     private Date ngayChieu;
     private Set<VeBan> veBans = new HashSet<VeBan>(0);

    public SuatChieu() {
    }

	
    public SuatChieu(String id, DinhDangPhim dinhDangPhim, Phim phim, PhongChieu phongChieu, Date gioBatDau, Date gioKetThuc, Date ngayChieu) {
        this.id = id;
        this.dinhDangPhim = dinhDangPhim;
        this.phim = phim;
        this.phongChieu = phongChieu;
        this.gioBatDau = gioBatDau;
        this.gioKetThuc = gioKetThuc;
        this.ngayChieu = ngayChieu;
    }
    public SuatChieu(String id, DinhDangPhim dinhDangPhim, Phim phim, PhongChieu phongChieu, Date gioBatDau, Date gioKetThuc, Date ngayChieu, Set<VeBan> veBans) {
       this.id = id;
       this.dinhDangPhim = dinhDangPhim;
       this.phim = phim;
       this.phongChieu = phongChieu;
       this.gioBatDau = gioBatDau;
       this.gioKetThuc = gioKetThuc;
       this.ngayChieu = ngayChieu;
       this.veBans = veBans;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public DinhDangPhim getDinhDangPhim() {
        return this.dinhDangPhim;
    }
    
    public void setDinhDangPhim(DinhDangPhim dinhDangPhim) {
        this.dinhDangPhim = dinhDangPhim;
    }
    public Phim getPhim() {
        return this.phim;
    }
    
    public void setPhim(Phim phim) {
        this.phim = phim;
    }
    public PhongChieu getPhongChieu() {
        return this.phongChieu;
    }
    
    public void setPhongChieu(PhongChieu phongChieu) {
        this.phongChieu = phongChieu;
    }
    public Date getGioBatDau() {
        return this.gioBatDau;
    }
    
    public void setGioBatDau(Date gioBatDau) {
        this.gioBatDau = gioBatDau;
    }
    public Date getGioKetThuc() {
        return this.gioKetThuc;
    }
    
    public void setGioKetThuc(Date gioKetThuc) {
        this.gioKetThuc = gioKetThuc;
    }
    public Date getNgayChieu() {
        return this.ngayChieu;
    }
    
    public void setNgayChieu(Date ngayChieu) {
        this.ngayChieu = ngayChieu;
    }
    public Set<VeBan> getVeBans() {
        return this.veBans;
    }
    
    public void setVeBans(Set<VeBan> veBans) {
        this.veBans = veBans;
    }




}


