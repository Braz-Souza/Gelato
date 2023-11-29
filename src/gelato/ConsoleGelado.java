/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gelato;

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
                this.criarMilkshake();
                break;
            case 3:
            default:
                break;
        }
    }
    
    public void criarSorvete(Carrinho cart) {
        sorveteBuilder criadorSorvete = new sorveteBuilder();
        Produto sorvete;
        
        boolean run = true;
        int escolha;
        System.out.println(String.format("Valor do sorvete é %f", criadorSorvete.getValor()));
        System.out.println("1 -> Adicionar Sabor\n2 -> Remover Sabor\n3 -> Adicionar Cobertura\n4 -> Remover Cobertura\n5 -> Comprar\n6 -> Voltar");
        opcao = input.nextInt();
        while (run){
            switch (opcao) {
                case 1:
                    System.out.println("Escolha um sabor:");
                    for (int i = 0; i < criadorSorvete.getSabores().length; i++) {
                        System.out.println(String.format("%d -> %s", i, criadorSorvete.getSabores()[i]));
                    }
                    escolha = input.nextInt();
                    criadorSorvete.addSabor(escolha);
                    break;
                case 2:
                    criadorSorvete.removeSabor();
                    break;
                case 3:
                    System.out.println("Escolha uma cobertura:");
                    for (int i = 0; i < criadorSorvete.getCoberturas().length; i++) {
                        System.out.println(String.format("%d -> %s", i, criadorSorvete.getCoberturas()[i]));
                    }
                    escolha = input.nextInt();
                    criadorSorvete.addCobertura(escolha);
                    break;
                case 4:
                    criadorSorvete.removeCobertura();
                    break;
                case 5:
                    sorvete = criadorSorvete.getSorvete();
                    cart.add(sorvete);
                case 6:
                default:
                    run = false;
                    break;
            }
            if (run) {
                System.out.println(String.format("Valor do sorvete é %f", criadorSorvete.getValor()));
                System.out.println("1 -> Adicionar Sabor\n2 -> Remover Sabor\n3 -> Adicionar Cobertura\n4 -> Remover Cobertura\n5 -> Comprar\n6 -> Voltar");
                opcao = input.nextInt();
            }
        }
        
    }

    private void criarMilkshake() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
