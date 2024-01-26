/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import database.IBilgiController;
import database.transactions.HesapBilgileri;
import database.transactions.TelNoYenileme;
import gui.ayarlar.ActionAyarlar;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDüzenleyici;
import gui.ayarlar.IconAyarlari;
import gui.ayarlar.TextAyarlar;


/**
 *
 * @author GÜRKAN ŞAHİN
 */
public final class SettingsEkran extends javax.swing.JFrame implements IDüzenleyici ,IBilgiController {

    private TelNoYenileme telnoyenilemeobject=getTelnoyenilemeobject();
    private String eski_telno=null;
    
    public SettingsEkran() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() {
         this.setLocationRelativeTo(null);
         this.setFocusable(true);
         TextAyarlar.setOnlyNumber(telnoText);
         TextAyarlar.setmaxlimit(telnoText, 11);
         
         this.KullaniciAdiSoyadiLabel.setText("Sayın " + getHesapBilgileri().getAdSoyad());
         this.telnoText.setText(getHesapBilgileri().getTelNo());
         this.eski_telno=this.telnoText.getText();
    }

    @Override
    public boolean bilgilerGeçerlimi() {
        return !(this.telnoText.getText().equals(""));
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public TelNoYenileme getTelnoyenilemeobject() {
       
        if (this.telnoyenilemeobject == null) {
            telnoyenilemeobject=new TelNoYenileme();
        }
        return telnoyenilemeobject;
    }
    

    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ayarlarEkranıPanel = new javax.swing.JPanel();
        KullaniciAdiSoyadiLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        mesajtelnolabel = new javax.swing.JLabel();
        telnoText = new javax.swing.JTextField();
        telnodegistiricon = new javax.swing.JLabel();
        mesajsifrelabel = new javax.swing.JLabel();
        sifreText = new javax.swing.JTextField();
        sifredegistiricon1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ayarlar Ekranı");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ayarlarEkranıPanel.setBackground(new java.awt.Color(255, 255, 204));
        ayarlarEkranıPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        KullaniciAdiSoyadiLabel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        KullaniciAdiSoyadiLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        KullaniciAdiSoyadiLabel.setText("Sayın [Kullanıcı_Adi_Soyadi]");
        ayarlarEkranıPanel.add(KullaniciAdiSoyadiLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 435, 45));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previous.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        ayarlarEkranıPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 47, 51));

        mesajtelnolabel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        mesajtelnolabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajtelnolabel.setText("Telefon ");
        ayarlarEkranıPanel.add(mesajtelnolabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 100, 33));

        telnoText.setEnabled(false);
        telnoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telnoTextActionPerformed(evt);
            }
        });
        ayarlarEkranıPanel.add(telnoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 160, 33));

        telnodegistiricon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/updating (1).png"))); // NOI18N
        telnodegistiricon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        telnodegistiricon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                telnodegistiriconMouseClicked(evt);
            }
        });
        ayarlarEkranıPanel.add(telnodegistiricon, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, -1, -1));

        mesajsifrelabel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        mesajsifrelabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mesajsifrelabel.setText("Şifreniz:");
        ayarlarEkranıPanel.add(mesajsifrelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 490, 168, 33));

        sifreText.setText("*****************");
        sifreText.setEnabled(false);
        sifreText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sifreTextActionPerformed(evt);
            }
        });
        ayarlarEkranıPanel.add(sifreText, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, 160, 33));

        sifredegistiricon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/updating (1).png"))); // NOI18N
        sifredegistiricon1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sifredegistiricon1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sifredegistiricon1MouseClicked(evt);
            }
        });
        ayarlarEkranıPanel.add(sifredegistiricon1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/ATM-Machine.jpg"))); // NOI18N
        ayarlarEkranıPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 800));

        getContentPane().add(ayarlarEkranıPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        ActionAyarlar.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_jLabel2MouseClicked

    private void telnoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telnoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telnoTextActionPerformed

    private void sifreTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sifreTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sifreTextActionPerformed

    private int clickCounter=0;
    
    
    
    private void telnodegistiriconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telnodegistiriconMouseClicked
        
        if (clickCounter==0) {
            telnoText.setEnabled(true);
            IconAyarlari.ChangeIcon(telnodegistiricon, "updatetelicon");
            clickCounter++;
        }
        else{
            telnoText.setEnabled(false);
            this.telNoyenile();
            IconAyarlari.SetOrginalİcon(telnodegistiricon);
            clickCounter=0;
        }
       
         
    }//GEN-LAST:event_telnodegistiriconMouseClicked

    private void telNoyenile(){
        if (bilgilerGeçerlimi()) {
            String YeniTelNo=this.telnoText.getText().trim();
            getTelnoyenilemeobject().setTelNo(YeniTelNo);
            if (getTelnoyenilemeobject().telnoyenilendiMi()) {
                Dialogs.OzelMesajGöster(this, "Telefon Numarası: " + YeniTelNo + " olarak güncellenmiştir");
            }
            else{
                Dialogs.OzelMesajGöster(this, "Telefon no güncellenemedi\n"
                        + "Bilgileri kontrol edin!");
                        
                this.telnoText.setText(eski_telno);
            }
        }
        else{
            Dialogs.bosOlamazMesajıGöster(this);
            this.telnoText.setText(eski_telno);
        }
    }
    private void sifredegistiricon1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sifredegistiricon1MouseClicked
    
        ActionAyarlar.setVisible(this, new SifreYenilemeEkrani());
    }//GEN-LAST:event_sifredegistiricon1MouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(SettingsEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SettingsEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SettingsEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettingsEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingsEkran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel KullaniciAdiSoyadiLabel;
    private javax.swing.JPanel ayarlarEkranıPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel mesajsifrelabel;
    private javax.swing.JLabel mesajtelnolabel;
    private javax.swing.JTextField sifreText;
    private javax.swing.JLabel sifredegistiricon1;
    private javax.swing.JTextField telnoText;
    private javax.swing.JLabel telnodegistiricon;
    // End of variables declaration//GEN-END:variables
}
