/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import database.IBilgiController;
import database.transactions.FaturaOdemeleri;
import database.transactions.HesapBilgileri;
import database.transactions.KrediCekme;
import gui.ayarlar.ActionAyarlar;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDüzenleyici;
/**
 *
 * @author GÜRKAN ŞAHİN
 */
public final class OdemelerEkrani extends javax.swing.JFrame  implements IDüzenleyici,IBilgiController{

    private  FaturaOdemeleri faturaodemeleriobject=getFaturaodemeleriobject();
    private KrediCekme krediobject=getKrediobject();
    
    public OdemelerEkrani() {
        initComponents();
        
        getEdits();
        
    }

    @Override
    public void getEdits() {
         this.setLocationRelativeTo(null);
         this.setFocusable(true);
         this.KullaniciAdiSoyadiLabel.setText(" Sayın  " + getHesapBilgileri().getAdSoyad());
         this.elektrikborcuLabel.setText(String.valueOf(getHesapBilgileri().getElektrik_faturasi()));
         this.SuborcuLabel.setText(String.valueOf(getHesapBilgileri().getSu_faturasi()));
         this.dogalgazborcLabel.setText(String.valueOf(getHesapBilgileri().getDogalgaz_faturasi()));
         this.internetborcuLabel.setText(String.valueOf(getHesapBilgileri().getInyernet_faturasi()));
      
      
  
 // Kullanıcı ID'sini alın
        int borc = getFaturaodemeleriobject().getKullaniciBorc(this.getHesapBilgileri().getKullanici_id()); // Belirli kullanıcı için borç değerini alın
        this.krediborclabel.setText(String.valueOf(borc));
        
        if (this.krediborclabel.getText().equals("0")) {
    this.krediborcbutton.setVisible(false);
    this.krediborclabel.setVisible(false);
    this.krediborcunuzlabel.setVisible(false);
    
    }
    }
    
    

    @Override
    public boolean bilgilerGeçerlimi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return HesapBilgileri.getInstance();
    }
    
     
    

    public FaturaOdemeleri getFaturaodemeleriobject() {
          if (this.faturaodemeleriobject == null) {
            faturaodemeleriobject=new FaturaOdemeleri();
        }
        return faturaodemeleriobject;
    }

    public KrediCekme getKrediobject() {
         if (this.krediobject == null) {
            krediobject=new KrediCekme();
        }
        return krediobject;
    }

    
    
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OdemelerEkraniPanel = new javax.swing.JPanel();
        KullaniciAdiSoyadiLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        elektrikborcuLabel = new javax.swing.JLabel();
        elektriködeButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        SuborcuLabel = new javax.swing.JLabel();
        suödeButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        dogalgazödeButton = new javax.swing.JButton();
        dogalgazborcLabel = new javax.swing.JLabel();
        internetödeButton = new javax.swing.JButton();
        internetborcuLabel = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        krediborcunuzlabel = new javax.swing.JLabel();
        krediborclabel = new javax.swing.JLabel();
        krediborcbutton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ödemeler Ekranı");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        OdemelerEkraniPanel.setBackground(new java.awt.Color(255, 255, 204));
        OdemelerEkraniPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        KullaniciAdiSoyadiLabel.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.default.focusedBackground"));
        KullaniciAdiSoyadiLabel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        KullaniciAdiSoyadiLabel.setForeground(new java.awt.Color(204, 0, 0));
        KullaniciAdiSoyadiLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        KullaniciAdiSoyadiLabel.setText("Sayın [Kullanıcı_Adi_Soyadi]");
        OdemelerEkraniPanel.add(KullaniciAdiSoyadiLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 423, 45));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previous.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        OdemelerEkraniPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 47, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Elektrik borcunuz:");
        OdemelerEkraniPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 303, 30));

        elektrikborcuLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        elektrikborcuLabel.setForeground(new java.awt.Color(255, 0, 0));
        elektrikborcuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        elektrikborcuLabel.setText("[elek borc]");
        OdemelerEkraniPanel.add(elektrikborcuLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 134, 30));

        elektriködeButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        elektriködeButton.setText("ÖDE");
        elektriködeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        elektriködeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                elektriködeButtonActionPerformed(evt);
            }
        });
        OdemelerEkraniPanel.add(elektriködeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, -1, 25));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText(" Su  borcunuz:");
        OdemelerEkraniPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 378, 303, 30));

        SuborcuLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        SuborcuLabel.setForeground(new java.awt.Color(255, 0, 0));
        SuborcuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SuborcuLabel.setText("[su borc]");
        OdemelerEkraniPanel.add(SuborcuLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 134, -1));

        suödeButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        suödeButton.setText("ÖDE");
        suödeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        suödeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suödeButtonActionPerformed(evt);
            }
        });
        OdemelerEkraniPanel.add(suödeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, -1, 25));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText(" Doğalgaz  borcunuz:");
        OdemelerEkraniPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 303, 30));

        dogalgazödeButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dogalgazödeButton.setText("ÖDE");
        dogalgazödeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dogalgazödeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dogalgazödeButtonActionPerformed(evt);
            }
        });
        OdemelerEkraniPanel.add(dogalgazödeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 410, -1, -1));

        dogalgazborcLabel.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        dogalgazborcLabel.setForeground(new java.awt.Color(255, 0, 0));
        dogalgazborcLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dogalgazborcLabel.setText("[dogalgaz borc]");
        OdemelerEkraniPanel.add(dogalgazborcLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 414, 134, -1));

        internetödeButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        internetödeButton.setText("ÖDE");
        internetödeButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        internetödeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                internetödeButtonActionPerformed(evt);
            }
        });
        OdemelerEkraniPanel.add(internetödeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 447, -1, -1));

        internetborcuLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        internetborcuLabel.setForeground(new java.awt.Color(255, 0, 0));
        internetborcuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        internetborcuLabel.setText("[elek borc]");
        OdemelerEkraniPanel.add(internetborcuLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 134, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("İnternet  borcunuz:");
        OdemelerEkraniPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 303, 30));

        krediborcunuzlabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        krediborcunuzlabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        krediborcunuzlabel.setText(" Kredi borcunuz:");
        OdemelerEkraniPanel.add(krediborcunuzlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 485, 303, 30));

        krediborclabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        krediborclabel.setForeground(new java.awt.Color(255, 0, 0));
        krediborclabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        krediborclabel.setText("[kredi borc]");
        OdemelerEkraniPanel.add(krediborclabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 490, 134, -1));

        krediborcbutton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        krediborcbutton.setText("ÖDE");
        krediborcbutton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        krediborcbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                krediborcbuttonActionPerformed(evt);
            }
        });
        OdemelerEkraniPanel.add(krediborcbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 484, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/realistic-a-atm-machine-vector-2.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        OdemelerEkraniPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(OdemelerEkraniPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        ActionAyarlar.setVisible(this, new HesapEkrani());
    }//GEN-LAST:event_jLabel2MouseClicked

    private void elektriködeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_elektriködeButtonActionPerformed

        double ElektrikTutari=Double.valueOf(this.elektrikborcuLabel.getText());
        if (this.FaturaOncedenOdenmisMi(ElektrikTutari)) {
            
            Dialogs.OzelMesajGöster(this, "Zaten fatura ödendi");
        }
        else{
            this.FaturayiOde("elektrik", ElektrikTutari);
         this.elektrikborcuLabel.setText(String.valueOf(getHesapBilgileri().getElektrik_faturasi()));
      
        }
    }//GEN-LAST:event_elektriködeButtonActionPerformed

    private void suödeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suödeButtonActionPerformed

         double SuTutari=Double.valueOf(this.SuborcuLabel.getText());
        if (this.FaturaOncedenOdenmisMi(SuTutari)) {
            
            Dialogs.OzelMesajGöster(this, "Zaten fatura ödendi");
        }
        else{
            this.FaturayiOde("su", SuTutari);
         this.SuborcuLabel.setText(String.valueOf(getHesapBilgileri().getSu_faturasi()));
        
        }
    }//GEN-LAST:event_suödeButtonActionPerformed

    private void dogalgazödeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dogalgazödeButtonActionPerformed

          double dogalgazTutari=Double.valueOf(this.dogalgazborcLabel.getText());
        if (this.FaturaOncedenOdenmisMi(dogalgazTutari)) {
            
            Dialogs.OzelMesajGöster(this, "Zaten fatura ödendi");
        }
        else{
            this.FaturayiOde("dogalgaz", dogalgazTutari);
         this.dogalgazborcLabel.setText(String.valueOf(getHesapBilgileri().getDogalgaz_faturasi()));
      
        }
    }//GEN-LAST:event_dogalgazödeButtonActionPerformed

    private void internetödeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_internetödeButtonActionPerformed

         
          double internetTutari=Double.valueOf(this.internetborcuLabel.getText());
        if (this.FaturaOncedenOdenmisMi(internetTutari)) {
            
            Dialogs.OzelMesajGöster(this, "Zaten fatura ödendi");
        }
        else{
            this.FaturayiOde("internet", internetTutari);
         this.internetborcuLabel.setText(String.valueOf(getHesapBilgileri().getInyernet_faturasi()));
      
        }
    }//GEN-LAST:event_internetödeButtonActionPerformed

    private void krediborcbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_krediborcbuttonActionPerformed
        ActionAyarlar.setVisible(this, new KrediOdemeEkrani());
    }//GEN-LAST:event_krediborcbuttonActionPerformed

  
    private boolean FaturaOncedenOdenmisMi(double  odenecektutar)
    {
        return odenecektutar==0.0;
    }
    
    private void FaturayiOde(String Faturaismi,double FaturaTutari){
        this.faturaodemeleriobject.setFaturaİsmi(Faturaismi);
         this.faturaodemeleriobject.setFaturaTutari(FaturaTutari);
         if (getFaturaodemeleriobject().FaturaOdendiMi()) {
            Dialogs.OzelMesajGöster(this, "Faturanız başarıyla ödenmiştir.");
                    
            
                ActionAyarlar.setVisible(this, new HesapEkrani());
        }
         else{
             Dialogs.OzelMesajGöster(this, "Ödeme işlemi gerçekleştirilemedi.");
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
            java.util.logging.Logger.getLogger(OdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OdemelerEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OdemelerEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel KullaniciAdiSoyadiLabel;
    private javax.swing.JPanel OdemelerEkraniPanel;
    private javax.swing.JLabel SuborcuLabel;
    private javax.swing.JLabel dogalgazborcLabel;
    private javax.swing.JButton dogalgazödeButton;
    private javax.swing.JLabel elektrikborcuLabel;
    private javax.swing.JButton elektriködeButton;
    private javax.swing.JLabel internetborcuLabel;
    private javax.swing.JButton internetödeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton krediborcbutton;
    private javax.swing.JLabel krediborclabel;
    private javax.swing.JLabel krediborcunuzlabel;
    private javax.swing.JButton suödeButton;
    // End of variables declaration//GEN-END:variables
}
