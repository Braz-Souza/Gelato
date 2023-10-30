/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gelato;

import java.util.Scanner;
import products.Produto;

/**
 *
 * @author brazx
 */
public class Console {
    Scanner input = new Scanner(System.in);
    Carrinho carrinho;
    private Produto[] menuTeste;
    
    public Console(Carrinho cart) {
        this.carrinho = cart;
    }
    
    public void run() {
        this.printWelcome();
        boolean run = true;
        while (run) {
            this.printMainMenu();
            int opcao = input.nextInt();
            this.separate();
            
            switch (opcao) {
                case 1:
                    verCardapio();
                    break;
                case 2:
                    this.verCart();
                    break;
                case 3:
                    this.addCart();
                    break;
                case 4:
                    this.delCart();
                    break;
                case 5:
                    this.buy();
                    break;
                case 6:
                    run = false;
                    break;
                default:
                    System.out.println("Opção inválida!\n");
            }
        }
    }
    
    private void printWelcome() {
        System.out.println("+---------------------------------------+");
        System.out.println("| Seja Bem Vindo a Sorveteria Gelato!!! |");
        System.out.println("+---------------------------------------+");
    }
    
    private void printMainMenu() {
        System.out.println("+----------------------+");
        System.out.println("|   Escolha uma opção  |");
        System.out.println("+----------------------+");
        System.out.println("|1 - Ver cardapio      |");
        System.out.println("|2 - Ver carrinho      |");
        System.out.println("|3 - Adicionar carrinho|");
        System.out.println("|4 - Remover carrinho  |");
        System.out.println("|5 - Finalizar compra  |");
        System.out.println("|6 - Sair              |");
        System.out.println("+----------------------+");
        System.out.print("Escolha a opção desejada: ");
    }
    
    private void separate() {
        System.out.println("+----------------------+\n");
    }
        
    private void verCardapio() {
        // Trocar depois
        this.cardapioPlaceholder();
    }
    
    // REMOVER DEPOIS 
    private void cardapioPlaceholder() {
        this.menuTeste = new Produto[]{
            new ProdutoBuilder("Agua", 2.99f).setTamanhoMl(500).buildBebida(), 
            new ProdutoBuilder("Sorvete de morango", 5.99f).setSabor("Morango").buildGelado(), 
            new ProdutoBuilder("Milkshake de Baunilha", 9.99f).setSabor("Baunilha").buildGelado(), 
            new ProdutoBuilder("Coca-Cola", 2.76f).buildBebida(), 
            new ProdutoBuilder("Agua", 10.50f).setTamanhoMl(2000).buildBebida(),
        };
        
        System.out.println("Cardápio: ");
        System.out.println(" 0 -> Agua 500ML - 2.99R$");
        System.out.println(" 1 -> Sorvete de morango - 5.99R$");
        System.out.println(" 2 -> Milkshake de Baunilha - 9.99R$");
        System.out.println(" 3 -> Coca-Cola - 2.76R$");
        System.out.println(" 4 -> Agua 2L - 10.50R$");
    }
    
    private void verCart() {
        carrinho.print();
    }

    private void addCart() {
        this.verCardapio();
        System.out.println("Escolha o número do item no cardápio para adicionar no carrinho: ");
        int opcao = input.nextInt();
        carrinho.add(opcao);
    }

    private void delCart() {
        this.verCart();
        System.out.println("Escolha o número do item no carrinho para remover: ");
        int opcao = input.nextInt();
        carrinho.del(opcao);
    }

    private void buy() {
        carrinho.buy();
    }
}
