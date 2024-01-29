/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Scanner entradaop = new Scanner(System.in);

        ContaBancaria bancaria = new ContaBancaria();
        bancaria.setNomeCliente("Cliente Gabriel");
        bancaria.setNumConta(252525);
        ContaPoupanca poupanca = new ContaPoupanca();
        ContaEspecial especial = new ContaEspecial();
        especial.setLimite(500);
        
        System.out.println(bancaria);
        
        System.out.println("--Escolha uma alternativa--"
                            + "\n 1 - Sacar"
                            + "\n 2 - Depositar"
                            + "\n 3 - Mostrar dados"
                            + "\n 4 - Passar um dia"
                            + "\n 0 - Sair");
int op = entradaop.nextInt();
        while(op != 0)
         {
             switch(op) // principal
             {          
                case 1 -> {
                    System.out.println("1 - Especial"
                                    + "\n2 - poupanca");
                    
                    int op1 = entrada.nextInt();
                    if (op1 == 1)
                    {                                                          
                                    System.out.println("Valor para sacar:");
                                    double valor = entrada.nextDouble();
                                    
                                boolean sacou = especial.sacar(valor);
                                
                                if(sacou == true){System.out.println("Saque realizado com sucesso");}
                                else{System.out.println("Não foi possivel sacar");}
                                }
                                else    
                                {
                                    System.out.println("Valor para sacar:");
                                    double valor = entrada.nextDouble();
                                    
                                boolean sacou = poupanca.sacar(valor);
                                
                                if(sacou == true){System.out.println("Saque realizado com sucesso");}
                                else{System.out.println("Não foi possivel sacar");}
                                }
                                
                    
                }
                 case 2 -> {
                    System.out.println("1 - Especial"
                                     + "\n2 - poupanca");
                    op = entrada.nextInt();
                    switch (op)
                    { 
                        case 1:
                                {
                                    System.out.println("Valor para depositar:");
                                    double valor = entrada.nextDouble();
                                    boolean depositou = especial.depositar(valor);
                                    if(depositou == true){System.out.println("Deposito realizado com sucesso");}
                                    else{System.out.println("Não foi póssivel depositar");}
                                }break;
                        case 2 :
                                {
                                    System.out.println("Valor para depositar:");
                                    double valor = entrada.nextDouble();
                                    boolean depositou = poupanca.depositar(valor);
                                    if(depositou == true){System.out.println("Deposito realizado com sucesso");}
                                    else{System.out.println("Não foi póssivel depositar");}
                                }break;
                    }
                }
                                   
                case 3 -> {
                    System.out.println("----------------"
                                     + "\nsaldo: R$" + especial.getSaldo()
                                     + "\nRendimento do dia: R$" + poupanca.getSaldo()
                                     + "\nLimite do cheque Especial: R$" + especial.getLimite()
                                     + "\nUsando do Cheque especial: R$" + especial.getLimiteGasto()
                                     + "\n----------------");
                }
                case 4 -> {System.out.println("Passou um dia");
                            poupanca.calcularNovoSaldo();}
         }
             
             
             
             
             System.out.println("--Escolha uma alternativa--"
                            + "\n 1 - Sacar"
                            + "\n 2 - Depositar"
                            + "\n 3 - Mostrar dados"
                            + "\n 4 - Passar um dia"
                            + "\n 0 - Sair");
              op = entradaop.nextInt();
         }
        
        
        
        
    }
    public static void realizarSaque(ContaBancaria conta, double valor){
    
    }
}
