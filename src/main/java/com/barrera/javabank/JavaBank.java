/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.barrera.javabank;
import java.util.Scanner;
/**
 *
 * @author RedGO
 */

class DadosPessoais {
     private String nome;
     private String sobrenome;
     private String cpf;
     
     public String getNome() { return nome; } 
     public void setNome(String nome) { this.nome = nome; } 
     
     public String getSobrenome() { return sobrenome; } 
     public void setSobrenome(String sobrenome) { this.sobrenome = sobrenome; }
     
     public String getCpf() { return cpf; } 
     public void setCpf(String cpf) { this.cpf = cpf; }

}

class OperacoesBancarias extends DadosPessoais { 
    private double saldo;
   public double consultarSaldo() { 
       return saldo; 
   } 
   public void depositar(double valor) { 
       if (valor > 0) { 
           saldo += valor; System.out.println("Depósito realizado com sucesso!"); 
       } else { System.out.println("Valor de depósito inválido."); } } 
   
   public void retirar(double valor) {
       if (valor > 0 && valor <= saldo) { 
           saldo -= valor; System.out.println("Retirada realizada com sucesso!"); 
       } else { System.out.println("Valor de retirada inválido ou saldo insuficiente."); } } }


public class JavaBank {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in); 
       
       OperacoesBancarias conta = new OperacoesBancarias(); 
        System.out.print("Informe seu nome: ");
        conta.setNome(scanner.nextLine()); 
        System.out.print("Informe seu sobrenome: "); 
        conta.setSobrenome(scanner.nextLine()); 
        System.out.print("Informe seu CPF: "); 
        conta.setCpf(scanner.nextLine()); 
        
        int escolha;
        do { 
            System.out.println("\nMenu de Operacões Bancárias:"); 
            System.out.println("1. Consultar Saldo"); 
            System.out.println("2. Depositar"); 
            System.out.println("3. Retirar"); 
            System.out.println("4. Sair"); 
            System.out.print("Escolha uma opção: "); 
            escolha = scanner.nextInt(); 
            
            switch (escolha) { 
                case 1: 
                    System.out.println("Saldo atual: " + conta.consultarSaldo()); 
                    break;
                case 2: System.out.print("Valor para depósito: "); 
                double deposito = scanner.nextDouble();
                conta.depositar(deposito); 
                break; 
                case 3: System.out.print("Valor para retirada: ");
                double retirada = scanner.nextDouble(); 
                conta.retirar(retirada); 
                break; 
                case 4: System.out.println("Obrigado por utilizar nossos serviços"); 
                break; 
                default: System.out.println("Opção inválida. Tente novamente.");
            } 
        } while (escolha != 4); 
        scanner.close();
    }
}
