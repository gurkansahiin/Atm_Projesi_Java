
package database;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;




public class DbConnection {//super class
    private final  String HOST="localhost";
    private final String PORT="3306";
    private final String  VERİTABANİ_İSMİ="atm_bank";
    private  final  String USER="root";
    private  final  String PASSWORD="";
    
    protected Connection connection=null;
    protected Statement statement=null;

    public DbConnection() {
        //Veritabanına bağlantı
        //jdbc:mysql://localhost:3306/atm_bank
        
        String url="jdbc:mysql://"+this.HOST+":"+this.PORT+"/"+this.VERİTABANİ_İSMİ;
                try {
                    Class.forName("com.mysql.jdbc.Driver");  
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        try {
                    this.connection=DriverManager.getConnection(url ,this.USER,this.PASSWORD);
                    System.out.println("Baglanti:Basarili");
        } catch (SQLException ex) {
                    System.out.println("Baglanti:Basarisiz");
                    
                    Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE,null,ex);
        }
        
    }
    
    
}
