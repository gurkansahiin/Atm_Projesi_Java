
package database.transactions;

import database.DbConnection;
import database.IBilgiController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SifreYenileme extends DbConnection implements IBilgiController{

    private String tcNo=null;
    private String telNo=null;
    private String guvenlik_cevap=null;
    private String eskiSifre=null;
    private String yeniSifre=null;
    
    public  boolean sifreYenilendiMi(){
        if (this.bilgilerGeçerlimi()) {
       String query = "UPDATE kullanicilar " +
               "SET sifre = '" + this.yeniSifre + "'" +
               " WHERE tc_no = '" + this.tcNo + "'" +
               " AND tel_no = '" + this.telNo + "'" +
               " AND guvenlik_cevap = '" + this.guvenlik_cevap + "'";
            if (this.eskiSifre!=null) {
            query+=   " AND sifre = '" + this.eskiSifre + "'";
    
            }

        try {
            super.statement = super.connection.createStatement();
            return  statement.executeUpdate(query)==1;

            
                
        } catch (SQLException ex) {
            Logger.getLogger(ParaCekme.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return true;
    }else{
        return false;
    }
    }
    
    @Override
    public boolean bilgilerGeçerlimi() {
        return !(tcNo==null
               || telNo==null
               || guvenlik_cevap==null 
               || eskiSifre==null
               || yeniSifre==null);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getGuvenlik_cevap() {
        return guvenlik_cevap;
    }

    public void setGuvenlik_cevap(String guvenlik_cevap) {
        this.guvenlik_cevap = guvenlik_cevap;
    }

    public String getEskiSifre() {
        return eskiSifre;
    }

    public void setEskiSifre(String eskiSifre) {
        this.eskiSifre = eskiSifre;
    }

    public String getYeniSifre() {
        return yeniSifre;
    }

    public void setYeniSifre(String yeniSifre) {
        this.yeniSifre = yeniSifre;
    }
    
    
    
}
