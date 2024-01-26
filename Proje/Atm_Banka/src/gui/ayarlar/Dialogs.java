/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.ayarlar;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author GÜRKAN ŞAHİN
 */
public class Dialogs {
    
    public static void bosOlamazMesajıGöster(JFrame frame) {
        
        JOptionPane.showMessageDialog(frame, "Tüm alanlar dolu olmalıdır!");
    }
    
    public static void OzelMesajGöster(JFrame frame,String mesaj) {
        
        JOptionPane.showMessageDialog(frame, mesaj);
    }
    
    public static int onaymesajıgoster(JFrame frame,String message){
        int optiontype=JOptionPane.YES_NO_OPTION;
        int selected=JOptionPane.showConfirmDialog(frame, message,"Uyarı",optiontype);
        
        if (optiontype==selected) {
            return  1;
        }
        return 0;
    }
}
