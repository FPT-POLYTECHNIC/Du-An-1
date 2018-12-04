package e;
// Generated Dec 4, 2018 2:43:49 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * PhongChieu generated by hbm2java
 */
public class PhongChieu  implements java.io.Serializable {


     private Integer id;
     private int soLuongDay;
     private int soLuongCot;
     private Set<SuatChieu> suatChieus = new HashSet<SuatChieu>(0);
     private Set<GheNgoi> gheNgois = new HashSet<GheNgoi>(0);

    public PhongChieu() {
    }

	
    public PhongChieu(int soLuongDay, int soLuongCot) {
        this.soLuongDay = soLuongDay;
        this.soLuongCot = soLuongCot;
    }
    public PhongChieu(int soLuongDay, int soLuongCot, Set<SuatChieu> suatChieus, Set<GheNgoi> gheNgois) {
       this.soLuongDay = soLuongDay;
       this.soLuongCot = soLuongCot;
       this.suatChieus = suatChieus;
       this.gheNgois = gheNgois;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public int getSoLuongDay() {
        return this.soLuongDay;
    }
    
    public void setSoLuongDay(int soLuongDay) {
        this.soLuongDay = soLuongDay;
    }
    public int getSoLuongCot() {
        return this.soLuongCot;
    }
    
    public void setSoLuongCot(int soLuongCot) {
        this.soLuongCot = soLuongCot;
    }
    public Set<SuatChieu> getSuatChieus() {
        return this.suatChieus;
    }
    
    public void setSuatChieus(Set<SuatChieu> suatChieus) {
        this.suatChieus = suatChieus;
    }
    public Set<GheNgoi> getGheNgois() {
        return this.gheNgois;
    }
    
    public void setGheNgois(Set<GheNgoi> gheNgois) {
        this.gheNgois = gheNgois;
    }




}


