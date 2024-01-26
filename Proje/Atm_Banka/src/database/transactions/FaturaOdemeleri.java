
package database.transactions;

import database.DbConnection;
import database.IBilgiController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class FaturaOdemeleri extends DbConnection implements IBilgiController{

      private String Faturaİsmi=null;
      private double FaturaTutari=0;
      
    
      public  boolean FaturaOdendiMi(){
          
          if(bilgilerGeçerlimi()) {
                String query = "UPDATE kullanici_faturalar " +
               "SET " + this.Faturaİsmi + " = 0 " +
               "WHERE kullanici_id = '" + this.getHesapBilgileri().getKullanici_id() + "'";


           
        try {
            super.statement = super.connection.createStatement();
            statement.executeUpdate(query);
           
             this.bakiyeazalt();
             this.faturayisifirla();
        } catch (SQLException ex) {
            Logger.getLogger(ParaCekme.class.getName()).log(Level.SEVERE, null, ex);
        } 
              return  true;
          }
          else{
              return  false;
          }
      }
    @Override
    public boolean bilgilerGeçerlimi() {
        return !(this.Faturaİsmi==null || this.FaturaTutari==0 
                || getHesapBilgileri().getBakiye()<this.FaturaTutari);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return  HesapBilgileri.getInstance();
    }
    
private void faturayisifirla() {
    if (bilgilerGeçerlimi()) {
        
        switch (this.Faturaİsmi) {
            case "elektrik":
                getHesapBilgileri().setElektrik_faturasi(0);
                break;
            case "su":
                getHesapBilgileri().setSu_faturasi(0);
                break;
            case "dogalgaz":
                getHesapBilgileri().setDogalgaz_faturasi(0);
                break;
            case "internet":
                getHesapBilgileri().setInyernet_faturasi(0);
                break;
           
        }
    }
}
    
    
    private  void bakiyeazalt(){
        
        String query = "UPDATE kullanici_bakiye " +
                       "SET bakiye = bakiye - " + this.FaturaTutari +
                       " WHERE kullanici_id = '" + this.getHesapBilgileri().getKullanici_id() + "'";

          try {
              super.statement = super.connection.createStatement();
               statement.executeUpdate(query);               
               getHesapBilgileri().setBakiye(getHesapBilgileri().getBakiye()-this.FaturaTutari);
          } catch (SQLException ex) {
              Logger.getLogger(FaturaOdemeleri.class.getName()).log(Level.SEVERE, null, ex);
          }
           
    }
    
    public int getKullaniciBorc(int kullaniciID) {
    int borc = 0;
    String query = "SELECT borc FROM kredi_tablo WHERE kullanici_id = ?";
    try {
        PreparedStatement ps = super.connection.prepareStatement(query);
        ps.setInt(1, kullaniciID);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            borc = rs.getInt("borc");
        }
    } catch (SQLException ex) {
        Logger.getLogger(KrediCekme.class.getName()).log(Level.SEVERE, null, ex);
    }
    return borc;
}

    public String getFaturaİsmi() {
        return Faturaİsmi;
    }

    public void setFaturaİsmi(String Faturaİsmi) {
        this.Faturaİsmi = Faturaİsmi;
    }

    public double getFaturaTutari() {
        return FaturaTutari;
    }

    public void setFaturaTutari(double FaturaTutari) {
        this.FaturaTutari = FaturaTutari;
    }
    
    
    
    
    
}
