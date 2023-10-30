/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gelato;

/**
 *
 * @author brazx
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Carrinho carrinho = new Carrinho();
        System.out.println(carrinho.toString());
        System.out.println("-----");
        
        carrinho.add(0);
        carrinho.print();
        System.out.println("-----");
        
        carrinho.add(1);
        carrinho.print();
        System.out.println("-----");
        
        carrinho.add(0);
        carrinho.print();
        System.out.println("-----");
        
        carrinho.del(1);
        carrinho.print();
        System.out.println("-----");
        
        carrinho.buy();
        System.out.println("-----");
        
        carrinho.print();
        System.out.println("-----");
        
        carrinho.buy();
    }
}
