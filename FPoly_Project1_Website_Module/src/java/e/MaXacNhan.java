package e;
// Generated Dec 4, 2018 2:43:49 PM by Hibernate Tools 4.3.1



/**
 * MaXacNhan generated by hbm2java
 */
public class MaXacNhan  implements java.io.Serializable {


     private String nguoiDungId;
     private NguoiDung nguoiDung;
     private String maXacNhan;

    public MaXacNhan() {
    }

    public MaXacNhan(NguoiDung nguoiDung, String maXacNhan) {
       this.nguoiDung = nguoiDung;
       this.maXacNhan = maXacNhan;
    }
   
    public String getNguoiDungId() {
        return this.nguoiDungId;
    }
    
    public void setNguoiDungId(String nguoiDungId) {
        this.nguoiDungId = nguoiDungId;
    }
    public NguoiDung getNguoiDung() {
        return this.nguoiDung;
    }
    
    public void setNguoiDung(NguoiDung nguoiDung) {
        this.nguoiDung = nguoiDung;
    }
    public String getMaXacNhan() {
        return this.maXacNhan;
    }
    
    public void setMaXacNhan(String maXacNhan) {
        this.maXacNhan = maXacNhan;
    }




}


