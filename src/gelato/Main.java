/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gelato;

//import geladoBuilder.sorveteBuilder;

/**
 *
 * @author brazx
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Carrinho cart = new Carrinho();
        SingletonMenu menu = SingletonMenu.getInstancia();
        Console c = new Console();
        menu.carrinho(cart);
        c.run();
    }
}
