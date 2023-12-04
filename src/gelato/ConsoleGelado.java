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
        System.out.println("1 -> Sorvete\n2 -> Milkshake\n3 -> Voltar");
        opcao = input.nextInt();
        switch (opcao) {
            case 1:
                this.criarSorvete(cart);
                break;
            case 2:
                this.criarMilkshake(cart);
                break;
            case 3:
            default:
                break;
        }
    }
    
    public void criarSorvete(Carrinho cart) {
        sorveteBuilder criador = new sorveteBuilder();
        Produto sorvete;
        
        boolean run = true;
        int escolha;
        System.out.println(criador.getGelado());
        System.out.println("1 -> Adicionar Sabor\n2 -> Remover Sabor\n3 -> Adicionar Cobertura\n4 -> Remover Cobertura\n5 -> Comprar\n6 -> Voltar");
        opcao = input.nextInt();
        while (run){
            switch (opcao) {
                case 1:
                    System.out.println("Escolha um sabor:");
                    for (int i = 0; i < criador.getSabores().length; i++) {
                        System.out.println(String.format("%d -> %s", i, criador.getSabores()[i]));
                    }
                    escolha = input.nextInt();
                    criador.addSabor(escolha);
                    break;
                case 2:
                    criador.removeSabor();
                    break;
                case 3:
                    System.out.println("Escolha uma cobertura:");
                    for (int i = 0; i < criador.getCoberturas().length; i++) {
                        System.out.println(String.format("%d -> %s", i, criador.getCoberturas()[i]));
                    }
                    escolha = input.nextInt();
                    criador.addCobertura(escolha);
                    break;
                case 4:
                    criador.removeCobertura();
                    break;
                case 5:
                    sorvete = criador.getGelado();
                    cart.add(sorvete);
                case 6:
                default:
                    run = false;
                    break;
            }
            if (run) {
                System.out.println(criador.getGelado());
                System.out.println("1 -> Adicionar Sabor\n2 -> Remover Sabor\n3 -> Adicionar Cobertura\n4 -> Remover Cobertura\n5 -> Comprar\n6 -> Voltar");
                opcao = input.nextInt();
            }
        }
    }
    
    public void criarMilkshake(Carrinho cart) {
        milkshakeBuilder criador = new milkshakeBuilder();
        Produto milkshake;
        
        boolean run = true;
        int escolha;
        System.out.println(criador.getGelado());
        System.out.println("\n1 -> Escolher sabor\n2 -> Trocar tamanho\n3 -> Adicionar Cobertura\n4 -> Remover Cobertura\n5 -> Adicionar no carrinho\n6 -> Voltar");
        opcao = input.nextInt();
        while (run){
            switch (opcao) {
                case 1:
                    System.out.println("Escolha um sabor:");
                    for (int i = 0; i < criador.getSabores().length; i++) {
                        System.out.println(String.format("%d -> %s", i, criador.getSabores()[i]));
                    }
                    escolha = input.nextInt();
                    criador.setSabor(escolha);
                    break;
                case 2:
                    System.out.println("Escolha um tamanho:");
                    for (int i = 0; i < criador.getTamanhos().length; i++) {
                        System.out.println(String.format("%d -> %d Ml", i, criador.getTamanhos()[i]));
                    }
                    escolha = input.nextInt();
                    criador.mudarTamanho(escolha);
                    break;
                case 3:
                    System.out.println("Escolha uma cobertura:");
                    for (int i = 0; i < criador.getCoberturas().length; i++) {
                        System.out.println(String.format("%d -> %s", i, criador.getCoberturas()[i]));
                    }
                    escolha = input.nextInt();
                    criador.addCobertura(escolha);
                    break;
                case 4:
                    criador.removeCobertura();
                    break;
                case 5:
                    milkshake = criador.getGelado();
                    cart.add(milkshake);
                case 6:
                default:
                    run = false;
                    break;
            }
            if (run) {
                System.out.println(criador.getGelado());
                System.out.println("\n1 -> Escolher sabor\n2 -> Trocar tamanho\n3 -> Adicionar Cobertura\n4 -> Remover Cobertura\n5 -> Adicionar no carrinho\n6 -> Voltar");
                opcao = input.nextInt();
            }
        }
        
    }
}
