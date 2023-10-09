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

        // Criando agua
        Produto aguaMineral;
        aguaMineral = new Agua("Agua sem gás", 2.99f, "Cristal", 500, 25, true);
        System.out.println(aguaMineral.toString());
        
        // Criando agua
        Produto sorveteMorango;
        sorveteMorango = new Sorvete("Sorvete de morango", 4.49f, "Morango", "Sem cobertura", true, 1);
        System.out.println(sorveteMorango.toString());
    }

}
