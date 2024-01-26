
package database.transactions;


import database.DbConnection;
import database.IBilgiController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Kullanici_Giris extends  DbConnection implements IBilgiController{

    private  String MusteriKimlik=null;
    private  String Sifre=null;
    
    @Override
    public boolean bilgilerGeçerlimi() {
        return !(this.MusteriKimlik == null
                ||this.Sifre==null);
    }
    
  private boolean girisbasarilimi() {
    String query = "SELECT tc_no, musteri_no, sifre FROM kullanicilar "
            + "WHERE "
            + "(tc_no='" + this.MusteriKimlik + "'"
            + " OR "
            + "musteri_no='" + this.MusteriKimlik + "') "
            + "AND "
            + "sifre='" + this.Sifre + "'";
    try {
        super.statement = super.connection.createStatement();
        ResultSet rs = statement.executeQuery(query);
        while (rs.next()) {
            return true;
        }
    } catch (SQLException ex) {
        Logger.getLogger(Kullanici_Giris.class.getName()).log(Level.SEVERE, null, ex);
    }
    return false;
}


    public boolean girisBilgileriDogruMu() {
        if (bilgilerGeçerlimi()) {
            if (girisbasarilimi()) {
                this.getHesapBilgileri().girisYap(MusteriKimlik);
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
    
    
    
    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public String getMusteriKimlik() {
        return MusteriKimlik;
    }

    public void setMusteriKimlik(String MusteriKimlik) {
        this.MusteriKimlik = MusteriKimlik;
    }

    public String getSifre() {
        return Sifre;
    }

    public void setSifre(String Sifre) {
        this.Sifre = Sifre;
    }
    
    
    
}
