package poly.app.core.entities;
// Generated Nov 7, 2018 7:54:44 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * LoaiPhim generated by hbm2java
 */
public class LoaiPhim implements java.io.Serializable {

    private int id;
    private String ten;
    private Set<Phim> phims = new HashSet<Phim>(0);

    public LoaiPhim() {
    }

    public LoaiPhim(int id, String ten) {
        this.id = id;
        this.ten = ten;
    }

    public LoaiPhim(int id, String ten, Set<Phim> phims) {
        this.id = id;
        this.ten = ten;
        this.phims = phims;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return this.ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Set<Phim> getPhims() {
        return this.phims;
    }

    public void setPhims(Set<Phim> phims) {
        this.phims = phims;
    }

    @Override
    public String toString() {
        return ten;
    }

}
