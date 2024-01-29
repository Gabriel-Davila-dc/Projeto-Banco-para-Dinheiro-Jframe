/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author gabri
 */
public class ContaBancaria {
    
    private String nomeCliente;
    private String senhaCliente;
    private int numConta;
    private double saldo = 0;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getSenhaCliente() {
        return senhaCliente;
    }

    public void setSenhaCliente(String senhaCliente) {
        this.senhaCliente = senhaCliente;
    }
   
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    // metodos
    
    public boolean sacar(double valor)
    {
    if(valor<=saldo && valor > 0)
    {
    saldo-=valor;
    return true;
    }
    return false;
    }
    public boolean depositar(double valor)
    {
        if(valor>0){saldo += valor; return true;}
        return false;
    
    }

    @Override
    public String toString() {
        String s = "ContaBancaria[";
        s+= " nome do Cliente: " + nomeCliente;
        s+= " numero da Conta: " + numConta;
        s +=" saldo: " + saldo;
        s+= "]";
        return s;  }
    
      
    
}

