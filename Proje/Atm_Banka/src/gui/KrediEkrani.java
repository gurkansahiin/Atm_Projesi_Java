/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import database.IBilgiController;
import database.transactions.HesapBilgileri;
import database.transactions.KrediCekme;
import gui.ayarlar.ActionAyarlar;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDüzenleyici;
import gui.ayarlar.TextAyarlar;
import java.time.LocalDate;

/**
 *
 * @author GÜRKAN ŞAHİN
 */
public class KrediEkrani extends javax.swing.JFrame implements IDüzenleyici ,IBilgiController {

     private KrediCekme paracekmeObject =null;
     
     private  int cekilecekmiktar=0;
     private  String Kredii_turu=null;
     
     
    public KrediEkrani() {
        initComponents();
        getEdits(); 

    }

    @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        this.setFocusable(true);
        TextAyarlar.setOnlyNumber(cekilecekmiktarText);
        TextAyarlar.setmaxlimit(cekilecekmiktarText, 5);
        this.KullaniciAdiSoyadiLabel.setText("Sayın " + this.getHesapBilgileri().getAdSoyad());
       
    }

    @Override
    public boolean bilgilerGeçerlimi() {
               return !(this.cekilecekmiktarText.getText().equals(""));

    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return  HesapBilgileri.getInstance();
    }

   public KrediCekme getParacekmeObject() {
    // Örnek bir ParacekmeObject nesnesi döndürülüyor
    if (paracekmeObject == null) {
        paracekmeObject = new KrediCekme(); // veya mevcut bir nesneyi döndürebilir
    }
    return paracekmeObject;
}

    
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        KrediEkraniPanel = new javax.swing.JPanel();
        gerilabel = new javax.swing.JLabel();
        KullaniciAdiSoyadiLabel = new javax.swing.JLabel();
        limituyariLabel = new javax.swing.JLabel();
        toplamBakiyenizLabel = new javax.swing.JLabel();
        BakiyeLabel = new javax.swing.JLabel();
        cekeceginizmiktarLabel = new javax.swing.JLabel();
        cekilecekmiktarText = new javax.swing.JTextField();
        ParaCekButton1 = new javax.swing.JButton();
        KrediTuruLabel = new javax.swing.JLabel();
        KrediTuruCb = new javax.swing.JComboBox<>();
        limituyariLabel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        KrediEkraniPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        gerilabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previous.png"))); // NOI18N
        gerilabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gerilabelMouseClicked(evt);
            }
        });
        KrediEkraniPanel.add(gerilabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 47, 51));

        KullaniciAdiSoyadiLabel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        KullaniciAdiSoyadiLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        KullaniciAdiSoyadiLabel.setText("Sayın [Kullanıcı_Adi_Soyadi]");
        KrediEkraniPanel.add(KullaniciAdiSoyadiLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 330, 40));

        limituyariLabel.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        limituyariLabel.setForeground(new java.awt.Color(255, 0, 51));
        limituyariLabel.setText("Minimum 10000 tl kredi çekebilirsiniz..");
        KrediEkraniPanel.add(limituyariLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 326, 32));

        toplamBakiyenizLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        toplamBakiyenizLabel.setForeground(new java.awt.Color(51, 51, 51));
        toplamBakiyenizLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        KrediEkraniPanel.add(toplamBakiyenizLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 197, 32));

        BakiyeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BakiyeLabel.setForeground(new java.awt.Color(51, 51, 51));
        KrediEkraniPanel.add(BakiyeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(206, 144, 226, 32));

        cekeceginizmiktarLabel.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        cekeceginizmiktarLabel.setForeground(new java.awt.Color(51, 51, 51));
        cekeceginizmiktarLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        cekeceginizmiktarLabel.setText("Çekeceğiniz Miktar");
        KrediEkraniPanel.add(cekeceginizmiktarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 490, -1, 32));

        cekilecekmiktarText.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        cekilecekmiktarText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cekilecekmiktarTextMouseExited(evt);
            }
        });
        cekilecekmiktarText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cekilecekmiktarTextKeyReleased(evt);
            }
        });
        KrediEkraniPanel.add(cekilecekmiktarText, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, 130, 30));

        ParaCekButton1.setBackground(new java.awt.Color(51, 51, 51));
        ParaCekButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ParaCekButton1.setForeground(new java.awt.Color(255, 255, 255));
        ParaCekButton1.setText("Para Çek");
        ParaCekButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ParaCekButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ParaCekButton1MouseEntered(evt);
            }
        });
        ParaCekButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParaCekButton1ActionPerformed(evt);
            }
        });
        KrediEkraniPanel.add(ParaCekButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 560, 90, 30));

        KrediTuruLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        KrediTuruLabel.setForeground(new java.awt.Color(51, 51, 51));
        KrediTuruLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        KrediTuruLabel.setText("Kredi Türü:");
        KrediEkraniPanel.add(KrediTuruLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 197, 32));

        KrediTuruCb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        KrediTuruCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "İhtiyaç kredisi.", "Konut kredisi.", "Taşıt kredisi.", "Bayram kredisi.", "Evlilik kredisi.", "İpotekli ihtiyaç kredisi.", "Esnaf kredisi.", "Öğrenci kredisi." }));
        KrediEkraniPanel.add(KrediTuruCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 460, 150, -1));

        limituyariLabel1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        limituyariLabel1.setForeground(new java.awt.Color(255, 0, 51));
        limituyariLabel1.setText("Faiz oranı %22 olarak belirlenmiştir!");
        KrediEkraniPanel.add(limituyariLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, 326, 32));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/ATM-Machine.jpg"))); // NOI18N
        KrediEkraniPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 810));

        jLabel2.setText("jLabel2");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        KrediEkraniPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 560, 30, 30));

        getContentPane().add(KrediEkraniPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 789, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gerilabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gerilabelMouseClicked

        ActionAyarlar.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_gerilabelMouseClicked

    private void cekilecekmiktarTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cekilecekmiktarTextKeyReleased

        
        
        
    }//GEN-LAST:event_cekilecekmiktarTextKeyReleased

    private void ParaCekButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ParaCekButton1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ParaCekButton1MouseClicked

    private void ParaCekButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParaCekButton1ActionPerformed
         if (this.bilgilerGeçerlimi()) {
            
            //ActionAyarlar.setVisible(this, new giris_ekrani());
            basvuruyugerceklestir();

        }
        else{
            
            Dialogs.bosOlamazMesajıGöster(this);
        }
    }//GEN-LAST:event_ParaCekButton1ActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        if (this.bilgilerGeçerlimi()) {
            
            //ActionAyarlar.setVisible(this, new giris_ekrani());
            basvuruyugerceklestir();

        }
        else{
            
            Dialogs.bosOlamazMesajıGöster(this);
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void ParaCekButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ParaCekButton1MouseEntered
        this.cekilecekmiktar= TextAyarlar.CheckTextKeyReleased(cekilecekmiktarText,10000,70000);
    }//GEN-LAST:event_ParaCekButton1MouseEntered

    private void cekilecekmiktarTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cekilecekmiktarTextMouseExited
         this.cekilecekmiktar= TextAyarlar.CheckTextKeyReleased(cekilecekmiktarText,10000,70000);
    }//GEN-LAST:event_cekilecekmiktarTextMouseExited

  
      private  void basvuruyugerceklestir(){
        //kullanıcı basşvuru sınıfından objemizi method yardmımı ile ürettik
        
       Kredii_turu=String.valueOf(KrediTuruCb.getSelectedItem());
        //Kişisel Bilgileri gönderiyoruz

        this.getParacekmeObject().setCekilecekmiktar(this.cekilecekmiktar);
        this.getParacekmeObject().setTur(String.valueOf(this.Kredii_turu));
        
        //Güvenlik Bilgileri
         this.getParacekmeObject().setBorc_durumu(true);
        

         
           if (this.getParacekmeObject().basvuruonaylandimi()) {
            Dialogs.OzelMesajGöster(this, "Başvurunuz kabul edilmiştir. \n"
                    + "Kredi Türünüz:"+this.Kredii_turu
                    +"\nKredi Çekilen Miktar:"+this.cekilecekmiktar);
            ActionAyarlar.setVisible(this, new HesapEkrani());
        }
           else{
               
               Dialogs.OzelMesajGöster(this,"Başvurunuz kabul edilmemiştir. \n"
                       + "Daha önceki kredi ödemeniz devam ediyor..");
           }
        
        
        
        
    }
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(KrediEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KrediEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KrediEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KrediEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KrediEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BakiyeLabel;
    private javax.swing.JPanel KrediEkraniPanel;
    private javax.swing.JComboBox<String> KrediTuruCb;
    private javax.swing.JLabel KrediTuruLabel;
    private javax.swing.JLabel KullaniciAdiSoyadiLabel;
    private javax.swing.JButton ParaCekButton1;
    private javax.swing.JLabel cekeceginizmiktarLabel;
    private javax.swing.JTextField cekilecekmiktarText;
    private javax.swing.JLabel gerilabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel limituyariLabel;
    private javax.swing.JLabel limituyariLabel1;
    private javax.swing.JLabel toplamBakiyenizLabel;
    // End of variables declaration//GEN-END:variables
}
