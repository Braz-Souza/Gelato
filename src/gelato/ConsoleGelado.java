/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gelato;

import geladoBuilder.milkshakeBuilder;
import geladoBuilder.sorveteBuilder;
import java.util.Scanner;

/**
 *
 * @author brazx
 */
public class ConsoleGelado{
    Scanner input = new Scanner(System.in);
    int opcao;
    
    public ConsoleGelado() {
    }
    
    public void run(Carrinho cart) {
        System.out.println("\n+----------------------+");
        System.out.println("|       Gelados        |");
        System.out.println("+----------------------+");
        System.out.println("|1 - Criar Sorvete     |");
        System.out.println("|2 - Criar Milkshake   |");
        System.out.println("|0 - Voltar            |");
        System.out.println("+----------------------+");
        System.out.print("\nEscolha a opção desejada: ");

  
        opcao = input.nextInt();
        switch (opcao) {
            case 1:
                this.criarSorvete(cart);
                break;
            case 2:
                this.criarMilkshake(cart);
                break;
            case 0:
            default:
                break;
        }
    }
    
    public void criarSorvete(Carrinho cart) {
        sorveteBuilder criador = new sorveteBuilder();
        Produto sorvete;
        
        boolean run = true;
        int escolha;
        
        System.out.println("\n+--------------------------+");
        System.out.println("|          Sorvete         |");
        System.out.println("+--------------------------+\n");
        System.out.println(criador.getGelado());
        System.out.println("\n+--------------------------+");
        System.out.println("|1 - Adicionar Sabor       |");
        System.out.println("|2 - Remover Sabor         |");
        System.out.println("|3 - Adicionar Cobertura   |");
        System.out.println("|4 - Remover Cobertura     |");
        System.out.println("|5 - Adicionar no carrinho |");
        System.out.println("|0 - Voltar                |");
        System.out.println("+--------------------------+");
        System.out.print("\nEscolha a opção desejada: ");
        opcao = input.nextInt();
        while (run){
            switch (opcao) {
                case 1:
                    
                    for (int i = 0; i < criador.getSabores().length; i++) {
                        System.out.println(String.format("%d -> %s", i, criador.getSabores()[i]));
                    }
                    System.out.println("\nEscolha um sabor:");
                    escolha = input.nextInt();
                    criador.addSabor(escolha);
                    break;
                case 2:
                    criador.removeSabor();
                    break;
                case 3:
                    
                    for (int i = 0; i < criador.getCoberturas().length; i++) {
                        System.out.println(String.format("%d -> %s", i, criador.getCoberturas()[i]));
                    }
                    System.out.println("\nEscolha uma cobertura:");
                    escolha = input.nextInt();
                    criador.addCobertura(escolha);
                    break;
                case 4:
                    criador.removeCobertura();
                    break;
                case 5:
                    sorvete = criador.getGelado();
                    cart.add(sorvete);
                case 0:
                default:
                    run = false;
                    break;
            }
            if (run) {
                
                System.out.println("\n+--------------------------+");
                System.out.println("|          Sorvete         |");
                System.out.println("+--------------------------+\n");
                System.out.println(criador.getGelado());
                System.out.println("\n+--------------------------+");
                System.out.println("|1 - Adicionar Sabor       |");
                System.out.println("|2 - Remover Sabor         |");
                System.out.println("|3 - Adicionar Cobertura   |");
                System.out.println("|4 - Remover Cobertura     |");
                System.out.println("|5 - Adicionar no carrinho |");
                System.out.println("|0 - Voltar                |");
                System.out.println("+--------------------------+");
                System.out.print("\nEscolha a opção desejada: ");
                opcao = input.nextInt();
            }
        }
    }
    
    public void criarMilkshake(Carrinho cart) {
        milkshakeBuilder criador = new milkshakeBuilder();
        Produto milkshake;
        
        boolean run = true;
        int escolha;
        
        System.out.println("\n+--------------------------+");
        System.out.println("|         Milkshake        |");
        System.out.println("+--------------------------+\n");
        System.out.println(criador.getGelado());
        System.out.println("\n+--------------------------+");
        System.out.println("|1 - Escolher sabor        |");
        System.out.println("|2 - Trocar tamanho        |");
        System.out.println("|3 - Adicionar Cobertura   |");
        System.out.println("|4 - Remover Cobertura     |");
        System.out.println("|5 - Adicionar no carrinho |");
        System.out.println("|0 - Voltar                |");
        System.out.println("+--------------------------+");
        System.out.print("\nEscolha a opção desejada: ");
        opcao = input.nextInt();
        while (run){
            switch (opcao) {
                case 1:
                    
                    for (int i = 0; i < criador.getSabores().length; i++) {
                        System.out.println(String.format("%d -> %s", i, criador.getSabores()[i]));
                    }
                    System.out.println("\nEscolha um sabor:");
                    escolha = input.nextInt();
                    criador.setSabor(escolha);
                    break;
                case 2:
                    
                    for (int i = 0; i < criador.getTamanhos().length; i++) {
                        System.out.println(String.format("%d -> %d Ml", i, criador.getTamanhos()[i]));
                    }
                    System.out.println("\nEscolha um tamanho:");
                    escolha = input.nextInt();
                    criador.mudarTamanho(escolha);
                    break;
                case 3:
                    
                    for (int i = 0; i < criador.getCoberturas().length; i++) {
                        System.out.println(String.format("%d -> %s", i, criador.getCoberturas()[i]));
                    }
                    System.out.println("\nEscolha uma cobertura:");
                    escolha = input.nextInt();
                    criador.addCobertura(escolha);
                    break;
                case 4:
                    criador.removeCobertura();
                    break;
                case 5:
                    milkshake = criador.getGelado();
                    cart.add(milkshake);
                case 0:
                default:
                    run = false;
                    break;
            }
            if (run) {
                System.out.println("\n+--------------------------+");
                System.out.println("|         Milkshake        |");
                System.out.println("+--------------------------+\n");
                System.out.println(criador.getGelado());
                System.out.println("\n+--------------------------+");
                System.out.println("|1 - Escolher sabor        |");
                System.out.println("|2 - Trocar tamanho        |");
                System.out.println("|3 - Adicionar Cobertura   |");
                System.out.println("|4 - Remover Cobertura     |");
                System.out.println("|5 - Adicionar no carrinho |");
                System.out.println("|0 - Voltar                |");
                System.out.println("+--------------------------+");
                System.out.print("\nEscolha a opção desejada: ");
                opcao = input.nextInt();
            }
        }
        
    }
}
