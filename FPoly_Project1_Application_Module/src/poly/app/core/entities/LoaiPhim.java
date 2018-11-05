package poly.app.core.entities;
// Generated Nov 5, 2018 2:07:26 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * LoaiPhim generated by hbm2java
 */
public class LoaiPhim  implements java.io.Serializable {


     private Integer id;
     private String ten;
     private Set<Phim> phims = new HashSet<Phim>(0);

    public LoaiPhim() {
    }

	
    public LoaiPhim(String ten) {
        this.ten = ten;
    }
    public LoaiPhim(String ten, Set<Phim> phims) {
       this.ten = ten;
       this.phims = phims;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
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

    public String toString() {
        return this.getTen();
    }


}


