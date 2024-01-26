/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.ayarlar;

import java.awt.Component;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class TextAyarlar {

    public static String originaltext;

    //TEXT ODAKLANMA AYARLARI
    public static void ChecktheTextFocusGained(JTextField textField, String org) {

        originaltext = org;
        if (textField.getText().trim().equals(org)) {
            textField.setText("");
        }
    }

    public static void ChecktheTextFocusLost(JTextField textField) {

        if (textField.getText().trim().equals("")) {
            textField.setText(originaltext);
        }
    }

    //KEY AYARLARI
    public static void setOnlyNumber(JTextField textField) {
        textField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {

                char c = e.getKeyChar();

                //girilen karakterin rakam olp olmadığını kontrol ediyor
                if (!Character.isDigit(c)) {
                    e.consume();
                }
            }

        });
    }

 public static void setOnlyAlphabetic(JTextField textField) {
    textField.addKeyListener(new KeyAdapter() {
        @Override
        public void keyTyped(KeyEvent e) {
            char c = e.getKeyChar();

            // Girilen karakterin harf veya boşluk karakteri olup olmadığını kontrol ediyor
            if (!(Character.isAlphabetic(c) || Character.isSpaceChar(c))) {
                e.consume();
            }
        }
    });
}


    //LİMİT AYARLARI
    private static int limit;

    public static void setmaxlimit(JTextField textField, int lim) {
        limit = lim;
        textField.setDocument(new PlainDocument() {
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {

                if (str == null) {
                    return;
                }
                if ((getLength() + str.length()) <= limit) {
                    
                    super.insertString(offs, str, a);

                }
            }

        });

    }
    
    
    public static boolean uzunlukSundanKucukmu(int length,String str){
        return (str.length()<length);
    }
    //Para Miktarı Ayarları
    
   public static int CheckTextKeyReleased(JTextField textField, int minLimit, int maxLimit) {
    String text = textField.getText();
    if (!text.equals("")) {
        try {
            int miktar = Integer.parseInt(text);
            
            // Minimum kontrolü
            if (miktar < minLimit) {
                miktar = minLimit;
                textField.setText(String.valueOf(miktar));
            }
            
            // Maksimum kontrolü
            if (miktar > maxLimit) {
                miktar = maxLimit;
                textField.setText(String.valueOf(miktar));
            }
            
            return miktar;
        } catch (NumberFormatException e) {
            // Eğer sayıya dönüştürme başarısız olursa buraya düşer
            // Kullanıcı sayısal olmayan bir değer girmiş olabilir, bu durumu ele alabilirsiniz.
            // Örneğin, kullanıcıya bir uyarı mesajı gösterebilirsiniz.
            System.err.println("Geçersiz bir sayı girişi yapıldı!");
        }
    }
    return 0;
}
 
   
  public static int CheckTextKeyReleased(JTextField textField, int paralimit) {
    String text = textField.getText();
    if (!text.equals("")) {
        try {
            int miktar = Integer.parseInt(text);
            if (miktar > paralimit) {
                miktar = paralimit;
                textField.setText(String.valueOf(miktar));
            }
            return miktar;
        } catch (NumberFormatException e) {
            // Eğer sayıya dönüştürme başarısız olursa buraya düşer
            // Kullanıcı sayısal olmayan bir değer girmiş olabilir, bu durumu ele alabilirsiniz.
            // Örneğin, kullanıcıya bir uyarı mesajı gösterebilirsiniz.
            System.err.println("Geçersiz bir sayı girişi yapıldı!");
        }
    }
    return 0;
}

    
    //Text alanları methodu
    
    public static boolean textAlanlariDolumu(JPanel panel ) {
        Component[] components=panel.getComponents();
        
        for (Component c:components) {
            
            if(c instanceof JTextField) {
                
                JTextField textField= (JTextField) c;
                if (textField.getText().trim().equals("") && textField.isEnabled()) {
                    return false;
                }
            }
        }
        return true;
    }
}
