/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

/**
 *
 * @author gabri
 */
public class ContaEspecial extends ContaBancaria {
    private double limite;
    private double limiteGasto;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimiteGasto() {
        return limiteGasto;
    }

    public void setLimiteGasto(double limiteGasto) {
        this.limiteGasto = limiteGasto;
    }
    
    
    
    public boolean sacar(double valor)
    {
    if(valor<=super.getSaldo() && valor > 0)
    {
        super.setSaldo(super.getSaldo() - valor);
        return true;
    }
    else if(valor > 0 && valor < (super.getSaldo() + (limite - limiteGasto)))
    {
    valor -= super.getSaldo();
    super.setSaldo(0);
    limiteGasto += valor;
    }
    return false;
    }

    
    
}

    

