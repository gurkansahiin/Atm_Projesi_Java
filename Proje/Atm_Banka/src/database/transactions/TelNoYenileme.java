

package database.transactions;

import database.DbConnection;
import database.IBilgiController;
import gui.ayarlar.TextAyarlar;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class TelNoYenileme extends DbConnection implements IBilgiController {

    private  String TelNo=null;
    @Override
    public boolean bilgilerGeçerlimi() {
        return !(this.TelNo==null || TextAyarlar.uzunlukSundanKucukmu(11, TelNo));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public String getTelNo() {
        return TelNo;
    }

    public void setTelNo(String TelNo) {
        this.TelNo = TelNo;
    }
    
    
    public  boolean telnoyenilendiMi(){
         if (this.bilgilerGeçerlimi()) {
        String query = "UPDATE kullanicilar " +
                       "SET tel_no = " + this.TelNo +
                       " WHERE kullanici_id = '" + this.getHesapBilgileri().getKullanici_id() + "'";

        try {
            super.statement = super.connection.createStatement();
            statement.executeUpdate(query);
            getHesapBilgileri().setTelNo(TelNo);
                
        } catch (SQLException ex) {
            Logger.getLogger(ParaCekme.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return true;
    }else{
        return false;
    }
    }
    
}
