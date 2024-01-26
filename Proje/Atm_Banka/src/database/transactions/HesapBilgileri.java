
package database.transactions;


import database.DbVeriMerkezi;
import database.IBilgiController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;


public class HesapBilgileri extends DbVeriMerkezi implements  IBilgiController{
    
    //SİNGLETON
    private static HesapBilgileri  hesapBilgileri=null;
    
    public static HesapBilgileri getInstance() {
        
        if (hesapBilgileri==null) {
            hesapBilgileri=new HesapBilgileri();
        }
        return  hesapBilgileri;
    }
    
    public void cikisyap(){
        super.kullanici_id=0;
        super.adSoyad=null;
        super.tcNo=null;
        super.telNo=null;
        super.musteriNo=null;
        super.bakiye=0;
        super.elektrik_faturasi=0;
        super.su_faturasi=0;
        super.dogalgaz_faturasi=0;
        super.internet_faturasi=0;
        super.tur=null;
        super.borc=0;
        super.borc_durum=true;
        
        
        
    }

 
   
    @Override
    public boolean bilgilerGeçerlimi() {
        return !(super.kullanici_id==0);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        this.borccAl();
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    public void girisYap(String musteriKimlik){
        
       this.kullaniciyiAl(musteriKimlik);
       this.bakiyeAl();
       this.faturalariAl();
       this.borccAl();
       this.borcdurumAl();
    }
    
    //KULLANİCİ HESAP BİLGİLERİNİ ALMA İŞLEMLERİ
   private void kullaniciyiAl(String MusteriKimlik) {
    String query = "SELECT * FROM kullanicilar WHERE "
            + "tc_no='" + MusteriKimlik + "' "
            + "OR "
            + "musteri_no='" + MusteriKimlik + "'";
    
    try {
        super.statement = super.connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        while (rs.next()) {
            super.kullanici_id = rs.getInt("kullanici_ID");
            super.adSoyad = rs.getString("ad_soyad");
            super.tcNo = rs.getString("tc_no");
            super.telNo = rs.getString("tel_no");
            super.musteriNo = rs.getString("musteri_no");
        }
    } catch (SQLException ex) {
        Logger.getLogger(HesapBilgileri.class.getName()).log(Level.SEVERE, null, ex);
    }
}
    
   
   private void bakiyeAl() {
    if (this.bilgilerGeçerlimi()) {
        String query = "SELECT * FROM kullanici_bakiye " +
                       "WHERE kullanici_id = '" + super.getKullanici_id() + "'";
        
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = super.statement.executeQuery(query);
            
            while (rs.next()) {
                super.bakiye = rs.getDouble("bakiye");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(HesapBilgileri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
    private void turAl() {
    if (this.bilgilerGeçerlimi()) {
        String query = "SELECT * FROM kredi_tablo " +
                       "WHERE kullanici_id = '" + super.getKullanici_id() + "'";
        
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = super.statement.executeQuery(query);
            
            while (rs.next()) {
                super.tur = rs.getString("tur");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(HesapBilgileri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
    private void borccAl() {
    if (this.bilgilerGeçerlimi()) {
        String query = "SELECT * FROM kredi_tablo " +
                       "WHERE kullanici_id = '" + super.getKullanici_id() + "'";
        
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = super.statement.executeQuery(query);
            
            while (rs.next()) {
                super.borc = rs.getDouble("borc");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(HesapBilgileri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
    
    private void borcdurumAl() {
    if (this.bilgilerGeçerlimi()) {
        String query = "SELECT * FROM kredi_tablo " +
                       "WHERE kullanici_id = '" + super.getKullanici_id() + "'";
        
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = super.statement.executeQuery(query);
            
            while (rs.next()) {
                super.borc_durum = rs.getBoolean("borc_durum");
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(HesapBilgileri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

    
    private void faturalariAl() {
    if (this.bilgilerGeçerlimi()) {
        String query = "SELECT * FROM kullanici_faturalar " +
                       "WHERE kullanici_id = '" + super.getKullanici_id() + "'";
        
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = super.statement.executeQuery(query);
            
            while (rs.next()) {
                super.elektrik_faturasi = rs.getDouble("elektrik");
                super.su_faturasi = rs.getDouble("su");
                super.internet_faturasi = rs.getDouble("internet");
                super.dogalgaz_faturasi = rs.getDouble("dogalgaz");
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(HesapBilgileri.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

}
