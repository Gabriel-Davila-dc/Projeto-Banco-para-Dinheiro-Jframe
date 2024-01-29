/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Janelas.Util;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

/**
 *
 * @author gabri
 */
public class LimitaCaracteres extends PlainDocument {

    public enum TipoEntrada {
        NUMERODECIMAL
    }

    private TipoEntrada tpEntrada;
    private int qtdCaracteres;
  

    public LimitaCaracteres( int qtdCaracteres, TipoEntrada tpEntrada) {
     
        this.tpEntrada = tpEntrada;
           this.qtdCaracteres = qtdCaracteres;
    }


    @Override
    public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        
        if(str == null || getLength() == qtdCaracteres){
            return;
        }
        int totalCarac = getLength() + str.length();
        
        // tipo de caracteres 
        
      String regex = "";
      
        switch (tpEntrada) {
            case NUMERODECIMAL: regex = "[^0-9,.]"; break;
        }
        
        str = str.replaceAll(regex, "");
        
        super.insertString(offs, str, a); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

 
}
