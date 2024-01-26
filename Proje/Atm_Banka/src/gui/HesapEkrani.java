/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import database.IBilgiController;
import database.transactions.HesapBilgileri;
import gui.ayarlar.ActionAyarlar;
import gui.ayarlar.ButtonAyarlar;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDüzenleyici;
import gui.ayarlar.IconAyarlari;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JButton;


/**
 *
 * @author GÜRKAN ŞAHİN
 */
public final class HesapEkrani extends javax.swing.JFrame implements IDüzenleyici,IBilgiController {

    /**
     * Creates new form HesapEkrani
     */
    public HesapEkrani() {
        initComponents();
        getEdits(); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        HesapEkraniPanel = new javax.swing.JPanel();
        hosgeldinlabel = new javax.swing.JLabel();
        kullaniciadsoyadLabel = new javax.swing.JLabel();
        bakiyelabel = new javax.swing.JLabel();
        Widthdrawmoney1label = new javax.swing.JLabel();
        ParaçekButton = new javax.swing.JButton();
        ParaYatirLabel = new javax.swing.JLabel();
        ParayatirButton = new javax.swing.JButton();
        HavaleLabel = new javax.swing.JLabel();
        HavaleButton = new javax.swing.JButton();
        OdemelerButton = new javax.swing.JButton();
        OdemelerLabel = new javax.swing.JLabel();
        settingsLabel = new javax.swing.JLabel();
        logoutLabel = new javax.swing.JLabel();
        KrediButton = new javax.swing.JButton();
        Widthdrawmoney1label1 = new javax.swing.JLabel();
        tliconlabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        parayatirlabel = new javax.swing.JLabel();
        havalelabel = new javax.swing.JLabel();
        odemelabel = new javax.swing.JLabel();
        paraceklabel = new javax.swing.JLabel();
        kredilabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Atm ");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HesapEkraniPanel.setBackground(new java.awt.Color(0, 153, 204));
        HesapEkraniPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hosgeldinlabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        hosgeldinlabel.setForeground(new java.awt.Color(204, 255, 255));
        hosgeldinlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hosgeldinlabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/turkish-lire (2).png"))); // NOI18N
        HesapEkraniPanel.add(hosgeldinlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 220, 60));

        kullaniciadsoyadLabel.setFont(new java.awt.Font("Tahoma", 3, 20)); // NOI18N
        kullaniciadsoyadLabel.setForeground(new java.awt.Color(204, 255, 255));
        kullaniciadsoyadLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        kullaniciadsoyadLabel.setText("[Kullanici_adi_soyadi]");
        HesapEkraniPanel.add(kullaniciadsoyadLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 425, 36));

        bakiyelabel.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        bakiyelabel.setForeground(new java.awt.Color(204, 255, 255));
        bakiyelabel.setText("2500");
        HesapEkraniPanel.add(bakiyelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 292, 80));
        HesapEkraniPanel.add(Widthdrawmoney1label, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 606, 14, 8));

        ParaçekButton.setBackground(new java.awt.Color(204, 255, 255));
        ParaçekButton.setText("Para Çek");
        ParaçekButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ParaçekButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ParaçekButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ParaçekButtonMouseExited(evt);
            }
        });
        ParaçekButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParaçekButtonActionPerformed(evt);
            }
        });
        HesapEkraniPanel.add(ParaçekButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 96, 30));
        HesapEkraniPanel.add(ParaYatirLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 606, 8, 14));

        ParayatirButton.setBackground(new java.awt.Color(204, 255, 255));
        ParayatirButton.setText("Para Yatır");
        ParayatirButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ParayatirButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ParayatirButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ParayatirButtonMouseExited(evt);
            }
        });
        ParayatirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParayatirButtonActionPerformed(evt);
            }
        });
        HesapEkraniPanel.add(ParayatirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 445, 96, 30));
        HesapEkraniPanel.add(HavaleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 606, 10, 14));

        HavaleButton.setBackground(new java.awt.Color(204, 255, 255));
        HavaleButton.setText("Havale");
        HavaleButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HavaleButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HavaleButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HavaleButtonMouseExited(evt);
            }
        });
        HavaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HavaleButtonActionPerformed(evt);
            }
        });
        HesapEkraniPanel.add(HavaleButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 410, 96, 30));

        OdemelerButton.setBackground(new java.awt.Color(204, 255, 255));
        OdemelerButton.setText("Ödemeler");
        OdemelerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        OdemelerButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OdemelerButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OdemelerButtonMouseExited(evt);
            }
        });
        OdemelerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OdemelerButtonActionPerformed(evt);
            }
        });
        HesapEkraniPanel.add(OdemelerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 375, 96, 31));
        HesapEkraniPanel.add(OdemelerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(575, 237, 8, 14));

        settingsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/setting.png"))); // NOI18N
        settingsLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        settingsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsLabelMouseClicked(evt);
            }
        });
        HesapEkraniPanel.add(settingsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, -1, 57));

        logoutLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previous.png"))); // NOI18N
        logoutLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutLabelMouseClicked(evt);
            }
        });
        HesapEkraniPanel.add(logoutLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, 57));

        KrediButton.setBackground(new java.awt.Color(204, 255, 255));
        KrediButton.setText("Kredi");
        KrediButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        KrediButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                KrediButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                KrediButtonMouseExited(evt);
            }
        });
        KrediButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KrediButtonActionPerformed(evt);
            }
        });
        HesapEkraniPanel.add(KrediButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 96, 30));
        HesapEkraniPanel.add(Widthdrawmoney1label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1003, 600, 11, 14));
        HesapEkraniPanel.add(tliconlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 17, 614));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/realistic-a-atm-machine-vector-2.jpg"))); // NOI18N
        HesapEkraniPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 820));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/setting.png"))); // NOI18N
        HesapEkraniPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 60, 60));

        parayatirlabel.setText("jLabel3");
        parayatirlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                parayatirlabelMouseClicked(evt);
            }
        });
        HesapEkraniPanel.add(parayatirlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 450, 30, -1));

        havalelabel.setText("jLabel4");
        havalelabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                havalelabelMouseClicked(evt);
            }
        });
        HesapEkraniPanel.add(havalelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 426, 30, 10));

        odemelabel.setText("jLabel5");
        odemelabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                odemelabelMouseClicked(evt);
            }
        });
        HesapEkraniPanel.add(odemelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 400, 30, 10));

        paraceklabel.setText("jLabel3");
        paraceklabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paraceklabelMouseClicked(evt);
            }
        });
        HesapEkraniPanel.add(paraceklabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 450, 20, -1));

        kredilabel.setText("jLabel3");
        kredilabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kredilabelMouseClicked(evt);
            }
        });
        HesapEkraniPanel.add(kredilabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(148, 420, 20, -1));

        getContentPane().add(HesapEkraniPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 910));

        pack();
    }// </editor-fold>//GEN-END:initComponents

       @Override
    public void getEdits() {
        this.setLocationRelativeTo(null);
        HesapEkraniPanel.setFocusable(true);
        this.kullaniciadsoyadLabel.setText("Sayın " + getHesapBilgileri().getAdSoyad());
        this.bakiyelabel.setText(String.valueOf(getHesapBilgileri().getBakiye()));
    }
    
    @Override
    public boolean bilgilerGeçerlimi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return  HesapBilgileri.getInstance();
    }
//BUTTON RENKLENDİRMELERİ
    private void ParaçekButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ParaçekButtonMouseEntered
       this.setbgfg(evt.getComponent());
        IconAyarlari.ChangeIcon(Widthdrawmoney1label, "widthdrawmoney2");
    }//GEN-LAST:event_ParaçekButtonMouseEntered

    private void ParaçekButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ParaçekButtonMouseExited
       ButtonAyarlar.setOriginalBg((JButton) evt.getComponent());
       IconAyarlari.SetOrginalİcon(Widthdrawmoney1label);
    }//GEN-LAST:event_ParaçekButtonMouseExited

    private void ParayatirButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ParayatirButtonMouseEntered
       this.setbgfg(evt.getComponent());
       IconAyarlari.ChangeIcon(ParaYatirLabel, "parayatir2");
    }//GEN-LAST:event_ParayatirButtonMouseEntered

    private void ParayatirButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ParayatirButtonMouseExited
       ButtonAyarlar.setOriginalBg((JButton) evt.getComponent());
       IconAyarlari.SetOrginalİcon(ParaYatirLabel);
    }//GEN-LAST:event_ParayatirButtonMouseExited

    private void HavaleButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HavaleButtonMouseEntered
              this.setbgfg(evt.getComponent());
              IconAyarlari.ChangeIcon(HavaleLabel, "money-transfer2");
    }//GEN-LAST:event_HavaleButtonMouseEntered

    private void HavaleButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HavaleButtonMouseExited
       ButtonAyarlar.setOriginalBg((JButton) evt.getComponent());
       IconAyarlari.SetOrginalİcon(HavaleLabel);
    }//GEN-LAST:event_HavaleButtonMouseExited

    private void OdemelerButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OdemelerButtonMouseEntered
              this.setbgfg(evt.getComponent());
              IconAyarlari.ChangeIcon(OdemelerLabel, "odemeler2");
    }//GEN-LAST:event_OdemelerButtonMouseEntered

    private void OdemelerButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OdemelerButtonMouseExited
       ButtonAyarlar.setOriginalBg((JButton) evt.getComponent());
       IconAyarlari.SetOrginalİcon(OdemelerLabel);
    }//GEN-LAST:event_OdemelerButtonMouseExited

    
    //ACTİONLAR..
    private void ParaçekButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParaçekButtonActionPerformed
        ActionAyarlar.setVisible(this, new ParaCekmeEkrani());
    }//GEN-LAST:event_ParaçekButtonActionPerformed

    private void ParayatirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParayatirButtonActionPerformed
         ActionAyarlar.setVisible(this, new ParaYatirmaEkrani());
    }//GEN-LAST:event_ParayatirButtonActionPerformed

    private void HavaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HavaleButtonActionPerformed
         ActionAyarlar.setVisible(this, new HavaleEkrani());
    }//GEN-LAST:event_HavaleButtonActionPerformed

    private void OdemelerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OdemelerButtonActionPerformed
          ActionAyarlar.setVisible(this, new OdemelerEkrani());
    }//GEN-LAST:event_OdemelerButtonActionPerformed

    private void logoutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabelMouseClicked
        String soru="Heabınızdan çıkış yapılacaktır \n "
                + " Onaylıyor musunuz?" ;
        
        if (Dialogs.onaymesajıgoster(this, soru)==1) {
            this.cikisyap();
        }
        
        
    }//GEN-LAST:event_logoutLabelMouseClicked

    private void cikisyap(){
        getHesapBilgileri().cikisyap();
        ActionAyarlar.setVisible(this, new giris_ekrani());
    }
    
    private void settingsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsLabelMouseClicked
           ActionAyarlar.setVisible(this, new SettingsEkran());
    }//GEN-LAST:event_settingsLabelMouseClicked

    private void KrediButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KrediButtonMouseEntered
        this.setbgfg(evt.getComponent());    }//GEN-LAST:event_KrediButtonMouseEntered

    private void KrediButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KrediButtonMouseExited
       ButtonAyarlar.setOriginalBg((JButton) evt.getComponent());
    }//GEN-LAST:event_KrediButtonMouseExited

    private void KrediButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KrediButtonActionPerformed
    ActionAyarlar.setVisible(this, new KrediEkrani());
    }//GEN-LAST:event_KrediButtonActionPerformed

    private void parayatirlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_parayatirlabelMouseClicked
         ActionAyarlar.setVisible(this, new ParaYatirmaEkrani());
    }//GEN-LAST:event_parayatirlabelMouseClicked

    private void havalelabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_havalelabelMouseClicked
        ActionAyarlar.setVisible(this, new HavaleEkrani());
    }//GEN-LAST:event_havalelabelMouseClicked

    private void odemelabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_odemelabelMouseClicked
         ActionAyarlar.setVisible(this, new OdemelerEkrani());
    }//GEN-LAST:event_odemelabelMouseClicked

    private void paraceklabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paraceklabelMouseClicked
         ActionAyarlar.setVisible(this, new ParaCekmeEkrani());
    }//GEN-LAST:event_paraceklabelMouseClicked

    private void kredilabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kredilabelMouseClicked
 ActionAyarlar.setVisible(this, new KrediEkrani());    }//GEN-LAST:event_kredilabelMouseClicked

 

    private void setbgfg(Component c)
    {
        
        ButtonAyarlar.setBg((JButton) c, Color.CYAN);
    }
    
    
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
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HesapEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HesapEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HavaleButton;
    private javax.swing.JLabel HavaleLabel;
    private javax.swing.JPanel HesapEkraniPanel;
    private javax.swing.JButton KrediButton;
    private javax.swing.JButton OdemelerButton;
    private javax.swing.JLabel OdemelerLabel;
    private javax.swing.JLabel ParaYatirLabel;
    private javax.swing.JButton ParayatirButton;
    private javax.swing.JButton ParaçekButton;
    private javax.swing.JLabel Widthdrawmoney1label;
    private javax.swing.JLabel Widthdrawmoney1label1;
    private javax.swing.JLabel bakiyelabel;
    private javax.swing.JLabel havalelabel;
    private javax.swing.JLabel hosgeldinlabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel kredilabel;
    private javax.swing.JLabel kullaniciadsoyadLabel;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JLabel odemelabel;
    private javax.swing.JLabel paraceklabel;
    private javax.swing.JLabel parayatirlabel;
    private javax.swing.JLabel settingsLabel;
    private javax.swing.JLabel tliconlabel;
    // End of variables declaration//GEN-END:variables
}