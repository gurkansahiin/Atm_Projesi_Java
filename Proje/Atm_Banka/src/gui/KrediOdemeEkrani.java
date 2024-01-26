/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import database.IBilgiController;
import database.transactions.HesapBilgileri;
import database.transactions.KrediOdeme;
import gui.ayarlar.ActionAyarlar;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDüzenleyici;
import gui.ayarlar.TextAyarlar;


/**
 *
 * @author GÜRKAN ŞAHİN
 */
public class KrediOdemeEkrani extends javax.swing.JFrame implements IBilgiController,IDüzenleyici {

     private KrediOdeme parayatirmaObject =getParayatirmaObject();
    private int yatirilacakmiktar=0; KrediOdemeEkrani() {
        initComponents();
     
        getEdits();
    }

    @Override
    public boolean bilgilerGeçerlimi() {
        return !( yatirilacakmiktar>parayatirmaObject.getKullaniciBorc(getHesapBilgileri().getKullanici_id())
                  ||parayatirmaObject.getKullaniciBakiye(getHesapBilgileri().getKullanici_id())<yatirilacakmiktar
                  || this.yatirilacakmiktarText.getText().equals("") );
 
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }

    public KrediOdeme getParayatirmaObject() {
          if (parayatirmaObject==null) {
            parayatirmaObject=new KrediOdeme();
        }
        return  parayatirmaObject;
        
    }

  

    @Override
    public void getEdits() {
         this.setLocationRelativeTo(null);
        KrediOdemepanel.setFocusable(true);
        TextAyarlar.setOnlyNumber(yatirilacakmiktarText);
        TextAyarlar.setmaxlimit(yatirilacakmiktarText, 6);
        this.KullaniciAdiSoyadiLabel.setText(" Sayın  " + getHesapBilgileri().getAdSoyad());
        int borc = getParayatirmaObject().getKullaniciBorc(this.getHesapBilgileri().getKullanici_id());
        int bakiye = getParayatirmaObject().getKullaniciBakiye(this.getHesapBilgileri().getKullanici_id());

        this.borcLabel.setText(String.valueOf(borc));
        this.borcdurumLabel1.setText("Aktif");
   
    
    }

   
 
    
    private void paraYatir(){
        this.getParayatirmaObject().setYatirilacakMiktar(this.yatirilacakmiktar);
        if (getParayatirmaObject().paraYatirildiMi()) {
            Dialogs.OzelMesajGöster(this, "Ödeme işlemi tamamlandı\n"
                    + "Ödenen Miktar: "  +  this.yatirilacakmiktar  + " TL");
            
                ActionAyarlar.setVisible(this, new HesapEkrani());
        }
        
        else{
            Dialogs.OzelMesajGöster(this, "İşlem Başarısız Oldu!.");
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        KrediOdemepanel = new javax.swing.JPanel();
        KullaniciAdiSoyadiLabel = new javax.swing.JLabel();
        limituyariLabel1 = new javax.swing.JLabel();
        toplamBorcunuzLabel = new javax.swing.JLabel();
        borcLabel = new javax.swing.JLabel();
        yatiracaginizmiktarLabel = new javax.swing.JLabel();
        yatirilacakmiktarText = new javax.swing.JTextField();
        ParaYatirButton = new javax.swing.JButton();
        yenilabel = new javax.swing.JLabel();
        limituyariLabel2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        toplamBorcunuzLabel1 = new javax.swing.JLabel();
        borcdurumLabel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        KrediOdemepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        KullaniciAdiSoyadiLabel.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        KullaniciAdiSoyadiLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        KullaniciAdiSoyadiLabel.setText("Sayın [Kullanıcı_Adi_Soyadi]");
        KrediOdemepanel.add(KullaniciAdiSoyadiLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, 330, 40));

        limituyariLabel1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        limituyariLabel1.setForeground(new java.awt.Color(255, 0, 51));
        limituyariLabel1.setText("Faiz oranı %22 olarak belirlenmiştir!");
        KrediOdemepanel.add(limituyariLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 326, 32));

        toplamBorcunuzLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        toplamBorcunuzLabel.setForeground(new java.awt.Color(51, 51, 51));
        toplamBorcunuzLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        toplamBorcunuzLabel.setText("Toplam Borcunuz:");
        KrediOdemepanel.add(toplamBorcunuzLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, 197, 32));

        borcLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        borcLabel.setForeground(new java.awt.Color(51, 51, 51));
        borcLabel.setText("[Borc]");
        KrediOdemepanel.add(borcLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 226, 32));

        yatiracaginizmiktarLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        yatiracaginizmiktarLabel.setForeground(new java.awt.Color(51, 51, 51));
        yatiracaginizmiktarLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        yatiracaginizmiktarLabel.setText("Yatıracağınız Mikt");
        KrediOdemepanel.add(yatiracaginizmiktarLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 500, 180, 32));

        yatirilacakmiktarText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                yatirilacakmiktarTextMouseExited(evt);
            }
        });
        yatirilacakmiktarText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                yatirilacakmiktarTextKeyReleased(evt);
            }
        });
        KrediOdemepanel.add(yatirilacakmiktarText, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 500, 130, 30));

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
        KrediOdemepanel.add(ParaYatirButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 540, 90, 30));

        yenilabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                yenilabelMouseClicked(evt);
            }
        });
        KrediOdemepanel.add(yenilabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 550, 30, 20));

        limituyariLabel2.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        limituyariLabel2.setForeground(new java.awt.Color(255, 0, 51));
        limituyariLabel2.setText("Minmum 2000 TL yatırabilirsiniz.");
        KrediOdemepanel.add(limituyariLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 420, 326, 32));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previous.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        KrediOdemepanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 47, 51));

        toplamBorcunuzLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        toplamBorcunuzLabel1.setForeground(new java.awt.Color(51, 51, 51));
        toplamBorcunuzLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        toplamBorcunuzLabel1.setText("Borc Durumu:");
        KrediOdemepanel.add(toplamBorcunuzLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 197, 32));

        borcdurumLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        borcdurumLabel1.setForeground(new java.awt.Color(51, 51, 51));
        borcdurumLabel1.setText("[Borc]");
        KrediOdemepanel.add(borcdurumLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 226, 32));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/ATM-Machine.jpg"))); // NOI18N
        KrediOdemepanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 780));

        jLabel3.setText("jLabel3");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        KrediOdemepanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 550, 30, 20));

        getContentPane().add(KrediOdemepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yatirilacakmiktarTextKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yatirilacakmiktarTextKeyReleased

        yatirilacakmiktar= TextAyarlar.CheckTextKeyReleased(yatirilacakmiktarText, 100000);
    }//GEN-LAST:event_yatirilacakmiktarTextKeyReleased

    private void ParaYatirButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ParaYatirButtonMouseClicked

        //
    }//GEN-LAST:event_ParaYatirButtonMouseClicked

    private void ParaYatirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ParaYatirButtonActionPerformed
        if (this.bilgilerGeçerlimi()) {
            this.paraYatir();
        }
        else{
            Dialogs.OzelMesajGöster(this,"Eksisk veya yanlış meblağ");
        }
    }//GEN-LAST:event_ParaYatirButtonActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        ActionAyarlar.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_jLabel2MouseClicked

    private void yenilabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yenilabelMouseClicked
         if (this.bilgilerGeçerlimi()) {
            this.paraYatir();
        }
        else{
            Dialogs.bosOlamazMesajıGöster(this);
        }
    }//GEN-LAST:event_yenilabelMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
          if (this.bilgilerGeçerlimi()) {
            this.paraYatir();
        }
        else{
            Dialogs.bosOlamazMesajıGöster(this);
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void yatirilacakmiktarTextMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yatirilacakmiktarTextMouseExited
        yatirilacakmiktar= TextAyarlar.CheckTextKeyReleased(yatirilacakmiktarText, 2500,100000);
    }//GEN-LAST:event_yatirilacakmiktarTextMouseExited

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
            java.util.logging.Logger.getLogger(KrediOdemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KrediOdemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KrediOdemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KrediOdemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KrediOdemeEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel KrediOdemepanel;
    private javax.swing.JLabel KullaniciAdiSoyadiLabel;
    private javax.swing.JButton ParaYatirButton;
    private javax.swing.JLabel borcLabel;
    private javax.swing.JLabel borcdurumLabel1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel limituyariLabel1;
    private javax.swing.JLabel limituyariLabel2;
    private javax.swing.JLabel toplamBorcunuzLabel;
    private javax.swing.JLabel toplamBorcunuzLabel1;
    private javax.swing.JLabel yatiracaginizmiktarLabel;
    private javax.swing.JTextField yatirilacakmiktarText;
    private javax.swing.JLabel yenilabel;
    // End of variables declaration//GEN-END:variables
}
