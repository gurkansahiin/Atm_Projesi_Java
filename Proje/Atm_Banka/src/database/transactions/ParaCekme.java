
package database.transactions;

import database.DbConnection;
import database.IBilgiController;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ParaCekme extends DbConnection implements IBilgiController {

    
   private int cekilecekmiktar = 0;

public boolean ParaCekildiMi() {
    if (this.bilgilerGeçerlimi()) {
        String query = "UPDATE kullanici_bakiye " +
                       "SET bakiye = bakiye - " + this.cekilecekmiktar +
                       " WHERE kullanici_id = '" + this.getHesapBilgileri().getKullanici_id() + "'";

        try {
            super.statement = super.connection.createStatement();
            statement.executeUpdate(query);

            
            getHesapBilgileri().setBakiye(getHesapBilgileri().getBakiye() - this.cekilecekmiktar);
                
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

        return  !(this.cekilecekmiktar ==0
                || getHesapBilgileri().getBakiye() < this.cekilecekmiktar );
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
    
    
    
    
    
}
