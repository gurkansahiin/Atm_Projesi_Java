/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import database.IBilgiController;
import database.transactions.Havale;
import database.transactions.HesapBilgileri;
import database.transactions.ParaCekme;
import gui.ayarlar.ActionAyarlar;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDüzenleyici;
import gui.ayarlar.TextAyarlar;

/**
 *
 * @author GÜRKAN ŞAHİN
 */
public final class HavaleEkrani extends javax.swing.JFrame implements  IDüzenleyici,IBilgiController{

    private Havale HavaleObject = getHavaleObject();
    
  private final String Musteri_No_Text_Orginal="Müşteri No";
  private int gonderilecekmiktar=0;
    public HavaleEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public void getEdits() { 
        this.setLocationRelativeTo(null);
        this.setFocusable(true);
        TextAyarlar.setOnlyNumber(gönderilecekmiktarText);
        TextAyarlar.setmaxlimit(gönderilecekmiktarText, 5);
        this.KullaniciAdiSoyadiLabel.setText(" Sayın  " + getHesapBilgileri().getAdSoyad());
        this.BakiyeLabel.setText(String.valueOf(getHesapBilgileri().getBakiye()));
        musterinotext.setText(Musteri_No_Text_Orginal);
    }

    @Override
    public boolean bilgilerGeçerlimi() {
        return !(this.gönderilecekmiktarText.getText().equals("")|| this.musterinotext.getText().equals(this.Musteri_No_Text_Orginal)); 
          
        
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return  HesapBilgileri.getInstance();
    }

    public Havale getHavaleObject() {
        if (this.HavaleObject == null) {
            HavaleObject=new Havale();
        }
        return HavaleObject;
    }


    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HavaleEkraniPanel = new javax.swing.JPanel();
        KullaniciAdiSoyadiLabel = new javax.swing.JLabel();
        limituyariLabel = new javax.swing.JLabel();
        toplamBakiyenizLabel = new javax.swing.JLabel();
        BakiyeLabel = new javax.swing.JLabel();
        göndereceginizmiktarLabel = new javax.swing.JLabel();
        gönderilecekmiktarText = new javax.swing.JTextField();
        HavaleButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        havalealacakkişilabel = new javax.swing.JLabel();
        musterinotext = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HavaleEkraniPanel.setBackground(new java.awt.Color(204, 255, 255));
        HavaleEkraniPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        KullaniciAdiSoyadiLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        KullaniciAdiSoyadiLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        KullaniciAdiSoyadiLabel.setText("Sayın [Kullanıcı_Adi_Soyadi]");
        HavaleEkraniPanel.add(KullaniciAdiSoyadiLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, 434, 45));

        limituyariLabel.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        limituyariLabel.setForeground(new java.awt.Color(255, 0, 51));
        limituyariLabel.setText("Tek seferde 20.000 TL ve altını gönderebilirsiniz");
        HavaleEkraniPanel.add(limituyariLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 419, 32));

        toplamBakiyenizLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        toplamBakiyenizLabel.setForeground(new java.awt.Color(51, 51, 51));
        toplamBakiyenizLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        toplamBakiyenizLabel.setText("Toplam Bakiyeniz:");
        HavaleEkraniPanel.add(toplamBakiyenizLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 197, 32));

        BakiyeLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        BakiyeLabel.setForeground(new java.awt.Color(51, 51, 51));
        BakiyeLabel.setText("[Bakiye]");
        HavaleEkraniPanel.add(BakiyeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 226, 32));

        göndereceginizmiktarLabel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        göndereceginizmiktarLabel.setForeground(new java.awt.Color(51, 51, 51));
        göndereceginizmiktarLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        göndereceginizmiktarLabel.setText("Gönderilecek Mikt.");
        HavaleEkraniPanel.add(göndereceginizmiktarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 180, 32));

        gönderilecekmiktarText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                gönderilecekmiktarTextKeyReleased(evt);
            }
        });
        HavaleEkraniPanel.add(gönderilecekmiktarText, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, 130, 30));

        HavaleButton.setBackground(new java.awt.Color(51, 51, 51));
        HavaleButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        HavaleButton.setForeground(new java.awt.Color(255, 255, 255));
        HavaleButton.setText("Para Gönder");
        HavaleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HavaleButtonMouseClicked(evt);
            }
        });
        HavaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HavaleButtonActionPerformed(evt);
            }
        });
        HavaleEkraniPanel.add(HavaleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 556, 110, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previous.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        HavaleEkraniPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 47, 51));

        havalealacakkişilabel.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        havalealacakkişilabel.setForeground(new java.awt.Color(51, 51, 51));
        havalealacakkişilabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        havalealacakkişilabel.setText("Havale alacak kişi:");
        HavaleEkraniPanel.add(havalealacakkişilabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 520, 180, 32));

        musterinotext.setForeground(new java.awt.Color(153, 153, 153));
        musterinotext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                musterinotextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                musterinotextFocusLost(evt);
            }
        });
        HavaleEkraniPanel.add(musterinotext, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 520, 130, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/ATM-Machine.jpg"))); // NOI18N
        HavaleEkraniPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 800));

        jLabel3.setText("jLabel3");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        HavaleEkraniPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 560, 30, 20));

        getContentPane().add(HavaleEkraniPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gönderilecekmiktarTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_gönderilecekmiktarTextKeyReleased

        gonderilecekmiktar= TextAyarlar.CheckTextKeyReleased(gönderilecekmiktarText, 20000);
    }//GEN-LAST:event_gönderilecekmiktarTextKeyReleased

    private void HavaleButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HavaleButtonMouseClicked

        //

    }//GEN-LAST:event_HavaleButtonMouseClicked

    private void HavaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HavaleButtonActionPerformed
        
        if (this.bilgilerGeçerlimi()) {
            
            this.havaleMethod();
        }
        else{
            Dialogs.bosOlamazMesajıGöster(this);
        }
    }//GEN-LAST:event_HavaleButtonActionPerformed

    private void havaleMethod(){
    
        getHavaleObject().setGonderilecekmiktar(this.gonderilecekmiktar);
        getHavaleObject().setHavaleAlacakKisi(this.musterinotext.getText());
        
        if (getHavaleObject().havaleYapildiMi()) {
            Dialogs.OzelMesajGöster(this, "Para transfer  işlemi tamamlandı\n"
                    + "Gönderilen müşteri NO:"  +  this.musterinotext.getText()  
                    +  " gönderilen  Miktar: "  +  this.gonderilecekmiktar  + " TL");
            
                ActionAyarlar.setVisible(this, new HesapEkrani());
        }
         else{
            Dialogs.OzelMesajGöster(this, "Havale işlemi başarısız oldu");
        }
    }
    
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        ActionAyarlar.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_jLabel2MouseClicked

    private void musterinotextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_musterinotextFocusGained
      TextAyarlar.ChecktheTextFocusGained(musterinotext, Musteri_No_Text_Orginal);
    }//GEN-LAST:event_musterinotextFocusGained

    private void musterinotextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_musterinotextFocusLost
      TextAyarlar.ChecktheTextFocusLost(musterinotext);
    }//GEN-LAST:event_musterinotextFocusLost

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
         if (this.bilgilerGeçerlimi()) {
            
            this.havaleMethod();
        }
        else{
            Dialogs.bosOlamazMesajıGöster(this);
        }
    }//GEN-LAST:event_jLabel3MouseClicked

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
            java.util.logging.Logger.getLogger(HavaleEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HavaleEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HavaleEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HavaleEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HavaleEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BakiyeLabel;
    private javax.swing.JButton HavaleButton;
    private javax.swing.JPanel HavaleEkraniPanel;
    private javax.swing.JLabel KullaniciAdiSoyadiLabel;
    private javax.swing.JLabel göndereceginizmiktarLabel;
    private javax.swing.JTextField gönderilecekmiktarText;
    private javax.swing.JLabel havalealacakkişilabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel limituyariLabel;
    private javax.swing.JTextField musterinotext;
    private javax.swing.JLabel toplamBakiyenizLabel;
    // End of variables declaration//GEN-END:variables
}
