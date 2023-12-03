/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gelato;

import java.util.Scanner;

/**
 *
 * @author brazx
 */
public class Console {
    Scanner input = new Scanner(System.in);
   // Carrinho carrinho;
    
    public Console() {
     //   this.carrinho = cart;
    }
    
    SingletonMenu menu = SingletonMenu.getInstancia();
    
    
    public void run() {
        this.printWelcome();
        boolean run = true;
        
        
        this.login();
        int opcao = input.nextInt();
        while (run) {
            switch (opcao) {
                case 1:
                    menu.mainMenu();
                    break;
                case 2:
                    menu.MenuF();
                    break;
                case 0:
                    run = false;
                    break;
                default:
                    System.out.println("Opção inválida!\n");
            }
            if (run) {
                this.login();
                opcao = input.nextInt();
            }
        }
    }
    
    private void printWelcome() {
        System.out.println("+---------------------------------------+");
        System.out.println("| Seja Bem Vindo a Sorveteria Gelato!!! |");
        System.out.println("+---------------------------------------+");
    }
    
    private void login() {
        System.out.println("+----------------------+");
        System.out.println("|     Tela de Login    |");
        System.out.println("+----------------------+");
        System.out.println("|Entrar como:          |");        
        System.out.println("|1 - Cliente           |");
        System.out.println("|2 - Funcionario       |");
        System.out.println("|0 - Sair              |");
        System.out.println("+----------------------+");
        System.out.print("Escolha a opção desejada: ");
    }
    
}
