package e;
// Generated Dec 4, 2018 2:43:49 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * LoaiDoAn generated by hbm2java
 */
public class LoaiDoAn  implements java.io.Serializable {


     private String id;
     private String ten;
     private Set<DoAn> doAns = new HashSet<DoAn>(0);

    public LoaiDoAn() {
    }

	
    public LoaiDoAn(String id, String ten) {
        this.id = id;
        this.ten = ten;
    }
    public LoaiDoAn(String id, String ten, Set<DoAn> doAns) {
       this.id = id;
       this.ten = ten;
       this.doAns = doAns;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public String getTen() {
        return this.ten;
    }
    
    public void setTen(String ten) {
        this.ten = ten;
    }
    public Set<DoAn> getDoAns() {
        return this.doAns;
    }
    
    public void setDoAns(Set<DoAn> doAns) {
        this.doAns = doAns;
    }




}


