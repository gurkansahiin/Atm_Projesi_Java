
package database.transactions;

import database.DbConnection;
import database.IBilgiController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Havale  extends  DbConnection implements IBilgiController{

    private int gonderilecekmiktar=0;
    private String HavaleAlacakKisi=null; //musteri no
    
    public boolean havaleYapildiMi()
    {
        if(bilgilerGeçerlimi()) {
            
            String query = "UPDATE kullanici_bakiye " +
                       "SET bakiye = bakiye - " + this.gonderilecekmiktar +
                       " WHERE kullanici_id = '" + this.getHesapBilgileri().getKullanici_id() + "'";

            String query2 = "UPDATE kullanici_bakiye " +
                       "SET bakiye = bakiye + " + this.gonderilecekmiktar +
                       " WHERE musteri_no = '" + this.getHavaleAlacakKisi() + "'";

        try {
            super.statement = super.connection.createStatement();
            if (statement.executeUpdate(query2)==1) {
                statement.executeUpdate(query);
            }

            
            getHesapBilgileri().setBakiye(getHesapBilgileri().getBakiye() - this.gonderilecekmiktar);
                
        } catch (SQLException ex) {
            Logger.getLogger(ParaCekme.class.getName()).log(Level.SEVERE, null, ex);
        } 
            return true;
        }
        else{
            return false;
            
        }
    }
    
    @Override
    public boolean bilgilerGeçerlimi() {
        return !(gonderilecekmiktar==0 || HavaleAlacakKisi==null || gonderilecekmiktar>getHesapBilgileri().getBakiye()
                ||this.HavaleAlacakKisi.equals(getHesapBilgileri().getMusteriNo()));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public int getGonderilecekmiktar() {
        return gonderilecekmiktar;
    }

    public void setGonderilecekmiktar(int gonderilecekmiktar) {
        this.gonderilecekmiktar = gonderilecekmiktar;
    }

    public String getHavaleAlacakKisi() {
        return HavaleAlacakKisi;
    }

    public void setHavaleAlacakKisi(String HavaleAlacakKisi) {
        this.HavaleAlacakKisi = HavaleAlacakKisi;
    }
    
    
    
}
