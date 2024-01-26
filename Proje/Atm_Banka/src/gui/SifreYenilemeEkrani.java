/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gui;

import database.IBilgiController;
import database.transactions.HesapBilgileri;
import database.transactions.SifreYenileme;
import gui.ayarlar.ActionAyarlar;
import gui.ayarlar.Dialogs;
import gui.ayarlar.IDüzenleyici;
import gui.ayarlar.TextAyarlar;
import javax.swing.JPasswordField;

/**
 *
 * @author GÜRKAN ŞAHİN
 */
public final class SifreYenilemeEkrani extends javax.swing.JFrame implements IDüzenleyici,IBilgiController{

    private SifreYenileme sifreyenilemeobject=getSifreyenilemeobject();
    
    
    public SifreYenilemeEkrani() {
        initComponents();
        getEdits();
    }

    public JPasswordField getEskisifreText() {
        return eskisifreText;
    }
    
    private  boolean isEnabledEskiSifreText(){
        return this.getEskisifreText().isEnabled();
        
    }
    

    @Override
    public void getEdits() {

        this.setLocationRelativeTo(null);
         this.setFocusable(true);
         TextAyarlar.setOnlyNumber(TelnoText);
         TextAyarlar.setmaxlimit(TelnoText, 11);
         TextAyarlar.setOnlyNumber(TcText);
         TextAyarlar.setmaxlimit(TcText, 11);
         if (getHesapBilgileri().getKullanici_id()==0) {
            this.eskisifreText.setEnabled(false);
        }
      
    }

    @Override
    public boolean bilgilerGeçerlimi() {
        return TextAyarlar.textAlanlariDolumu(SifreYenilemeEkraniPanel);
    }

    @Override
    public HesapBilgileri getHesapBilgileri() {
        return  HesapBilgileri.getInstance();
    }

    public SifreYenileme getSifreyenilemeobject() {
       if (this.sifreyenilemeobject == null) {
            sifreyenilemeobject=new SifreYenileme();
        }
        return sifreyenilemeobject;
    }

    
   
    
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SifreYenilemeEkraniPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        sifreyenilemelabel = new javax.swing.JLabel();
        tclabel = new javax.swing.JLabel();
        TcText = new javax.swing.JTextField();
        tellabel = new javax.swing.JLabel();
        TelnoText = new javax.swing.JTextField();
        guvenlikText = new javax.swing.JTextField();
        guvenliklabel = new javax.swing.JLabel();
        eskisifrelabel = new javax.swing.JLabel();
        yenisifrelabel = new javax.swing.JLabel();
        yenisifretekrarlabel = new javax.swing.JLabel();
        yenisifretekrarText = new javax.swing.JPasswordField();
        eskisifreText = new javax.swing.JPasswordField();
        yenisifreText = new javax.swing.JPasswordField();
        SifreYenileButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SifreYenilemeEkraniPanel.setBackground(new java.awt.Color(153, 255, 204));
        SifreYenilemeEkraniPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/previous.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        SifreYenilemeEkraniPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 30, 40));

        sifreyenilemelabel.setFont(new java.awt.Font("Tahoma", 3, 34)); // NOI18N
        sifreyenilemelabel.setForeground(new java.awt.Color(153, 0, 51));
        sifreyenilemelabel.setText("Şifre Yenileme");
        SifreYenilemeEkraniPanel.add(sifreyenilemelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 270, 50));

        tclabel.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        tclabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tclabel.setText("T.C. No");
        SifreYenilemeEkraniPanel.add(tclabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 120, 33));
        SifreYenilemeEkraniPanel.add(TcText, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 375, 160, 25));

        tellabel.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        tellabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        tellabel.setText("Telefon No:");
        SifreYenilemeEkraniPanel.add(tellabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, 120, 33));
        SifreYenilemeEkraniPanel.add(TelnoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 403, 160, 25));

        guvenlikText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guvenlikTextActionPerformed(evt);
            }
        });
        SifreYenilemeEkraniPanel.add(guvenlikText, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 433, 160, 25));

        guvenliklabel.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        guvenliklabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        guvenliklabel.setText("G.Cevap:");
        SifreYenilemeEkraniPanel.add(guvenliklabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, -1, 33));

        eskisifrelabel.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        eskisifrelabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        eskisifrelabel.setText("Eski Şifre:");
        SifreYenilemeEkraniPanel.add(eskisifrelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 120, 33));

        yenisifrelabel.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        yenisifrelabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        yenisifrelabel.setText("Yeni Şifre:");
        SifreYenilemeEkraniPanel.add(yenisifrelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 490, 120, 33));

        yenisifretekrarlabel.setFont(new java.awt.Font("Tahoma", 3, 13)); // NOI18N
        yenisifretekrarlabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        yenisifretekrarlabel.setText("Y.Şifre Tkrr:");
        SifreYenilemeEkraniPanel.add(yenisifretekrarlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, -1, 33));
        SifreYenilemeEkraniPanel.add(yenisifretekrarText, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 520, 160, 25));
        SifreYenilemeEkraniPanel.add(eskisifreText, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 463, 160, 25));
        SifreYenilemeEkraniPanel.add(yenisifreText, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 492, 160, 25));

        SifreYenileButton.setBackground(new java.awt.Color(204, 204, 204));
        SifreYenileButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        SifreYenileButton.setForeground(new java.awt.Color(51, 51, 51));
        SifreYenileButton.setText("Şifre Yenile");
        SifreYenileButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SifreYenileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SifreYenileButtonActionPerformed(evt);
            }
        });
        SifreYenilemeEkraniPanel.add(SifreYenileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 550, -1, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/iconlar/ATM-Machine.jpg"))); // NOI18N
        SifreYenilemeEkraniPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 770));

        jLabel3.setText("jLabel3");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        SifreYenilemeEkraniPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 546, 30, 20));

        getContentPane().add(SifreYenilemeEkraniPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        if (isEnabledEskiSifreText()==true) {
             ActionAyarlar.setVisible(this, new SettingsEkran());
        }
        else ActionAyarlar.setVisible(this, new giris_ekrani());
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void SifreYenileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SifreYenileButtonActionPerformed
        
        if (bilgilerGeçerlimi()) {
           this.SifreyiYenile(); 
        }
        else{
            Dialogs.bosOlamazMesajıGöster(this);
        }
    }//GEN-LAST:event_SifreYenileButtonActionPerformed

    private void guvenlikTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guvenlikTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_guvenlikTextActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if (bilgilerGeçerlimi()) {
           this.SifreyiYenile(); 
        }
        else{
            Dialogs.bosOlamazMesajıGöster(this);
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void SifreyiYenile(){
        String yenisifre=String.valueOf(this.yenisifreText.getPassword());
         String yenisifretekrar=String.valueOf(this.yenisifretekrarText.getPassword());
         
         if (yenisifre.equals(yenisifretekrar)) {
            this.SifreyiOnayla();
        }
         else{
             Dialogs.OzelMesajGöster(this, "Şifreler aynı olmalıdır");
         }
    }
    
      private void SifreyiOnayla(){
       
          this.getSifreyenilemeobject().setTcNo(this.TcText.getText());
          this.getSifreyenilemeobject().setTelNo(this.TelnoText.getText());
          this.getSifreyenilemeobject().setGuvenlik_cevap(this.guvenlikText.getText());
          if (this.isEnabledEskiSifreText()) {
              this.getSifreyenilemeobject().setEskiSifre(String.valueOf(this.eskisifreText.getPassword()));
          }
          this.getSifreyenilemeobject().setYeniSifre(String.valueOf(this.yenisifreText.getPassword()));
          
          if (this.getSifreyenilemeobject().sifreYenilendiMi()) {
              Dialogs.OzelMesajGöster(this, "Şifreniz başarıyla yenilenmiştir.");
              if (this.isEnabledEskiSifreText()) {
                  ActionAyarlar.setVisible(this, new HesapEkrani());
              }
              else{
                   ActionAyarlar.setVisible(this, new giris_ekrani());
              }
          }
          else{
              
              Dialogs.OzelMesajGöster(this, "Şifreniz yenilenemedi\n"
                      + "Lütfen bilgilerinizi kontrol ediniz!");
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
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SifreYenilemeEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SifreYenilemeEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SifreYenileButton;
    private javax.swing.JPanel SifreYenilemeEkraniPanel;
    private javax.swing.JTextField TcText;
    private javax.swing.JTextField TelnoText;
    private javax.swing.JPasswordField eskisifreText;
    private javax.swing.JLabel eskisifrelabel;
    private javax.swing.JTextField guvenlikText;
    private javax.swing.JLabel guvenliklabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel sifreyenilemelabel;
    private javax.swing.JLabel tclabel;
    private javax.swing.JLabel tellabel;
    private javax.swing.JPasswordField yenisifreText;
    private javax.swing.JLabel yenisifrelabel;
    private javax.swing.JPasswordField yenisifretekrarText;
    private javax.swing.JLabel yenisifretekrarlabel;
    // End of variables declaration//GEN-END:variables
}
