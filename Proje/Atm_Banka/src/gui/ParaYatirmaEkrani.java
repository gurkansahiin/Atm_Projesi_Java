/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import database.IBilgiController;
import database.transactions.HesapBilgileri;
import database.transactions.ParaYatirma;
import gui.ayarlar.ActionAyarlar;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDüzenleyici;
import gui.ayarlar.TextAyarlar;

/**
 *
 * @author GÜRKAN ŞAHİN
 */
public class ParaYatirmaEkrani extends javax.swing.JFrame implements  IDüzenleyici,IBilgiController{

   private ParaYatirma parayatirmaObject =getParayatirmaObject();
    private int yatirilacakmiktar=0;
    public ParaYatirmaEkrani() {
        initComponents();
        getEdits();
    }

    @Override
    public boolean bilgilerGeçerlimi() {
      return !(this.yatirilacakmiktarText.getText().equals(""));
       }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public ParaYatirma getParayatirmaObject() {
        if (parayatirmaObject==null) {
            parayatirmaObject=new ParaYatirma();
        }
        return  parayatirmaObject;
        
    }

    
    
    
    @Override
    public void getEdits() {
        
        this.setLocationRelativeTo(null);
        ParaYatirmaEkraniPanel.setFocusable(true);
        TextAyarlar.setOnlyNumber(yatirilacakmiktarText);
        TextAyarlar.setmaxlimit(yatirilacakmiktarText, 5);
        this.KullaniciAdiSoyadiLabel.setText(" Sayın  " + getHesapBilgileri().getAdSoyad());
        this.BakiyeLabel.setText( String.valueOf(getHesapBilgileri().getBakiye()) );
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ParaYatirmaEkraniPanel = new javax.swing.JPanel();
        KullaniciAdiSoyadiLabel = new javax.swing.JLabel();
        limituyariLabel = new javax.swing.JLabel();
        toplamBakiyenizLabel = new javax.swing.JLabel();
        BakiyeLabel = new javax.swing.JLabel();
        yatiracaginizmiktarLabel = new javax.swing.JLabel();
        yatirilacakmiktarText = new javax.swing.JTextField();
        ParaYatirButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        parayatirlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(780, 800));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ParaYatirmaEkraniPanel.setBackground(new java.awt.Color(255, 255, 204));
        ParaYatirmaEkraniPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        KullaniciAdiSoyadiLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        KullaniciAdiSoyadiLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        KullaniciAdiSoyadiLabel.setText("Sayın [Kullanıcı_Adi_Soyadi]");
        ParaYatirmaEkraniPanel.add(KullaniciAdiSoyadiLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 428, 45));

        limituyariLabel.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        limituyariLabel.setForeground(new java.awt.Color(255, 0, 51));
        limituyariLabel.setText("Tek seferde 50.000 TL ve altını yatırabilirsiniz...");
        ParaYatirmaEkraniPanel.add(limituyariLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 359, 32));

        toplamBakiyenizLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        toplamBakiyenizLabel.setForeground(new java.awt.Color(51, 51, 51));
        toplamBakiyenizLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        toplamBakiyenizLabel.setText("Toplam Bakiyeniz:");
        ParaYatirmaEkraniPanel.add(toplamBakiyenizLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 197, 32));

        BakiyeLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        BakiyeLabel.setForeground(new java.awt.Color(51, 51, 51));
        BakiyeLabel.setText("[Bakiye]");
        ParaYatirmaEkraniPanel.add(BakiyeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 460, 226, 32));

        yatiracaginizmiktarLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        yatiracaginizmiktarLabel.setForeground(new java.awt.Color(51, 51, 51));
        yatiracaginizmiktarLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        yatiracaginizmiktarLabel.setText("Yatıracağınız Mikt..");
        ParaYatirmaEkraniPanel.add(yatiracaginizmiktarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 180, 32));

        yatirilacakmiktarText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                yatirilacakmiktarTextKeyReleased(evt);
            }
        });
        ParaYatirmaEkraniPanel.add(yatirilacakmiktarText, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, 130, 30));

        ParaYatirButton.setBackground(new java.awt.Color(51, 51, 51));
        ParaYatirButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ParaYatirButton.setForeground(new java.awt.Color(255, 255, 255));
        ParaYatirButton.setText("Para Yatır");
        ParaYatirButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ParaYatirButtonMouseClicked(evt);
            }
        });
        ParaYatirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParaYatirButtonActionPerformed(evt);
            }
        });
        ParaYatirmaEkraniPanel.add(ParaYatirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 555, 90, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previous.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        ParaYatirmaEkraniPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 47, 51));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/ATM-Machine.jpg"))); // NOI18N
        ParaYatirmaEkraniPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 800));

        parayatirlabel.setText("jLabel3");
        parayatirlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                parayatirlabelMouseClicked(evt);
            }
        });
        ParaYatirmaEkraniPanel.add(parayatirlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 560, 30, 20));

        getContentPane().add(ParaYatirmaEkraniPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yatirilacakmiktarTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yatirilacakmiktarTextKeyReleased

        yatirilacakmiktar= TextAyarlar.CheckTextKeyReleased(yatirilacakmiktarText, 50000);
    }//GEN-LAST:event_yatirilacakmiktarTextKeyReleased

    private void ParaYatirButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ParaYatirButtonMouseClicked

        //

    }//GEN-LAST:event_ParaYatirButtonMouseClicked

    private void paraYatir(){
        this.getParayatirmaObject().setYatirilacakMiktar(this.yatirilacakmiktar);
        if (getParayatirmaObject().paraYatirildiMi()) {
            Dialogs.OzelMesajGöster(this, "Para yatirma işlemi tamamlandı\n"
                    + "Yatirilan Miktar: "  +  this.yatirilacakmiktar  + " TL");
            
                ActionAyarlar.setVisible(this, new HesapEkrani());
        }
        
        else{
            Dialogs.OzelMesajGöster(this, "İşlem Başarısız Oldu!.");
        }
    }
    
    
    
    private void ParaYatirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParaYatirButtonActionPerformed
        if (this.bilgilerGeçerlimi()) {
            this.paraYatir();
        }
        else{
            Dialogs.bosOlamazMesajıGöster(this);
        }
    }//GEN-LAST:event_ParaYatirButtonActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        ActionAyarlar.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_jLabel2MouseClicked

    private void parayatirlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_parayatirlabelMouseClicked
       if (this.bilgilerGeçerlimi()) {
            this.paraYatir();
        }
        else{
            Dialogs.bosOlamazMesajıGöster(this);
        }
    }//GEN-LAST:event_parayatirlabelMouseClicked

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
            java.util.logging.Logger.getLogger(ParaYatirmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParaYatirmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParaYatirmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParaYatirmaEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParaYatirmaEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BakiyeLabel;
    private javax.swing.JLabel KullaniciAdiSoyadiLabel;
    private javax.swing.JButton ParaYatirButton;
    private javax.swing.JPanel ParaYatirmaEkraniPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel limituyariLabel;
    private javax.swing.JLabel parayatirlabel;
    private javax.swing.JLabel toplamBakiyenizLabel;
    private javax.swing.JLabel yatiracaginizmiktarLabel;
    private javax.swing.JTextField yatirilacakmiktarText;
    // End of variables declaration//GEN-END:variables
}
