/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database.transactions;

import database.DbConnection;
import database.IBilgiController;
import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KrediCekme extends DbConnection implements IBilgiController {

    private int cekilecekmiktar = 0;
 
    private boolean borc_durumu;
    private String tur = null, tarih =  LocalDate.now().toString();
    
    
    
     public boolean basvuruonaylandimi() {
        if (this.bilgilerGeçerlimi()) {
            if (this.kredi_durumu()) {
                return false;
            } else {
                this.basvuruyuOnayla();
                return true;
            }
        } else {
            return false;
        }
    }
    
  
public boolean kredi_durumu() {
    String query = "SELECT borc_durum FROM kredi_tablo " +
                   "WHERE kullanici_id = ?";
    try {
        PreparedStatement ps = super.connection.prepareStatement(query);
        ps.setInt(1, this.getHesapBilgileri().getKullanici_id());
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return rs.getBoolean("borc_durum");
        }
    } catch (SQLException ex) {
        Logger.getLogger(KrediCekme.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;
}

public int kontrolEtKullaniciId() {
    int kullaniciId = this.getHesapBilgileri().getKullanici_id();
    int sonuc = 0;

    try {
        String query = "SELECT COUNT(*) FROM kredi_tablo WHERE kullanici_id = ?";
        try {
            PreparedStatement ps = super.connection.prepareStatement(query);
            ps.setInt(1, kullaniciId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                // "kullanici_id" değeri bulunuyorsa 1, bulunmuyorsa 0
                sonuc = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(KrediCekme.class.getName()).log(Level.SEVERE, null, ex);
        }
    } catch (Exception ex) {
        Logger.getLogger(KrediCekme.class.getName()).log(Level.SEVERE, null, ex);
    }

    return sonuc;
}

    
public void basvuruyuOnayla() {
    int kullaniciId = this.getHesapBilgileri().getKullanici_id();
    int mevcutKullaniciId = kontrolEtKullaniciId();

    try {
        // Otomatik işlem modunu kapat
          super.connection.setAutoCommit(false);

        if (mevcutKullaniciId==0) {
            // Kullanıcı_id değeri yoksa (0 ise) yeni kayıt ekleniyor
            String query = "INSERT INTO kredi_tablo (kullanici_id, tarih, tur, borc, borc_durum) VALUES (?, ?, ?, ?, ?)";
            try {
                PreparedStatement ps = super.connection.prepareStatement(query);
                ps.setInt(1, kullaniciId);
                ps.setString(2, this.tarih);
                ps.setString(3, this.tur);
                ps.setInt(4, this.cekilecekmiktar);
                ps.setBoolean(5, this.borc_durumu);
                ps.executeUpdate();
            } catch (SQLException ex) {
                // Hata durumunda geri alma (rollback)
                super.connection.rollback();
                    int errorCode = ex.getErrorCode();
                    String errorMessage = ex.getMessage();
                    Logger.getLogger(KrediCekme.class.getName()).log(Level.SEVERE, "Veritabanı Hatası - ErrorCode: " + errorCode + ", ErrorMessage: " + errorMessage, ex);
            }
        } else {
            // Kullanıcı_id değeri varsa, güncelleme işlemi yapılır
            if (this.getCekilecekmiktar() != 0) {
                // Miktar 0 değilse sadece borç miktarını güncelle
                String updateQuery = "UPDATE kredi_tablo SET borc = borc + ?, borc_durum = ? WHERE kullanici_id = ?";
                try {
                    PreparedStatement updatePs = super.connection.prepareStatement(updateQuery);
                    updatePs.setBigDecimal(1, BigDecimal.valueOf(this.getCekilecekmiktar()));
                    updatePs.setBoolean(2, true); // Borç durumu true olarak güncelleniyor
                    updatePs.setInt(3, kullaniciId);
                    updatePs.executeUpdate();
                } catch (SQLException ex) {
                    // Hata durumunda geri alma (rollback)
                    super.connection.rollback();
                    Logger.getLogger(KrediCekme.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                // Kullanıcı_id değeri varsa ve miktar 0 ise bir şey yapma
                Logger.getLogger(KrediCekme.class.getName()).log(Level.INFO, "Kredi durumu zaten mevcut ve miktar 0.");
            }
        }

        // Commit işlemi
        super.connection.commit();
    } catch (SQLException ex) {
        // Hata durumunda geri alma (rollback)
        try {
            super.connection.rollback();
        } catch (SQLException rollbackEx) {
            Logger.getLogger(KrediCekme.class.getName()).log(Level.SEVERE, null, rollbackEx);
        }
        Logger.getLogger(KrediCekme.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        try {
            // Otomatik işlem modunu geri aç
            super.connection.setAutoCommit(true);
        } catch (SQLException autoCommitEx) {
            Logger.getLogger(KrediCekme.class.getName()).log(Level.SEVERE, null, autoCommitEx);
        }
    }
}





    @Override
    public boolean bilgilerGeçerlimi() {
        return !(this.cekilecekmiktar ==0 
                || this.tur == null
               
                 );
               
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
return HesapBilgileri.getInstance();
        }

    public int getCekilecekmiktar() {
        return cekilecekmiktar;
    }

    public void setCekilecekmiktar(int cekilecekmiktar) {
        this.cekilecekmiktar = cekilecekmiktar;
    }


    public boolean isBorc_durumu() {
        return borc_durumu;
    }

    public void setBorc_durumu(boolean borc_durumu) {
        this.borc_durumu = borc_durumu;
    }

    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    public String getTarih() {
        return tarih;
    }

   public void setTarih() {
    this.tarih = LocalDate.now().toString();
}


    
    

    
    
    
    
    
}
