/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author gabri
 */
public class ContaPoupanca extends ContaBancaria {
    
    private double diaRendimento;

    public double getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
    
    
    // metodos

    @Override
    public String toString() {
        String s = "Conta Poupanca[";
        s+= " rendimento do dia: " + this.diaRendimento;
        super.toString();
        s+= "]";
        return s;  }
    
    
    
    public void calcularNovoSaldo(){
        this.diaRendimento =super.getSaldo() + ((super.getSaldo() + diaRendimento) * 0.03);
        super.setSaldo( this.diaRendimento);
    }
    
}
