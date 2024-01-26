
package database.transactions;

import database.DbConnection;
import database.IBilgiController;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class KrediOdeme  extends DbConnection implements IBilgiController {

        private  int yatirilacakMiktar=0;
        
        public boolean paraYatirildiMi() {
  
        String query = "UPDATE kredi_tablo " +
                "SET borc = CASE WHEN (borc - " + this.yatirilacakMiktar + ") < 0 THEN 0 ELSE (borc - " + this.yatirilacakMiktar + ") END " +
                "WHERE kullanici_id = '" + this.getHesapBilgileri().getKullanici_id() + "'";

        String query2 = "UPDATE kullanici_bakiye " +
                "SET bakiye = bakiye - " + this.yatirilacakMiktar +
                " WHERE kullanici_id = '" + this.getHesapBilgileri().getKullanici_id() + "'";

        try {
            super.statement = super.connection.createStatement();
            statement.executeUpdate(query);
            statement.executeUpdate(query2);

            double updatedBorc = getHesapBilgileri().getBorc() - this.yatirilacakMiktar;
            getHesapBilgileri().setBorc(updatedBorc < 0 ? 0 : updatedBorc);
            getHesapBilgileri().setBakiye(getHesapBilgileri().getBakiye() - this.yatirilacakMiktar);
        } catch (SQLException ex) {
            Logger.getLogger(ParaCekme.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
   
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
    
     public int getKullaniciBakiye(int kullaniciID) {
    int bakiye = 0;
    String query = "SELECT bakiye FROM kullanici_bakiye WHERE kullanici_id = ?";
    try {
        PreparedStatement ps = super.connection.prepareStatement(query);
        ps.setInt(1, kullaniciID);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            bakiye = rs.getInt("bakiye");
        }
    } catch (SQLException ex) {
        Logger.getLogger(KrediCekme.class.getName()).log(Level.SEVERE, null, ex);
    }
    return bakiye;
}       
       
    @Override
    public boolean bilgilerGeçerlimi() {
          return !(  yatirilacakMiktar>this.getHesapBilgileri().getBorc()
                  ||this.getHesapBilgileri().getBakiye()<yatirilacakMiktar );
    }


    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public int getYatirilacakMiktar() {
        return yatirilacakMiktar;
    }

    public void setYatirilacakMiktar(int yatirilacakMiktar) {
        this.yatirilacakMiktar = yatirilacakMiktar;
    }
 
    
    
    
    
}
