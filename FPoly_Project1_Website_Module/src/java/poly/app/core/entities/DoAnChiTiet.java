package poly.app.core.entities;
// Generated Nov 7, 2018 7:54:44 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * DoAnChiTiet generated by hbm2java
 */
public class DoAnChiTiet  implements java.io.Serializable {


     private int id;
     private DoAn doAn;
     private KichCoDoAn kichCoDoAn;
     private int donGia;
     private Boolean dangBan;
     private Set<HoaDonChiTiet> hoaDonChiTiets = new HashSet<HoaDonChiTiet>(0);

    public DoAnChiTiet() {
    }

	
    public DoAnChiTiet(int id, DoAn doAn, KichCoDoAn kichCoDoAn, int donGia) {
        this.id = id;
        this.doAn = doAn;
        this.kichCoDoAn = kichCoDoAn;
        this.donGia = donGia;
    }
    public DoAnChiTiet(int id, DoAn doAn, KichCoDoAn kichCoDoAn, int donGia, Boolean dangBan, Set<HoaDonChiTiet> hoaDonChiTiets) {
       this.id = id;
       this.doAn = doAn;
       this.kichCoDoAn = kichCoDoAn;
       this.donGia = donGia;
       this.dangBan = dangBan;
       this.hoaDonChiTiets = hoaDonChiTiets;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public DoAn getDoAn() {
        return this.doAn;
    }
    
    public void setDoAn(DoAn doAn) {
        this.doAn = doAn;
    }
    public KichCoDoAn getKichCoDoAn() {
        return this.kichCoDoAn;
    }
    
    public void setKichCoDoAn(KichCoDoAn kichCoDoAn) {
        this.kichCoDoAn = kichCoDoAn;
    }
    public int getDonGia() {
        return this.donGia;
    }
    
    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
    public Boolean isDangBan() {
        return this.dangBan;
    }
    
    public void setDangBan(Boolean dangBan) {
        this.dangBan = dangBan;
    }
    public Set<HoaDonChiTiet> getHoaDonChiTiets() {
        return this.hoaDonChiTiets;
    }
    
    public void setHoaDonChiTiets(Set<HoaDonChiTiet> hoaDonChiTiets) {
        this.hoaDonChiTiets = hoaDonChiTiets;
    }

    
    
    
}

