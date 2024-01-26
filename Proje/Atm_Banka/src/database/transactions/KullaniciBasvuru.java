/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database.transactions;

import database.DbConnection;
import database.IBilgiController;
import gui.ayarlar.TextAyarlar;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KullaniciBasvuru extends DbConnection implements IBilgiController {

    //Başvuru Bilgileri
    private String adSoyad = null, tcNo = null, telNo = null;
    private String guvenliksorusu = null, guvenlikcevap = null;

    //Sistem tarafından verilecek bilgiler
    private String musteriNo = null;
    private String sifre = null;

    public boolean basvuruonaylandimi() {
        if (this.bilgilerGeçerlimi()) {
            if (this.TcNoTablodaVarMi()) {
                return false;
            } else {
                this.basvuruyuOnayla();
                return true;
            }
        } else {
            return false;
        }
    }

    private boolean TcNoTablodaVarMi() {
        String query = "SELECT tc_no FROM kullanicilar WHERE tc_no=?";
        ResultSet rs = null;
        try {
            PreparedStatement ps = super.connection.prepareStatement(query);
            ps.setString(1, this.tcNo);
            rs = ps.executeQuery();

            while (rs.next()) {
                return true; // Eğer tabloda veri bulunmuşsa true döner
            }
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciBasvuru.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(KullaniciBasvuru.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return false;
    }

    public boolean musterinotablodavar_mi() {
        String query = "SELECT musteri_no FROM kullanicilar WHERE musteri_no='" + this.musteriNo + "'";
        try {
            super.statement = super.connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                return true;

            }
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciBasvuru.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    private void basvuruyuOnayla() {
        String query = "INSERT INTO kullanicilar (ad_soyad,tc_no,"
                + "tel_no,guvenlik_sorusu,guvenlik_cevap,musteri_no,sifre)"
                + "VALUES(?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = super.connection.prepareStatement(query);
            ps.setString(1, this.adSoyad);
            ps.setString(2, this.tcNo);
            ps.setString(3, this.telNo);
            ps.setString(4, this.guvenliksorusu);
            ps.setString(5, this.guvenlikcevap);
            ps.setString(6, this.musteriNo);
            ps.setString(7, this.sifre);

            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(KullaniciBasvuru.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean bilgilerGeçerlimi() {
        return !(this.adSoyad == null
                || this.tcNo == null
                || this.telNo == null
                || this.guvenliksorusu == null
                || this.guvenlikcevap == null
                || this.musteriNo == null
                || this.sifre == null
                || TextAyarlar.uzunlukSundanKucukmu(11, this.tcNo)
                || TextAyarlar.uzunlukSundanKucukmu(11, this.telNo));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
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

    public String getGuvenliksorusu() {
        return guvenliksorusu;
    }

    public void setGuvenliksorusu(String guvenliksorusu) {
        this.guvenliksorusu = guvenliksorusu;
    }

    public String getGuvenlikcevap() {
        return guvenlikcevap;
    }

    public void setGuvenlikcevap(String guvenlikcevap) {
        this.guvenlikcevap = guvenlikcevap;
    }

    public String getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(String musteriNo) {
        this.musteriNo = musteriNo;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

}
