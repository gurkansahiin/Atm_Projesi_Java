/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.ayarlar;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class IconAyarlari {
    
    private static Icon originalİcon;
    
    public static void ChangeIcon(JLabel label, String filename) {
    try {
        originalİcon = label.getIcon();
        Icon newIcon = new ImageIcon(IconAyarlari.class.getResource("/gui/iconlar/" + filename + ".png"));
        label.setIcon(newIcon);
    } catch (Exception ex) {
        ex.printStackTrace(); // Hata ayıklama amacıyla hatayı ekrana yazdırabilirsiniz
    }
}

    
     public static void SetOrginalİcon(JLabel label) {
        
        label.setIcon(originalİcon);
        
    }
}
