package Janelas;


import DAO.UsuarioDAO;
import DTO.ContaBancaria;
import Janelas.Janela1;
import Janelas.Janela2;
import Janelas.JanelaCadastrar3;
import Janelas.JanelaDepositar4;
import Janelas.JanelaSacar5;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabri
 */
public class Principal {
    
  
    
    public static void main(String[] args) {
               
                Janela1 j1 = new Janela1();
                j1.setVisible(true);      
                
            
        ContaBancaria objContaBancaria = new ContaBancaria();
        
        
       
        
    }
    
     public static void paginasExistantes(){
     
     
     }
    
    public static void paginaAberta(int p)
    {      
        switch (p) 
        {
            case 1:
                JanelasInvisiveis();           
                Janela1 j1 = new Janela1();             
                j1.setVisible(true); 
     
                break;
                
            case 2:               
                JanelasInvisiveis();
                Janela2 j2 = new Janela2();
                j2.setVisible(true);
                break;
                
            case 3:
                JanelasInvisiveis();
                JanelaCadastrar3 jCadastrar = new JanelaCadastrar3();
                jCadastrar.setVisible(true); 
                break;
                
            case 4:
                JanelasInvisiveis();
                JanelaDepositar4 jDepositar = new JanelaDepositar4();
                jDepositar.setVisible(true);
                break;
                
            case 5: 
                JanelasInvisiveis();
                JanelaSacar5 jSacar = new JanelaSacar5();
                jSacar.setVisible(true);
                break;
        }
    }
    
    public static void JanelasInvisiveis()
    {
    Janela1 j1 = new Janela1();
        j1.setVisible(false);
        
        Janela2 j2 = new Janela2();
        j1.setVisible(false);
        
        JanelaCadastrar3 jCadastrar = new JanelaCadastrar3();
        j1.setVisible(false);
        
        JanelaDepositar4 jDepositar = new JanelaDepositar4();
        j1.setVisible(false);
        
        JanelaSacar5 jSacar = new JanelaSacar5();
        j1.setVisible(false);
    }
    
    public static boolean logar(String usuarioT, String senhaT) {                                          
        
        try {
            
        
        ContaBancaria objContaBancaria = new ContaBancaria();
        objContaBancaria.setNomeCliente(usuarioT);
        objContaBancaria.setSenhaCliente(senhaT);
       
         UsuarioDAO objUsuarioDAO = new UsuarioDAO();
        
        ResultSet resultadoLogin = objUsuarioDAO.autenticacaoUsuario(objContaBancaria);
        
        if(resultadoLogin.next())
        {
        
        }   
        
        

        } catch (SQLException e) {
            JOptionPane.showInternalMessageDialog(null, "JANELA1" + e);
        }
         return false;
    }
    
}
