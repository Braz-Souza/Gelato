/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gelato;

/**
 *
 * @author brazx
 */
public class Energetico extends Bebida{
    public String sabor;
    
    public Energetico(String nome, float valor, String marca, int tamanhoMl, int tempAdeqC, String sabor) {
        this.nome = nome;
        this.valor = valor;
        this.marca = marca;
        this.tamanhoMl = tamanhoMl;
        this.tempAdeqC = tempAdeqC;
        this.sabor = sabor;
    }   
}
