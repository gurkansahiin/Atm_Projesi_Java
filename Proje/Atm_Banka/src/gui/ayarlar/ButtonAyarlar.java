/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.ayarlar;

import java.awt.Color;
import javax.swing.JButton;

/**
 *
 * ARKA PLAN VE YAZI RENGİ AYARLARI
 */
public class ButtonAyarlar {
    
    private  static  Color originalBgcolor;
    public static  void setBg(JButton button,Color bgcolor){
        
        originalBgcolor=button.getBackground();
        button.setBackground(bgcolor);
    }
    public static  void setOriginalBg(JButton button){
        
        
        button.setBackground(originalBgcolor);
    }
    
}
